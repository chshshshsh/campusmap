<%@page import="shinhan.campusmap.dto.ClassInfoDTO"%>
<%@page import="shinhan.campusmap.dao.ClassInfoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// bcode에 해당하는 클래스 가져오기(BuildingFragment)
	int bcode = Integer.parseInt(request.getParameter("bcode"));

	System.out.println(bcode);

	Connection con = DBConnection.openConnection();
	ClassInfoDAO cDAO = new ClassInfoDAO(con);
	
	ArrayList<ClassInfoDTO> classInfo = new ArrayList<ClassInfoDTO>();

	classInfo = cDAO.selectByBcodeData(bcode);
	
	DBConnection.closeConnection(con);
	
	String result = "";
	
	for(int i = 0; i < classInfo.size(); i++){
		result += classInfo.get(i).getCcode() + "," + classInfo.get(i).getCname();
		
		if(i != classInfo.size() -1){
			result += ",";
		}
	}
	
	System.out.println(result);

	out.print(result);
%>