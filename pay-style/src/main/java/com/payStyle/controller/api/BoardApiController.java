package com.payStyle.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payStyle.config.auth.PrincipalDetail;
import com.payStyle.dto.ResponseDto;
import com.payStyle.model.Board;
import com.payStyle.service.BoardService;

@RestController
public class BoardApiController {
	@Autowired
	private BoardService boardService;	
	
	//자유게시판 글작성
	@PostMapping("/api/board")
	public ResponseDto<Integer> save(@RequestBody Board board, 
			@AuthenticationPrincipal PrincipalDetail principal ) {
		boardService.게시판글쓰기(board,principal.getUser());
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	//자유게시판 글삭제
	@DeleteMapping("/api/board/{id}")
	public ResponseDto<Integer> deleteById(@PathVariable int id){
		System.out.println(id);
		boardService.게시판글삭제하기(id);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	//자유게시판 글수정
	@PutMapping("/api/board/{id}")
	public ResponseDto<Integer> update(@PathVariable int id,@RequestBody Board board){
		System.out.println("BoardApiController:update id"+id);
		System.out.println("BoardApiController:update title"+board.getTitle());
		boardService.게시판글수정하기(id,board);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}

}
