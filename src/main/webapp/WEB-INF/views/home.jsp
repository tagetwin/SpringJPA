<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 부트스트랩 css -->
<link rel="stylesheet" href="/css/lib/bootstrap.min.css">
<style>
.form-control{
	width:70%;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<a class="navbar-brand" href="#">Navbar</a>


		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
			</ul>
		</div>
		<form class="form-inline" action="/action_page.php">
			<input class="form-control mr-sm-2" type="text" placeholder="Search">
			<button class="btn btn-success" type="submit">Go</button>
		</form>
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
	</nav>
	<br>

	<div class="container">
		<a href="/write">글쓰기페이지로</a>
		<table class="table table-dark" border="1">
			<tr>
				<td>번호</td> 
				<td>제목</td>
				<td>내용</td>
				<td>날짜</td>
				<td>삭제</td>
				<td>수정</td>
			</tr>
			<c:forEach var="board" items="${board}">
				<tr>
					<td>${board.id}</td>
					<td>${board.title}</td>
					<td>${board.content}</td>
					<td>${board.modifiedDate}</td>
					<td><a href="/delete/${board.id}">삭제</a></td>
					<td><a href="/update/${board.id}">수정</a></td>
				</tr>
			</c:forEach>
		</table>

	</div>
	<!-- 부트스트랩 js, jquery 추가 -->
	<script src="/js/lib/jquery-3.4.1.min.js"></script>
	<script src="/js/lib/bootstrap.min.js"></script>
	<script src="http://localhost:35729/livereload.js"></script> 
<script>
	

</script>

</body>
</html>