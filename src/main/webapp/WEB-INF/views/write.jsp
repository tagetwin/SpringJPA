<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Page</title>
</head>
<body>
	<a href="/">홈으로</a>
	<form action="/write" method="post">
		<input type="text" name="title"/>
		<input type="text" name="content"/>
		<input type="submit" value="등록"/>
	</form>

</body>
</html>