package com.payStyle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.payStyle.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
			//게시글 목록
			@GetMapping({"/auth/board"})
			public String index(Model model,@PageableDefault(size=3,sort="id",direction=Sort.Direction.DESC) Pageable pageable) {
				System.out.println("a");				
				model.addAttribute("boards", boardService.게시판글목록(pageable));		
				return "board/board"; 
			}
			//게시글 작성
			//USER 권한이 필요
			@GetMapping({"/auth/board/boardSaveForm"})
			public String boardSaveForm() {
				return "board/boardSaveForm";
			}
			//게시글 상세보기
			@GetMapping("/auth/board/{id}")
			public String findById(@PathVariable int id, Model model) {
				model.addAttribute("boardDetail",boardService.게시판글상세보기(id));
				return "board/boardDetail";
			}
			
			//게시글 수정
			@GetMapping("/auth/board/{id}/boardUpdateForm")
			public String UpdateForm(@PathVariable int id,Model model) {
				model.addAttribute("boardUpdate",boardService.게시판수정글상세보기(id));
				return "board/boardUpdateForm";
			}
}
