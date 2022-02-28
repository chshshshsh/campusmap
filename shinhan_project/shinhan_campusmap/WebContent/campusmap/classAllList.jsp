<%@page import="shinhan.campusmap.dto.ListDTO"%>
<%@page import="shinhan.campusmap.dao.ClassInfoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 모든 클래스 정보 가져오기
	String search = request.getParameter("search");
	System.out.println("search " + search);
	
	if(search.contains("cu")) {
		String[] array_search;
		array_search = search.split("");
		search = "";
		for(int i=0;i<array_search.length;i++){
			if(array_search[i].equals("c")){
				array_search[i] = "C";
			}
			if(array_search[i].equals("u")){
				array_search[i] = "U";
			}
			search += array_search[i];
		}
	}
	
	System.out.println("search2 " + search);

	Connection con = DBConnection.openConnection();
	ClassInfoDAO cDAO = new ClassInfoDAO(con);
	
	ArrayList<ListDTO> lists = new ArrayList<ListDTO>();
	
	lists = cDAO.selectAllData();
	
	DBConnection.closeConnection(con);
	
	String result = "";
	
	if (search.equals("blank")){
		for(int i=0;i<lists.size();i++){
			result += lists.get(i).toString();
			
			if(i != lists.size() - 1)
				result += ",";
		}
	}
	else {
		for(int i=0;i<lists.size();i++){
			if (lists.get(i).getCname().contains(search)
					|| lists.get(i).getBname().contains(search)) {
				result += lists.get(i).toString();
				
				if(i != lists.size() - 1)
					result += ",";
			}
		}
	}
	
	out.print(result);
%>