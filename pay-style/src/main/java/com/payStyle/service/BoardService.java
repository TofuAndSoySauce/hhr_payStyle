package com.payStyle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.payStyle.model.Board;
import com.payStyle.model.Users;
import com.payStyle.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	BoardRepository boardRepository;
	
	@Transactional
	public void 게시판글쓰기(Board board, Users user) { // title, content
		//board.setUsers(user); 로그인유저
		boardRepository.save(board);
	}
	@Transactional(readOnly = true)
	public Page<Board> 게시판글목록(Pageable pageable) {
		return boardRepository.findAll(pageable);
	}
	@Transactional(readOnly = true)
	public Board 게시판글상세보기(int id) {
		return boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("글 상세보기 실패: 아이디를 찾을 수 없습니다.");
		});
		
	}
	
	//나중에 조회수기능 사용하면 씀.
	@Transactional
	public Board 게시판수정글상세보기(int id) {
		return boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("수정글 상세보기 실패: 아이디를 찾을 수 없습니다.");
		});
	}
	@Transactional
	public void 게시판글삭제하기(int id) {
		boardRepository.deleteById(id);
	}
	@Transactional
	public void 게시판글수정하기(int id, Board requestBoard) {
		Board freeboard = boardRepository.findById(id).orElseThrow(() -> {
			return new IllegalArgumentException("글 찾기 실패: 아이디를 찾을 수 없습니다.");
		}); 
		freeboard.setTitle(requestBoard.getTitle());
		freeboard.setContent(requestBoard.getContent());
	}
	
}
