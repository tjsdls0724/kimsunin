<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 Member m_pwd = (Member)request.getAttribute("m_pwd");
%>
<!DOCTYPE html>
<html>
	<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Author Meta -->
	<meta name="author" content="colorlib">
	<!-- Favicon-->
	<link rel="shortcut icon" href="/PETNER/resources/img/common/small_logo.jpg">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>Petner+</title>
		<title>회원 가입</title>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	</head>
	<body>
			<%@ include file="../common/header.jsp" %> 
			
			<!--  메뉴바랑 겹치는 부분 제거 -->
	<div style="padding-top:150px;">
	
	</div>
		<div class="container">
			<div class="card o-hidden border-0 shadow-lg my-5">
			  <div class="card-body p-0">
				<!-- Nested Row within Card Body -->
				<div class="row">
				  <div class="col-lg-7" style="margin: auto;">
					<div class="p-5">
					  <div class="text-center">
						<h1 class="h4 text-gray-900 mb-4">비밀번호 확인</h1>
					  </div>
					  <!-- 필수정보는 required 나중에 필수로 넣어줄 것! -->
					  <form class="user" id="joinForm" action="/PETNER/PmInsert.me" method="post">
						<div class="form-group row">
						</div>
						<div class="form-group">
						아이디 : <input type="email" class="form-control form-control-user" name="userEmail" id="SearchEmail" 
						  			placeholder="<%=m_pwd.getUserEmail()%>" required readonly="readonly">
						</div>
						<div class="form-group">
						비밀번호 :	<input type="password" class="form-control form-control-user" name="userPwd" 
									placeholder="<%=m_pwd.getUserPwd()%>" required readonly="readonly">
						</div>
					  </form>
					  <hr>
	
					  <div class="text-center">
						<a class="small" href="#" data-target="#modal-login" data-toggle="modal">이미 계정이 있으신가요? 로그인!</a>
					  </div>
					</div>
				  </div>
				</div>
			  </div>
			</div>
		</div>			
			
			<%@ include file="../common/footer.jsp" %>
	</body>
</html>