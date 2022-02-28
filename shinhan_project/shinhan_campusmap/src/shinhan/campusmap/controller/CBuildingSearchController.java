package shinhan.campusmap.controller;

import java.io.*;
import java.sql.Connection;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import shinhan.campusmap.dao.BuildingInfoDAO;
import shinhan.campusmap.db.DBConnection;
import shinhan.campusmap.dto.BuildingInfoDTO;

public class CBuildingSearchController implements Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		// Parameter 추출
		String bname = request.getParameter("bname"); // 빌딩 이름

		Connection con = DBConnection.openConnection();
		BuildingInfoDAO bDAO = new BuildingInfoDAO(con);
		BuildingInfoDTO bDTO = new BuildingInfoDTO();
		
		
		
		DBConnection.closeConnection(con);
		
		String result = Integer.toBinaryString(bDTO.getCampus())+ "," + bDTO.getDetails();
		System.out.println(result);
		
	}
}
