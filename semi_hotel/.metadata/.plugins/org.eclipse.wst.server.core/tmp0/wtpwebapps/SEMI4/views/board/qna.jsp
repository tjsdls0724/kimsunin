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


	<link rel="stylesheet" href="/PETNER/resources/css/hr.css">

</head>

<body>
	<!--######## Start Header Area ########-->
		<%@ include file="../common/header.jsp" %> 
		
	<!--######## start banner Area ########-->
	<!--  메뉴바랑 겹치는 부분 제거 -->
	<div style="padding-top:150px;"></div>
	
	<!--######## End Header Area ########-->

	<!--######## start banner Area ########-->
	<section class="qna-banner-area relative" id="home">
		<div class="overlay overlay-bg"></div>
		<div class="container">
			<div class="row tesxt-left d-flex align-items-center justify-content-center">
				<div class="about-content col-lg-12">
					<h1 class="text-white text-uppercase  ">
						QNA
					</h1>

				</div>
			</div>
		</div>
	</section>
	<!--######## End banner Area ########-->

	

	<!--######## Start Latest News Area ########-->
	<section class="latest-news-area section-gap-hr">
		<div class="container">
			<div class="row">
				<div class="col-12 marg45">
					<div class="main-title text-center">
						<h1 style="font-weight: 300;">QNA</h1>
					</div>
					<div class="card">
					  <!-- /.card-header -->
					  <div class="card-body table-responsive p-0">
						<table class="table table-hover">
						  <thead>
							<tr>
							  <th>Num</th>
							  <th>E-mail</th>
							  <th>Title</th>
							  <th>Date</th>
							</tr>
						  </thead>
						  <tbody>
							<tr>
							  <td>1</td>
							  <td>ggghr@naver.com</td>
							  <td><a href="qna_read.html" style="color:gray">문의합니다.^^</a></td>
							  <td>2020-1-17</td>
							</tr>
							<tr>
								<td>2</td>
								<td>hihi@gmail.com</td>
								<td>예약하고 싶은데 어디서 해야할지 모르겠습니다.</td>
								<td>2020-1-13</td>
							</tr>
							<tr>
								<td>3</td>
								<td>didi@naver.com</td>
								<td>애완견 미용컷 질문</td>
								<td>2020-1-12</td>
							</tr>							
							<tr>
								<td>4</td>
								<td>titi@gmail.com</td>
								<td>문의!! 예약관련 질문합니다.</td>
								<td>2020-1-12</td>
							</tr>							
							<tr>
								<td>5</td>
								<td>qiqi@gmail.com</td>
								<td>안녕하세요.. 제가 문의할 것이 있어서 작성합니다.. 꼭 봐주세요.</td>
								<td>2020-1-11</td>
							</tr>
						  </tbody>
						</table>
					  </div>
					  <!-- /.card-body -->
					</div>
					<!-- /.card -->
				  </div>
				<div class="col-md-12">
					<a href="qna_write.html" class="primary-btn header-btn text-capitalize mt-10" style="float: right;">문의하기</a>
				</div>
				<!-- 페이징 부분 -->
				<nav class="col-md-12 blog-pagination justify-content-center d-flex">
					<ul class="pagination">
						<li class="page-item">
							<a href="#" class="page-link" aria-label="Previous">
								<span aria-hidden="true">
									<span class="lnr lnr-chevron-left"></span>
								</span>
							</a>
						</li>
						<li class="page-item active"><a href="#" class="page-link">01</a></li>
						<li class="page-item"><a href="#" class="page-link">02</a></li>
						<li class="page-item"><a href="#" class="page-link">03</a></li>
						<li class="page-item"><a href="#" class="page-link">04</a></li>
						<li class="page-item"><a href="#" class="page-link">05</a></li>
						<li class="page-item">
							<a href="#" class="page-link" aria-label="Next">
								<span aria-hidden="true">
									<span class="lnr lnr-chevron-right"></span>
								</span>
							</a>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</section>
	<!--######## End Latest News Area ########-->

	<!--######## start footer Area ########-->
		<%@ include file="../common/footer.jsp" %>
	<!--######## End footer Area ########-->

</body>

</html>