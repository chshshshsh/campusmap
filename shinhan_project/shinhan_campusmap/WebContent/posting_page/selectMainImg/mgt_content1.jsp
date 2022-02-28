<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	int bcode = (request.getParameter("bcode")) == null ? 101 : Integer.parseInt(request.getParameter("bcode"));

	Connection con1 = DBConnection.openConnection();
	ArrayList<ImageDTO> array1 = new ArrayList<ImageDTO>();
	ImageDAO imageDAO = new ImageDAO(con1);
	array1 = imageDAO.selectIschecked(bcode);
	request.setAttribute("mgt_content", array1);
	DBConnection.closeConnection(con1);

	PrintWriter script = response.getWriter();
	session = request.getSession(true);							
	
	
	session.setAttribute("mgt_bcode", bcode);
	System.out.println(bcode);
	
	response.sendRedirect("../mgt_main.jsp");
	
%>
