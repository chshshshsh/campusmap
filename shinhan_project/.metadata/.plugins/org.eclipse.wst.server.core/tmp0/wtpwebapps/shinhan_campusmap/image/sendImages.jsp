<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="java.util.ArrayList"%>
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
	
	ArrayList<ImageDTO> route = new ArrayList<ImageDTO>();
	route = dao.selectImages(bcode);
	
	DBConnection.closeConnection(con);
	
	String imageRoutes = "";
	for(int i=0;i<route.size();i++){
		imageRoutes += route.get(i).getRoute();
		System.out.println(route.get(i).getRoute());
		
		if(route.size() - 1 != i){
			imageRoutes += ",";
		}
	}
	
	System.out.println(imageRoutes);
	out.print(imageRoutes);
%>