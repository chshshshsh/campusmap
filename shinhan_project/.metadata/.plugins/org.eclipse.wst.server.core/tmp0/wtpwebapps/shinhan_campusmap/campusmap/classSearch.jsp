<%@page import="shinhan.campusmap.dto.ClassInfoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.dao.ClassInfoDAO"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 클래스 번호로 해당 클래스 가져오기
	String info[] = request.getParameter("info").split(",");

	int bcode = Integer.parseInt(info[0]);
	int ccode = Integer.parseInt(info[1]);

	System.out.println("bcode ccode" + bcode + "," + ccode);
	
	Connection con = DBConnection.openConnection();

	ClassInfoDAO cDAO = new ClassInfoDAO(con);
	ArrayList<String> classInfo = cDAO.selectByBCcodeData(bcode, ccode);

	DBConnection.closeConnection(con);

	String result = "";
	
	for(int i=0;i<classInfo.size();i++){
		result += classInfo.get(i);
		if(i != classInfo.size() -1){
			result += ",";
		}
	}
	
	System.out.println(result);

	out.print(result);
%>