<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		<link rel="stylesheet" href="/resources/maincss/home.css" type="text/css"></link>
	</head>
	<body>

		
		<div class="main-login">
			<c:if test="${loginUser == null}"> <!-- 아직 로그인 상태가 아님 -->
				<div class="login-container">
					<div>
						<h1>Ajou Library Kiosk</h1>
					</div>
					<form name="lofingForm" method="post" action="/kiosk/login.do">
						<input type="text" id="id" name="id" /> <br/>
						<input type="text" id="pwd" name="pwd" /> <br/>
						<input type="submit" id="loginBtn" value="LOGIN" />
					</form>
				</div>
			</c:if>
			
			<c:if test="${loginUser != null}"> <!-- 로그인 한 상태 -->
				<h1>login</h1>
				<h2>${loginUser.name}님 반갑습니다.</h2>
				<!-- <script type="text/javascript">
					location.href="main.do";
				</script> -->
			</c:if>
		</div>
	</body>
</html>
