<%@page import="shinhan.campusmap.dto.MemberDTO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="shinhan.campusmap.dto.BuildingInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	int bcode = 101;
	//int bcode = Integer.parseInt(request.getParameter("bcode"));

	Connection con1 = DBConnection.openConnection();
	ArrayList<ImageDTO> array1 = new ArrayList<ImageDTO>();
	ImageDAO imageDAO = new ImageDAO(con1);
	array1 = imageDAO.selectIschecked(bcode);
	request.setAttribute("mgt_content", array1);
	DBConnection.closeConnection(con1);
%>

<!-- (mgt_list 건물이름에 해당하는 사진목록) ======== 대표사진 설정페이지 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shinhan Campus Map Administrator Page</title>
</head>
<body>
	<div class="box alt" style="width: 75%; float: right;">
		<div class="row gtr-uniform">
			<ul class="features">
				<c:set var="i" value="0" />
				<c:set var="j" value="3" />
				<table border="1">
					<c:forEach items="${mgt_content}" var="mgt_content">
						<c:if test="${i%j == 0 }">
							<tr>
						</c:if>
						<li><span class="gallery"><img
								src=${mgt_content.route } alt="${mgt_content.icode}" /></span>

						<!-- id세션 있을때만 버튼보임 -->
						<c:if test="${sessionScope.member_id != null}">
							<a type="submit" class="button primary" name="select" style="max-width: 100%; max-height: 100%;"
								onclick="return confirm('대표사진으로 설정하시겠습니까?')"
								href="represent.jsp?icode=${mgt_content.icode}&bcode=${mgt_content.bcode}">대표사진
								선택</a></li>
						</c:if>
						<c:if test="${i%j == j-1 }">
						</c:if>
						<c:set var="i" value="${i+1 }" />
					</c:forEach>
				</table>
			</ul>
		</div>
	</div>
</body>
</html>