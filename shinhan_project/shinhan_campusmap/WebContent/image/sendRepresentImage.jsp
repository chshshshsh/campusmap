<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int bcode = Integer.parseInt(request.getParameter("bcode"));
	System.out.println("bcode " + bcode);
	
	Connection con = DBConnection.openConnection();
	ImageDAO dao = new ImageDAO(con);
	
	String route = "";
	route = dao.selectRepresent(bcode);
	
	DBConnection.closeConnection(con);
	
	System.out.println(route);
	out.print(route);
%>