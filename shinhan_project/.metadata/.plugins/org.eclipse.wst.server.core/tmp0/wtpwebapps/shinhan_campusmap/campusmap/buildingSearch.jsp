<%@page import="shinhan.campusmap.dto.BuildingInfoDTO"%>
<%@page import="shinhan.campusmap.dao.BuildingInfoDAO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 건물 번호로 건물 상세정보 가져오기
	int bcode = Integer.parseInt(request.getParameter("bcode"));
	System.out.println("bcode " + bcode);

	Connection con = DBConnection.openConnection();
	BuildingInfoDAO bDAO = new BuildingInfoDAO(con);
	BuildingInfoDTO bDTO = new BuildingInfoDTO();
	
	bDTO = bDAO.selectBybcodeData(bcode);
	
	DBConnection.closeConnection(con);
	
	String result = bDTO.toString();
	System.out.println(result);
	
	out.print(result);
%>