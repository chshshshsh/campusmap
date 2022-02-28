package shinhan.campusmap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import shinhan.campusmap.dto.MemberDTO;

public class MemberDAO {
	private static Connection con;
	
	public MemberDAO(Connection con) {
		this.con = con;
	}

	/**
	 * id로 비번 가져가기
	 * @return
	 */
	public MemberDTO selectByIdData(String inputid){
		MemberDTO member = new MemberDTO();
		String sql = "select * from member where id=?";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return member;
	}
}
