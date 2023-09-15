package com.kh.spring12.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring12.dao.AttachDao;
import com.kh.spring12.dto.AttachDto;

//비동기 통신에 대한 업로드를 처리하기 위한 컨트롤러
@CrossOrigin
@RestController
@RequestMapping("/restfile")
public class FileRestController {

	@Autowired
	private AttachDao attachDao;
	
	//비동기 통신에서는 화면에서 다음 작업이 가능하도록 파일번호 등을
	@PostMapping("/upload")
	public Map<String, Object> upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException{
		//절대규칙: 파일은 하드디스크에, 정보는 DB에 저장
		
		//[1] 시퀀스 번호 생성
		int attachNo = attachDao.sequence();
		
		//[2] 같은 이름에 대한 충돌을 방지하기 위해 
		String home = System.getProperty("user.home");
		File dir = new File(home, "upload");//저장할 디렉토리
		dir.mkdirs();//디렉토리 생성
		
		File target = new File(dir, String.valueOf(attachNo));//저장할 파일 객체
		attach.transferTo(target);//저장
		
		//[3] DB에 저장한 파인의 이벤트 정보를 모와 insert
		AttachDto attachDto = new AttachDto();
		attachDto.setAttachNo(attachNo);
		attachDto.setAttachName(attach.getOriginalFilename());
		attachDto.setAttachSize(attach.getSize());
		attachDto.setAttachType(attach.getContentType());
		
		attachDao.insert(attachDto);
		
		//화면에서 사용할 수 있도록 파일번호 또는 다운주소를 반환
		//return 객체 or Map;
		return Map.of("attachNo", attachNo);
	}
	
	//다운로드는 동기, 비동기 다르지 않음(파일번호만 알면 됨)
	@RequestMapping("/download")
	public ResponseEntity<ByteArrayResource> download(@RequestParam int attachNo) throws IOException{
		AttachDto attachDto = attachDao.selectOne(attachNo);
		
		if(attachDto == null) {
			return ResponseEntity.notFound().build();
		}
		
		String home = System.getProperty("user.home");
		File dir = new File(home, "upload");
		File target = new File(dir, String.valueOf(attachDto.getAttachNo()));
		
		byte[] data = FileUtils.readFileToByteArray(target);
		ByteArrayResource resource = new ByteArrayResource(data);
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_ENCODING, StandardCharsets.UTF_8.name())
				.contentLength(attachDto.getAttachSize())
				.header(HttpHeaders.CONTENT_TYPE, attachDto.getAttachType())
				.header(HttpHeaders.CONTENT_DISPOSITION, 
						ContentDisposition.attachment().filename(attachDto.getAttachName(), StandardCharsets.UTF_8).build().toString())
			.body(resource);
	}
}
