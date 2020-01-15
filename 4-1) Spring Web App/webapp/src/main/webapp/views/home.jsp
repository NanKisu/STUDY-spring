<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>home</h1>
	<a href="/webapp/study/model">model</a>
	<a href="/webapp/study/redirectattribute">redirectattribute</a>
	<form action="/webapp/study/beansandvalidation" method="POST">
		<h2>beansandvalidation: <input type="text" name="text" /></h2>
	</form>
	<a href="/webapp/study/httpentity">httpentity</a>
	<a href="/webapp/study/locale">locale</a>
	<a href="/webapp/study/timezone">timezone</a>
	<a href="/webapp/study/principal">principal</a>
	<a href="/webapp/study/uricomponentsbuilder">uricomponentsbuilder</a>
	<a href="/webapp/study/sessionstatus">sessionStatus</a>
	<hr/>
	<h2>[message: ${message}]</h2>
	<h2>[param message: ${param.message}]</h2>
</body>
</html>