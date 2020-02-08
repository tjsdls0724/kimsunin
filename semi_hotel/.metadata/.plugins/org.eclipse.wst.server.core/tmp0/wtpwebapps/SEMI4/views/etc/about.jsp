<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<style>

    .blog-banner-area {
		background: url(/PETNER/resources/img/about/about3.jpg) no-repeat center fixed !important;
		background-size: cover;
		min-height:420px; }
	</style>
</head>

<body>
		<%@ include file="../common/header.jsp" %> 
		<!--######## start banner Area ########-->
		<!--  메뉴바랑 겹치는 부분 제거 -->
		<div style="padding-top:150px;"></div>

		<!--######## start banner Area ########-->
		<section class="blog-banner-area relative" id="home">
			<div class="overlay overlay-bg"></div>
			<div class="container">
				<div class="row text-left d-flex align-items-center justify-content-center">
					<div class="about-content col-lg-12">
						<h1 class="text-white text-uppercase  ">
							About Petner+
						</h1>
					</div>
				</div>
			</div>
		</section>
		<!--######## End banner Area ########-->

	<!--about image-->
	<div class="image_wrap">
		
		<img src="/PETNER/resources/img/about/about_page.jpg">



	</div>

	<!--######## start footer Area ########-->

	<!--######## End footer Area ########-->

	<%@ include file="../common/footer.jsp" %>
	
</body>

</html>