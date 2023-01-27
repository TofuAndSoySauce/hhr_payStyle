<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

 <button onclick="location.href='/auth/board/boardSaveForm'">게시판작성</button>


<c:forEach var="board" items="${boards.content}">
<div>
  <ul>
    <li>게시판번호 <a href="/auth/board/${board.id}">${board.id}</a>
    </li>
    <li>게시판 제목 <a href="/auth/board/${board.id}">${board.title}</a>
    </li>
  </ul>
</div>
</c:forEach>
        
         <ul class="pagination justify-content-center">
         <c:choose>
          <c:when test="${boards.first}">
            <li class="pagingbtn pagingbtn-disabled"><a class="page-link" href="?page=${boards.number-1}">&laquo;</a></li>
          </c:when>
          <c:otherwise>
            <li class="page-item"><a class="page-link" href="?page=${boards.number-1}">&laquo;</a></li>
          </c:otherwise>
        </c:choose>

        <c:choose>
          <c:when test="${boards.last}">
            <li class="pagingbtn pagingbtn-disabled"><a class="page-link" href="?page=${boards.number+1}">&raquo;</a></li>
          </c:when>
          <c:otherwise>
            <li class="page-item"><a class="page-link" href="?page=${boards.number+1}">&raquo;</a></li>
          </c:otherwise>
        </c:choose>
        </ul>
</body>
</html>


  