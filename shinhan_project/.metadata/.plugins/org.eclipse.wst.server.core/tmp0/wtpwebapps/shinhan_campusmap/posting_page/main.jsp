<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shinhan Campus Map Administrator Page</title>
</head>
<body class="is-preload">

	<jsp:include page="include/header.html" />

	<!-- wrapper! -->
	<div id="wrapper">

		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="../posting_page/main.jsp" class="active">Introduction</a></li>
				<li><a href="../posting_page/img_list.jsp">CheckingPicture</a></li>
				<li><a href="../posting_page/mgt_main.jsp">SelectingMainPicture</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">

			<!-- Introduction -->
			<section id="intro" class="main special">
				<div class="spotlight">
					<div class="content">
						<header class="major">
							<h2>Shinhan Campus Map</h2>
							<span class="image"><img src="images/app_logo.png" alt="" /></span>
						</header>
					</div>
				</div>
			</section>

			<section id="content" class="main">
				<h2>개발 배경</h2>
				<p>신입생들은 수업을 하는 강의실이나 도서관, 식당 등 교내 시설들의 정확히 파악하기가 어렵습니다. 또한
					재학생들도 자신의 과에 관련된 부서나 자주 사용하는 편의시설을 제외하고는 다른 건물들의 위치나 상세정보를 몰라 헤메는
					경우가 허다합나다. '신한캠퍼스맵'은 캠퍼스맵을 통해 위의 문제점들을 해결하고 학생과 교직원들에게 편의를 제공하고자
					합니다.</p>
				<p>학교 셔틀버스의 시간표를 홈페이지의 공지사항을 통해 다운받아 매번 찾아야 하는 번거러움이 잇습니다.
					'신한캠퍼스맵'은 출발지와 목적지별로 셔틀버스 시간표를 분리하여 제시함으로써 더 쉽게 셔틀버스 정보를 접할 수 있도록
					도움을 줍니다.</p>
			</section>

			<section id="content" class="main">
				<h2>앱 기능</h2>
				<h3>1. 캠퍼스맵</h3>
				<p>캠퍼스 지도를 제공하고, 지도에서 강의실, 행정시설, 편의시설, 교수연구실, 학과사무실을 찾아 위치 및 정보를
					확인할 수 있습니다. 또한 사용자가 건물 사진을 추가하여 다양한 사진들을 공유할 수 있습니다. 위와 같은 정보는 검색하여
					찾을 수도 있고, 음성으로도 검색이 가능합니다. 그리고 현재 위치로부터 특정 건물까지의 길찾기 기능을 제공합니다.</p>

				<h3>2. 셔틀버스</h3>
				<p>
					정규 시간표를 아래와 같이 나누어 제공합니다. <br> <br>- 1~2캠 셔틀버스 <br>-
					2캠 지행역 / 동두천중앙역 행 셔틀버스 <br>- 2캠 학교 / 행복기숙사 행 셔틀버스 <br>-
					일산행 셔틀버스 <br>- 대화행 셔틀버스
				</p>

				<h3>3. 링크</h3>
				<p>학교 생활을 하며 필요한 학교 관련 사이트 링크를 제공함으로써 원할 때 필요한 사이트에 쉽게 접근할 수 있도록
					돕습니다.</p>
			</section>
		</div>


		<jsp:include page="include/footer.jsp" />
	</div>
	
	<!-- Scripts -->
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/jquery.scrollex.min.js"></script>
	<script src="assets/js/jquery.scrolly.min.js"></script>
	<script src="assets/js/browser.min.js"></script>
	<script src="assets/js/breakpoints.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>
</body>
</html>