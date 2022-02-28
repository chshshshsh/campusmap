<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="shinhan.campusmap.dao.BuildingInfoDAO"%>
<%@page import="shinhan.campusmap.dto.BuildingInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	Connection con1 = DBConnection.openConnection();
	ArrayList<BuildingInfoDTO> array1 = new ArrayList<BuildingInfoDTO>();
	BuildingInfoDAO dao1 = new BuildingInfoDAO(con1);
	array1 = dao1.select1cBname();
	request.setAttribute("mgt_1clist", array1);

	ArrayList<BuildingInfoDTO> array2 = new ArrayList<BuildingInfoDTO>();
	array2 = dao1.select2cBname();
	request.setAttribute("mgt_2clist", array2);
	DBConnection.closeConnection(con1);
%>

<!-- 건물이름 목록 페이지 -->

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

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Nav -->
		<nav id="nav">
			<ul>
				<li><a href="../posting_page/main.jsp">Introduction</a></li>
				<li><a href="../posting_page/img_list.jsp">CheckingPicture</a></li>
				<li><a href="../posting_page/mgt_main.jsp" class="active">SelectingMainPicture</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<div id="main">

			<!-- Content -->
			<section id="content" class="main">


				<!-- Second Section -->
				<section id="selecting" class="main special">
					<header class="major">
						<h2>Selecting Main Picture</h2>
					</header>
					<p>대표사진으로 설정할 사진을 선택하세요 !</p>
					<div class="main" style="width: 20%; float: left;">
						<table>
							<thead>
								<tr>
									<th><strong>의정부캠퍼스</strong></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${mgt_1clist}" var="mgt_1clist">
									<tr>
										<td><a type="submit" class="btn btn-danger"
											href="selectMainImg/mgt_content1.jsp?bcode=${mgt_1clist.bcode}">${mgt_1clist.bname}</a><br>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table> <br>
						
						<table>
							<thead>
								<tr>
									<th><strong>동두천캠퍼스</strong></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${mgt_2clist}" var="mgt_2clist">
									<tr>
										<td><a type="submit" class="btn btn-danger"
											href="selectMainImg/mgt_content1.jsp?bcode=${mgt_2clist.bcode}">${mgt_2clist.bname}</a><br>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					
					
					<div class="box alt" style="width: 75%; float: right;">
                        <div class="row gtr-uniform">
                            <p>대표사진으로 설정할 사진을 선택하세요 !</p>
                            <ul class="features">
                            <c:set var="i" value="0" />
							<c:set var="j" value="3" />
							<table border="1">
								<c:forEach items="${mgt_content}" var="mgtcontent">
									<c:if test="${i%j == 0 }">
										<tr>
									</c:if>
                                <li>
                                    <span class="gallery"><img src=${mgt_content.route }
                                            style="max-width: 100%; height: auto;" alt="" /></span>
                                    <a type="button" class="button primary"
                                    href="selectMainImg/represent.jsp?icode=${mgt_content.icode}&bcode=${mgt_content.bcode}">대표사진으로 선택</a>
                                </li>
                               		<c:if test="${i%j == j-1 }">
									</c:if>
									<c:set var="i" value="${i+1 }" />
								</c:forEach>
							</table>
                            </ul>
                        </div>
                    </div>
					

				</section>
			</section>
			<section>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br> <br> <br> <br> <br>
				<br> <br> <br>
			</section>
		</div>

		<!-- Footer -->
		<jsp:include page="include/footer.jsp" />
	</div>

	<!-- Scripts -->
	<script src="../assets/js/jquery.min.js"></script>
	<script src="../assets/js/jquery.scrollex.min.js"></script>
	<script src="../assets/js/jquery.scrolly.min.js"></script>
	<script src="../assets/js/browser.min.js"></script>
	<script src="../assets/js/breakpoints.min.js"></script>
	<script src="../assets/js/util.js"></script>
	<script src="../assets/js/main.js"></script>
</body>
</html>