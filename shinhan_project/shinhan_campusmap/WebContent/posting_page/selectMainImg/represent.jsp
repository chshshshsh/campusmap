<%@page import="java.io.PrintWriter"%>
<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	int icode = Integer.parseInt(request.getParameter("icode"));
	int bcode = Integer.parseInt(request.getParameter("bcode"));

	Connection con1 = DBConnection.openConnection();
	ImageDAO imageDAO = new ImageDAO(con1);

	boolean result = imageDAO.updateRepresent(icode, bcode);

	PrintWriter script = response.getWriter();
	
	script.println("<script>");
	script.println("location.href='../mgt_list.jsp'");
	script.println("</script>");
	

%>
