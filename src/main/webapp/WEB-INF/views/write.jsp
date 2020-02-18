<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write Page</title>
<!-- 부트스트랩 css -->
<link rel="stylesheet" href="/css/lib/bootstrap.min.css">
</head>
<body>
<div class="container">
	<a href="/">홈으로</a>
	<div class="form-group">
	<form action="/write" method="post">
		<input type="text" name="title" class="form-control"/><br/>
		<input type="text" name="content" class="form-control"/><br/>
		<input type="submit" value="등록" class="form-control"/>
	</form>
	</div>
</div>
<!-- 부트스트랩 js, jquery 추가 -->
	<script src="/js/lib/jquery-3.4.1.min.js"></script>
	<script src="/js/lib/bootstrap.min.js"></script>
</body>
</html>