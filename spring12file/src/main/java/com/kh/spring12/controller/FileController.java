package com.kh.spring12.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring12.dao.AttachDao;
import com.kh.spring12.dto.AttachDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
	
	@Autowired
	private AttachDao attachDao;
	
	@PostMapping("/upload")
	public String upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
		log.info("name = {}", attach.getName());//전송된 이름(파일명X)
		log.info("origin = {}", attach.getOriginalFilename());//파일명
		log.info("size = {}", attach.getSize());//파일크기(byte)
		log.info("contentType = {}", attach.getContentType());//파일유형
		
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
		return "페이지정보";
	}
}
