<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../layout/header.jsp"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<ul>
	<li>
	<a href="/auth/board/${boardDetail.id}/boardUpdateForm">수정</a>
	<button id="board-btn-delete">삭제</button>
	</li>
	<li>
	
	</li>
	<li>게시물 번호 ${boardDetail.id}</li>
	<li>게시물 제목 ${boardDetail.title}</li>
	<li>게시물 내용 ${boardDetail.content}</li>
	<li>게시물 작성일자 
	<fmt:formatDate value="${boardDetail.createDate}" pattern="yyyy-MM-dd"/>
	</li>
	
</ul>



	
