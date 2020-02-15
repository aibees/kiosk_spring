<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div>
			<form name="lofingForm" method="post" action="/login.do">
				<input type="text" id="id" name="id" /> <br/>
				<input type="text" id="pwd" name="pwd" />
				<input type="submit" id="loginBtn" value="LOGIN" />
			</form>
		</div>
	</body>
</html>