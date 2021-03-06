<%@page import="shinhan.campusmap.db.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="shinhan.campusmap.dao.ImageDAO"%>
<%@page import="shinhan.campusmap.dto.ImageDTO"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>

<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ImageDTO image = new ImageDTO();
	
    //이미지를 저장할 경로 입력.
    String folderTypePath = "C:/Users/sj/Desktop/shinhan_javaproject/shinhan_project/shinhan_campusmap/WebContent/images";
    int sizeLimit = 5 * 1024 * 1024; // 5메가까지 제한 넘어서면 예외발생
    try {
        MultipartRequest multi = new MultipartRequest(request, folderTypePath, sizeLimit, new DefaultFileRenamePolicy());
        Enumeration files = multi.getFileNames();
        
        //파일 정보가 있다면
        while (files.hasMoreElements()) {
            String name = (String) files.nextElement();
            image.setBcode(Integer.parseInt(name));
            image.setIname(multi.getFilesystemName(name));
            image.setRoute("/shinhan_campusmap/images/" + multi.getFilesystemName(name));
        }
        
        Connection con = DBConnection.openConnection();
        ImageDAO dao = new ImageDAO(con);
        
        boolean result = dao.insertData(image);
        
        DBConnection.closeConnection(con);
        
        System.out.println("result : " + result);
        
        if(result == true) {
        	System.out.println("result : " + result);
        	out.print("true");
        }
        else {
        	System.out.println("result : " + result);
        	out.print("false");
        }
		
    } catch (IOException e) {
    	e.printStackTrace();
    }
%>