package shinhan.campusmap.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection openConnection(){
		Connection con = null;
		try {
			String url = "jdbc:mysql://13.124.129.54:3306/shinhan";	
			String id = "sj";
			String passwd = "sj";
			con = DriverManager.getConnection(url, id, passwd);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void closeConnection(Connection con){
		if(con != null){
			try {
				con.close();
				System.out.println("데이터베이스 종료 성공");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}