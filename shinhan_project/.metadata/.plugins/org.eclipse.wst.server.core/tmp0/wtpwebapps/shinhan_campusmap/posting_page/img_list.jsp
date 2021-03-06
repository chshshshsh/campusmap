<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	Connection con1 = DBConnection.openConnection();
	ArrayList<ImageDTO> array1 = new ArrayList<ImageDTO>();
	ImageDTO dto = new ImageDTO();
	ImageDAO dao1 = new ImageDAO(con1);
	array1 = dao1.selectIsNotchecked();
	request.setAttribute("imglist", array1);

	DBConnection.closeConnection(con1);
%>

<!DOCTYPE html>
<html>
<head>
<title>Shinhan Campus Map Administrator Page</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="../assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="../assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">

	<!-- Header -->
	<jsp:include page="include/header.html" />

	<!-- wrapper! -->
	<div id="wrapper">
	
	<!-- Nav -->
	<nav id="nav">
		<ul>
			<li><a href="../posting_page/main.jsp">Introduction</a></li>
			<li><a href="../posting_page/img_list.jsp" class="active">CheckingPicture</a></li>
			<li><a href="../posting_page/mgt_main.jsp" >SelectingMainPicture</a></li>
		</ul>
	</nav>

		<!-- Main -->
		<div id="main">
			<c:if test="${sessionScope.member_id == null}">
				<script>
					alert("로그인이 필요한 페이지입니다.");
					location.href = "./../member/login.html";
				</script>
			</c:if>
			
			<!-- First Section -->
			<section id="checking" class="main special">
				<header class="major">
					<h2>Checking Picture</h2>
				</header>
				<div class="box alt">
					<div class="row gtr-uniform">
						<ul class="features">
							<c:set var="i" value="0" />
							<c:set var="j" value="3" />
							<table border="1">
								<c:forEach items="${imglist}" var="imglist">
									<c:if test="${i%j == 0 }">
										<tr>
									</c:if>
									<li><span class="gallery"><img
											src=${imglist.route } style="max-width: 100%; max-height: 100%;" alt="${imglist.icode}" /></span>
										<h4>
											<a id="title">${imglist.iname}</a>
										</h4>
										<h4>
											<a id="bname">${imglist.bnameJoin}</a>
										</h4> <a type="button" class="button"
										href="checkImg/img_allow.jsp?icode=${imglist.icode}">등록</a> <a
										type="button" class="button primary"
										onclick="return confirm('정말로 삭제하시겠습니까?')"
										href="checkImg/img_delete.jsp?icode=${imglist.icode}">삭제</a></li>
									<c:if test="${i%j == j-1 }">
									</c:if>
									<c:set var="i" value="${i+1 }" />
								</c:forEach>
							</table>
						</ul>
					</div>
				</div>
			</section>
		</div>

		<!-- Footer -->
		<jsp:include page="include/footer.jsp" />

	</div>

	<!-- Scripts -->
	<script src="./../assets/js/jquery.min.js"></script>
	<script src="./../assets/js/jquery.scrollex.min.js"></script>
	<script src="./../assets/js/jquery.scrolly.min.js"></script>
	<script src="./../assets/js/browser.min.js"></script>
	<script src="./../assets/js/breakpoints.min.js"></script>
	<script src="./../assets/js/util.js"></script>
	<script src="./../assets/js/main.js"></script>
</body>

</html>