<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HomePage</title>
</head>
<body>
	<a href="/write">글쓰기</a>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
		</tr>
		<c:forEach var="board" items="${board}">
		<tr>
			<td>${board.id}</td>
			<td>${board.title}</td>
			<td>${board.content}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>