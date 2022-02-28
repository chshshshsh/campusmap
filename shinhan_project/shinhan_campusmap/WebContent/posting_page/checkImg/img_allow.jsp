<%@page import="java.io.PrintWriter"%>
<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

	<%
		int icode = Integer.parseInt(request.getParameter("icode"));

		Connection con1 = DBConnection.openConnection();
		ImageDAO imageDAO = new ImageDAO(con1);

		boolean result = imageDAO.updateChecked(icode);

		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href='../img_list.jsp'");
		script.println("</script>");
	%>
