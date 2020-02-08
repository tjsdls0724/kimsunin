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
    <!--FAQ CSS-->
    <link href="/PETNER/resources/css/board_faq.css" rel="stylesheet" type="text/css">
    
    <style>
      .blog-banner-area {
      background: url(/PETNER/resources/img/board/faq2.jpg) no-repeat bottom fixed !important;
      background-size: cover;
      min-height:420px;
      }

      .wrap {
          font-size: 14px;
          color: #5b5b5b;
          background-color: #fff;
          width: 1300px;
          margin: 0 auto;	
      }
    </style>
</head>

<body>
        <!--######## Start Header Area ########-->
		<%@ include file="../common/header.jsp" %> 
		<!--  메뉴바랑 겹치는 부분 제거 -->
		<div style="padding-top:150px;"></div>
        <!--######## End Header Area ########-->
    
        <!--######## start banner Area ########-->
        <section class="blog-banner-area relative" id="home">
            <div class="overlay overlay-bg"></div>
            <div class="container">
                <div class="row text-left d-flex align-items-center justify-content-center">
                    <div class="about-content col-lg-12">
                        <h1 class="text-white text-uppercase  ">
                            FAQ
                        </h1>
                    </div>
                </div>
            </div>
        </section>
        <!--######## End banner Area ########-->
    
       <!--FAQ-->
       <div class="wrap" style="margin: 0 auto;">
            <div class="contain">
                    <div class="main-title text-center">
                            <h1 style="font-weight: 300; margin-top: 50px;">FAQ</h1>
                    </div>
                 <div class="tab">
                  <button class="tablinks" onclick="openfaq(event, 'faq1')" id="defaultOpen">호텔관련</button>
                  <button class="tablinks" onclick="openfaq(event, 'faq2')">병원관련</button>
                  <button class="tablinks" onclick="openfaq(event, 'faq3')">미용관련</button>
                  <button class="tablinks" onclick="openfaq(event, 'faq4')">회원관련</button>
                 </div>
                 
                <div id="faq1" class="tabcontent">
                <button class="accordion"><span class="accornumber">1</span><span class="accorq">호텔 이용 가능 날짜는 몇일까지인가요?</span></button>
                <div class="panel">
                <p class="accora">예약 상황에 따라 다릅니다.<br>
                (* 반려동물의 스트레스 등 여러 가지 상황을 고려해 5일 이상은 추천드리지 않습니다.)</p>
                </div>
        
                <button class="accordion"><span class="accornumber">2</span><span class="accorq">입질,예민한 동물은 이용 불가한가요?</span></button>
                <div class="panel">
                <p class="accora">입질이 심하거나 너무 예민한 경우 불가능할 수 있으니 직접 사전 방문 바랍니다.</p>
                </div>
                
                <button class="accordion"><span class="accornumber">3</span><span class="accorq">kg수에 따라 가격차이는 얼마나 나나요?</span></button>
                <div class="panel">
                <p class="accora">1~3kg/3~5kg/5~8kg/10kg이상으로 나뉘어지며 가격은 문의 바랍니다.</p>
                </div>
                
                <button class="accordion"><span class="accornumber">4</span><span class="accorq">산책서비스는 무조건 무료인가요?</span></button>
                <div class="panel">
                <p class="accora">산책서비스는 3일 이상 호텔 이용시 무료이며, 그 이하 이용시 한번 당 5천원 부과됩니다.<br>
                                  (*산책해주시는 다른 업체의 펫도우미분들의 도움이므로 비용이 부과되는 점 이해 부탁드립니다.)</p>
                </div>
                
                <button class="accordion"><span class="accornumber">5</span><span class="accorq">예약했는데 날짜 변경이 하고싶은데 가능한가요?</span></button>
                <div class="panel">
                <p class="accora">다른 날짜에 예약이 있을 수 있으므로 정확한 문의는 전화/카카오톡/게시판 문의 부탁드립니다.</p>
                </div>
                
                <button class="accordion"><span class="accornumber">6</span><span class="accorq">후기 작성하면 어떤 혜택이 있나요?</span></button>
                <div class="panel">
                <p class="accora">후기 작성해주시면 다음에 호텔 이용시, 산책 서비스 1회 제공됩니다.</p>
                </div>
                
                
             
        <script>
        var acc = document.getElementsByClassName("accordion");
        var i;
        
        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
        </script>
                </div>
                
                <div id="faq2" class="tabcontent">
                 <button class="accordion accordion2"><span class="accornumber">1</span><span class="accorq">병원 방문 전 예약 해야하나요?</span></button>
                <div class="panel">
                <p class="accora">증상이 급하시다면 바로 방문하여주시는 것은 당연하고, 증상이 미약한데 거리가 멀거나 시간조정이 힘드시다면 전화 부탁드립니다.</p>
                </div>
        
                 <button class="accordion accordion2"><span class="accornumber">2</span><span class="accorq">반려동물이 예방접종 후 기운이 없는데 정상인가요?</span></button>
                <div class="panel">
                <p class="accora">갑자기 주사를 맞아 놀라서 그럴 수 있습니다. 단, 구토나 알레르기 반응이 나타나면 바로 내원해주세요.</p>
                </div>
        
                 <button class="accordion accordion2"><span class="accornumber">3</span><span class="accorq">예방접종은 맞추는 시기가 어떻게 되나요?</span></button>
                <div class="panel">
                <p class="accora">4주/6주/9주/12주/15주/18주까지 5차 예방접종 후 그 이후엔 매년 1회 예방접종 하시는 것을 권해드립니다.</p>
                </div>
                
                 <button class="accordion accordion2"><span class="accornumber">4</span><span class="accorq">밥을 안먹는데 병원에 방문해야 할까요?</span></button>
                <div class="panel">
                <p class="accora">안먹는지 못먹는지를 봐야합니다. 간식이나 다른 음식은 먹는데 밥을 안먹는 경우가 아니라 몇일간 아무것도 먹지 않는다면 무조건 내원하셔야합니다.</p>
                </div>
        
                 <button class="accordion accordion2"><span class="accornumber">5</span><span class="accorq">24시간 운영하나요?</span></button>
                <div class="panel">
                <p class="accora">저희 펫트너+는 24시간 운영 병원을 최대한 소개합니다.</p>
                </div>
                
               
        <script>
        var acc = document.getElementsByClassName("accordion2");
        var i;
        
        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
        </script>
                </div>
        
                <div id="faq3" class="tabcontent">
                <button class="accordion accordion3"><span class="accornumber">1</span><span class="accorq">kg수에 따라 가격차이가 얼마나 나나요?</span></button>
                <div class="panel">
                <p class="accora">주로 5kg 이내로 가격차이가 나며, 종에 따라 가격이 다르므로 직접 문의 바랍니다.</p>
                </div>
        
                <button class="accordion accordion3"><span class="accornumber">2</span><span class="accorq">고양이를 키우는데 무마취미용이 가능한가요?</span></button>
                <div class="panel">
                <p class="accora">무마취미용이 가능한 미용기관은 표시해두었습니다. 확인부탁드립니다.</p>
                </div>
        
                <button class="accordion accordion3"><span class="accornumber">3</span><span class="accorq">예민한 성격인데 장시간 버틸 수 있나요?</span></button>
                <div class="panel">
                <p class="accora">너무 입질이 심하거나, 많이 예민하다면 담당 미용 선생님과 상의해봐야하므로, 직접 문의 바랍니다.</p>
                </div>
                
                <button class="accordion accordion3"><span class="accornumber">4</span><span class="accorq">포메라니안 곰돌이컷은 어느 강아지나 가능한가요?</span></button>
                <div class="panel">
                <p class="accora">거의 그렇습니다. 털이 심하게 엉켜서 바리깡으로 밀어야 하는 경우를 제외하곤 모두 가능합니다.</p>
                </div>
                
                <button class="accordion accordion3"><span class="accornumber">5</span><span class="accorq">손톱/발톱깎기나 항문낭 관리도 해주시나요?</span></button>
                <div class="panel">
                <p class="accora">네. 기본 미용에 포함되어 있는 내용입니다.</p>
                </div>
                
                <button class="accordion accordion3"><span class="accornumber">6</span><span class="accorq">목욕도 기본 미용인가요?</span></button>
                <div class="panel">
                <p class="accora">네. 미용 후 목욕 해드립니다.</p>
                </div>
                
        <script>
        var acc = document.getElementsByClassName("accordion3");
        var i;
        
        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
        </script>
                </div>
                
                <div id="faq4" class="tabcontent">
                <button class="accordion accordion4"><span class="accornumber">1</span><span class="accorq">회원 정보는 안전하게 관리되나요? </span></button>
                <div class="panel">
                <p class="accora"> 
                펫트너는 회원님의 정보 보호를 위해 최소한의 개인정보를 회원가입 요건으로 하고 있으며 <br>
                정보 유출에 관련된 피해가 없도록 정책적/시스템적인 보안에 최선의 노력을 다하고 있습니다.  <br>
                회원님의 소중한 개인정보는 저희 카드큐의 ‘개인정보보호정책’에 의거하여 안전하게 보호합니다.<br>
                </p>
                </div>
        
                 <button class="accordion accordion4"><span class="accornumber">2</span><span class="accorq">회원 탈퇴 시 모든 정보가 삭제되나요?</span></button>
                <div class="panel">
                <p class="accora"> 
                탈퇴하시면 기존에 등록된 회원제 서비스의 이용자 정보 및 데이터가 모두 삭제됩니다. <br>
                단, 게시판의 게시물은 삭제되지 않고 남게 되며, 탈퇴 이후 삭제요청 처리 또한 불가능하오니 이전에 직접 삭제하시거나 <br>
                고객센터를 통해 삭제 요청을 해주셔야 합니다.</p>
                </div>
        
                 <button class="accordion accordion4"><span class="accornumber">3</span><span class="accorq">회원 탈퇴는 어떻게 하나요?</span></button>
                <div class="panel">
                <p class="accora">마이페이지 > 내 정보관리 > 하단의 [회원탈퇴] 버튼을 누르면 간략한 회원 탈퇴 안내를 확인하신 후 [탈퇴하기]를 눌러주시면 최종 탈퇴 처리됩니다. <br> 단, 탈퇴 후에는 탈퇴하신 아이디로 재가입 할 수 없습니다. </p>
                </div>
                
                 <button class="accordion accordion4"><span class="accornumber">4</span><span class="accorq">아이디/패스워드를 잊어버렸어요.</span></button>
                <div class="panel">
                <p class="accora">로그인 창 하단에 있는 [아이디 찾기 / 패스워드 찾기]를 누르시고 회원 가입 시 입력한 정보를 기재하시면 계정을 확인하실 수 있습니다.<br>
                정보가 정확하지 않거나 일치하지 않는 경우 확인이 불가하오니 정확한 정보를 입력하시기 바랍니다. <br>
                위 방법으로 정보 확인이 되지 않는 경우 고객센터로 연락해주시면 확인해드리도록 하겠습니다.</p>
                </div>
              
                
        <script>
        var acc = document.getElementsByClassName("accordion4");
        var i;
        
        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
        </script>
                </div>

        <script>
        var acc = document.getElementsByClassName("accordion5");
        var i;
        
        for (i = 0; i < acc.length; i++) {
          acc[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var panel = this.nextElementSibling;
            if (panel.style.maxHeight){
              panel.style.maxHeight = null;
            } else {
              panel.style.maxHeight = panel.scrollHeight + "px";
            } 
          });
        }
        </script>
                </div>
        <script>
        function openfaq(evt, faqName) {
          var i, tabcontent, tablinks;
          tabcontent = document.getElementsByClassName("tabcontent");
          for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
          }
          tablinks = document.getElementsByClassName("tablinks");
          for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
          }
          document.getElementById(faqName).style.display = "block";
          evt.currentTarget.className += " active";
        }
        
        document.getElementById("defaultOpen").click();
        </script>
                <section>
                <div class="bottom_box"></div>
                </section>
            </div> <!--.contain -->
        </div> <!--.wrap 끝2-->
    <!--FAQ 끝-->
   
        <!--######## start footer Area ########-->
		<%@ include file="../common/footer.jsp" %>
        <!--######## End footer Area ########-->
    

    </body>
    

</html>