<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!-- summernote -->
<link
   href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css"
   rel="stylesheet">
<script
   src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js">
</script>

	<div class="wrapper writing-wrapper">
		<form>
			<input type="hidden" value="${boardDetail.id}" id="id">
			<input value="${freeboard.freetitle}" id="title" type="text" placeholder="제목을 입력하세요.">
			<textarea hidden="true" id="content" class="summernote" rows="20">${boardDetail.content}</textarea>
		</form>
		<button id="board-btn-update">수정하기</button>
	</div>


<script>
$('#content').summernote({
	tabsize:2,
	  height: 300,                 // 에디터 높이
	  minHeight: null,             // 최소 높이
	  maxHeight: null,             // 최대 높이
	  focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
	  lang: "ko-KR",					// 한글 설정
	  placeholder: '최대 2048자까지 쓸 수 있습니다'	//placeholder 설정
    
});
</script>
<script src="/js/board.js"></script>
