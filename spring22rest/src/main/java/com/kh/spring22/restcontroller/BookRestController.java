package com.kh.spring22.restcontroller;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;
import com.kh.spring22.dto.PocketmonDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "도서 리엑트용 백엔드", description = "도서 관리")

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	private BookDao bookDao;
	
	@Operation(
			description = "도서 조회",
			responses = {
				@ApiResponse(
						responseCode = "200",
						description = "조회 성공",
						content = {
							@Content(
								mediaType = "application/json",
								array = @ArraySchema(
									schema = @Schema(implementation = BookDto.class)
								)
							)
						}
					),
				@ApiResponse(
					responseCode = "500",
					description = "서버 오류",
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = @ExampleObject("server error")
					)
				)
			}
		)
	
	//조회
	@GetMapping("/")
	public List<BookDto> findAll(){
		return bookDao.selectList();
	}
	
	@Operation(
			description = "도서 신규 등록",
			responses = {
				@ApiResponse(
						responseCode = "200",
						description = "도서 등록 완료"
					),
				@ApiResponse(
						responseCode = "400",
						description = "전송한 파라미터가 서버에서 요구하는 값과 다름"
					),
				@ApiResponse(
						responseCode = "500",
						description = "서버 오류 발생"
					)
			}
		)
	
	//등록
	// RequestBody : application-json
	// ModelAttribute : form-data
	@PostMapping("/")
	public void insert(
							@Parameter(
								description = "등록할 도서 제목/저자/출판일/가격/출판사/장르 객체",
								required = true,
								schema = @Schema(implementation = BookDto.class)	
							)
							@RequestBody BookDto bookDto) {
		bookDao.insert(bookDto);
	}
	
	//삭제
	@DeleteMapping("/{bookId}")
	public ResponseEntity<String> deleteByBookId (@PathVariable int bookId){
		boolean result = bookDao.delete(bookId);
		if(result) {
			return ResponseEntity.status(200).build();
		}else {
			return ResponseEntity.status(404).build();
		}
	}
	
	//상세 조회
	@GetMapping("/bookId/{bookId}")
	public ResponseEntity<BookDto> findByBookId(@PathVariable int bookId){
		BookDto bookDto = bookDao.selectOne(bookId);
		if(bookDto != null) {
			return ResponseEntity.ok(bookDto);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	//전체 수정
	@PutMapping("/{bookId}")
	public void edit(@PathVariable int bookId, @RequestBody BookDto bookDto){
		//bookDto에 모든 항목이 있는지 검사해야 함
		bookDao.edit(bookId, bookDto);
	}
	
	//개별 수정
	@PatchMapping("/{bookId}")
	public void change(@PathVariable int bookId, @RequestBody BookDto bookDto){
		//bookDto에 항목이 하나라도 있는지 검사해야 함
		bookDao.change(bookId, bookDto);
	}
	
	//도서명 검색
	@GetMapping("/bookTitle/{bookTitle}")
	public List<BookDto> findByBookTitle(@PathVariable String bookTitle){
		return bookDao.bookTitleList(bookTitle);
	}
}