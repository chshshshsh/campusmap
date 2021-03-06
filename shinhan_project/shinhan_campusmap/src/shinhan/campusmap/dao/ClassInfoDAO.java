package shinhan.campusmap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shinhan.campusmap.dto.ClassInfoDTO;
import shinhan.campusmap.dto.ListDTO;

public class ClassInfoDAO {
	private Connection con;
	
	public ClassInfoDAO(Connection con) {
		this.con = con;
	}
	
	// ??ü bcode, ccode, cname
	public ArrayList<ListDTO> selectAllData(){
		ArrayList<ListDTO> listInfo = new ArrayList<ListDTO>();
		String sql = "select b.bcode, b.bname, c.ccode, c.cname "
				+ "from building_info as b join class_info as c "
				+ "on b.bcode = c.bcode ";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ListDTO temp = new ListDTO();
				temp.setBcode(rs.getInt("b.bcode"));
				temp.setBname(rs.getString("b.bname"));
				temp.setCcode(rs.getInt("c.ccode"));
				temp.setCname(rs.getString("c.cname"));
				listInfo.add(temp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listInfo;
	}
	
	// bcode -> ccode, cname
	public ArrayList<ClassInfoDTO> selectByBcodeData(int bcode){
		ArrayList<ClassInfoDTO> classInfo = new ArrayList<ClassInfoDTO>();
		String sql = "select ccode, cname from class_info where bcode=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				ClassInfoDTO temp = new ClassInfoDTO();
				temp.setCcode(rs.getInt("ccode"));
				temp.setCname(rs.getString("cname"));
				classInfo.add(temp);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return classInfo;
	}
	
	// bcode,ccode -> b.campus, b.bname, c.cname, c.place, c.details
	public ArrayList<String> selectByBCcodeData(int bcode, int ccode){
		ArrayList<String> classInfo = new ArrayList<String>();
		String sql = "select b.campus, b.bname, c.cname, c.place, c.details "
				+ "from building_info as b join class_info as c "
				+ "on b.bcode = c.bcode "
				+ "where c.bcode=? and c.ccode=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			pstmt.setInt(2, ccode);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				classInfo.add(Integer.toBinaryString(rs.getInt("b.campus")));
				classInfo.add(rs.getString("b.bname"));
				classInfo.add(rs.getString("c.cname"));
				classInfo.add(rs.getString("c.place"));
				classInfo.add(rs.getString("c.details"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return classInfo;
	}
}
