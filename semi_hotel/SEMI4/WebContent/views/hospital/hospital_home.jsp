<%@page import="com.kh.petner.hotel.model.vo.Hotel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% ArrayList<Hotel> list = (ArrayList)request.getAttribute("list"); %>
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

   <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
   <!--
         CSS
         ============================================= -->
   <link rel="stylesheet" href="css/font-awesome.min.css">
   <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/main.css">
    <style>
      
    .overlay {
        position: absolute;
        left: 0;
        right: 0;
        top: 0;
        bottom: 0; }

    .blog-banner-area {
        background: url(/PETNER/resources/img/hotel/dogbath.jpg) no-repeat center fixed !important; 
        background-size: cover;
        min-height:500px;
        }
  .blog-banner-area .banner-content h1 {
    font-size: 48px;
    line-height: 54px !important;
    margin: 0; }
    @media (max-width: 768px) {
      .blog-banner-area .banner-content h1 {
        font-size: 35px;
        line-height: 40px !important; } }
    @media (max-width: 414px) {
      .blog-banner-area .banner-content h1 {
        font-size: 30px; } }
  .blog-banner-area .banner-content p {
    font-size: 16px;
    margin: 40px 20px; }
    @media (max-width: 768px) {
      .blog-banner-area .banner-content p {
        margin: 10px; } }
  .blog-banner-area .banner-content .primary-btn {
    background: #fff;
    color: #222222; }
    .blog-banner-area .banner-content .primary-btn:hover {
      background: #3face4;
      color: #ffffff; }

    .fullscreen {
    height: 740px; }
    @media (max-width: 767.98px) {
        .fullscreen {
        height: 600px !important; } }
    @media (max-width: 768px) {
        .fullscreen {
        height: 400px !important; } }

    .overlay-bg {
    background-color: rgba(34, 34, 34, 0.27); }

    </style>
</head>

<body>

      <%@ include file="../common/header.jsp" %> 
      <!--######## start banner Area ########-->
      <!--  메뉴바랑 겹치는 부분 제거 -->
      <div style="padding-top:150px;"></div>
      
   <!--######## Start Header Area ########-->

   <!--######## End Header Area ########-->




   <!--######## start banner Area ########-->
   <section class="blog-banner-area relative" id="home">
      <div class="overlay overlay-bg"></div>
      <div class="container">
         <div class="row text-left d-flex align-items-center justify-content-center">
            <div class="about-content col-lg-12">
               <h1 class="text-white text-uppercase  ">
                  HOTEL
               </h1>
            </div>
         </div>
      </div>
   </section>
   <!--######## End banner Area ########-->




   <!-- Start CheckBox -->
   <section class="whole-wrap">
      <div class="container">

         <div class="section-top-border">
            <div class="row">
               <div class="col-lg-12 col-md-12">
                  <h3 class="mb-30">지역찾기</h3>
                  <div class="checkbox-background">
                     <br>&nbsp;&nbsp;
                     <input type="checkbox" id="gangnam">
                     <label for="gangnam">강남,송파,서초</label>
                     &nbsp;&nbsp;
                     <input type="checkbox" id="gangseo">
                     <label for="gangseo">영등포,강서</label>
                     &nbsp;&nbsp;
                     <input type="checkbox" id="hongdae">
                     <label for="hongdae">홍대,용산,종로</label>
                     &nbsp;&nbsp;
                     <input type="checkbox" id="other">
                     <label for="other">기타</label>
                     <br>
                  </div>
               </div>
               <div class="col-lg-6 col-md-6 marg30">
                  <div class="search-div">
                     <input type="text" class="search-input" placeholder="검색어를 입력하세요.">
                     <button class="search-btn">검색</button>
                  </div>
               </div>
               <div class="col-lg-6 col-md-6 marg45 ">
                  <div class="recent-completed-project1">
                     <div class="filters project-filter">
                        <ul>
                           <li class="active" data-filter=".new">최근등록순</li>|
                           <li data-filter=".grade">평점순</li>| 
                           <li data-filter=".review">후기순</li>
                        </ul>
                     </div>
                  </div>
               </div>

               <div class="col-md-12 col">
                  <hr>
               </div>
            </div>
         </div>
      </div>
   </section>
   <!-- End checkBox -->



   <!--######## Start Latest News Area ########-->
   <section class="latest-news-area section-gap-hr">
      <div class="container">
         <div class="row">
         
         
         
         
         <% for(Hotel h : list) { %>
            <div class="col-md-6">
               <div class="single-newss card">
                  <img class="card-top-img " height="400px" src="/PETNER/resources/img/hotel/hop_img2.jpeg" alt="hospital image">
                  <div class="card-body">
                     <h4 class="card-title">
                        <a href="hotel_information.html">
                           <%=h.getHotel_name()%>
                          
                           
                        </a>
                     </h4>
                     <i class="fa fa-star star"></i><i class="fa fa-star star"></i><i class="fa fa-star star"></i><i class="fa fa-star star" star></i><i
                        class="fa fa-star star"></i>
                        <span>&nbsp&nbsp후기 132개</span>
                     <p class="card-text">
                        <br>
                        <img src="/PETNER/resources/img/hotel/pin.png" width="15px" height="15px">
                        서울시 강남구
                        <br>이용시간 평일 00:00 ~ 24:00<br>
                        연중휴무</p>
                        <a href="hotel_information.html" class="primary-btn header-btn text-capitalize mt-10" style="float: right;">예약하기</a>
                  </div>
               </div>
                </div>
                <% } %>
         
         
         
         
         
         
         
         
         
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
                  <li class="page-item"><a href="#" class="page-link">01</a></li>
                  <li class="page-item active"><a href="#" class="page-link">02</a></li>
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

   <!--######## End footer Area ########-->


   <%@ include file="../common/footer.jsp" %>



</body>

</html>