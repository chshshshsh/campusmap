package shinhan.campusmap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import shinhan.campusmap.dto.BuildingInfoDTO;
import shinhan.campusmap.dto.ImageDTO;
import shinhan.campusmap.dto.MemberDTO;

public class BuildingInfoDAO {
	private Connection con;

	public BuildingInfoDAO(Connection con) {
		this.con = con;
	}

	/**
	 * bcode 검색하여 해당하는 튜플 출력
	 * 
	 * @return
	 */
	public BuildingInfoDTO selectBybcodeData(int bcode) {
		BuildingInfoDTO buildingInfo = new BuildingInfoDTO();
		String sql = "select * from building_info where bcode=?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				buildingInfo.setBcode(rs.getInt("bcode"));
				buildingInfo.setBname(rs.getString("bname"));
				buildingInfo.setCampus(rs.getInt("campus"));
				buildingInfo.setDetails(rs.getString("details"));
				buildingInfo.setLatitude(rs.getString("latitude"));
				buildingInfo.setLongitude(rs.getString("longitude"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return buildingInfo;
	}

	   /**
	    * bname 출력 -> 대표사진 설정위함
	    * 
	    * @return
	    */
	   public ArrayList<BuildingInfoDTO> select1cBname() {
	      ArrayList<BuildingInfoDTO> array = new ArrayList<BuildingInfoDTO>();
	      String sql = "select bcode, bname from building_info where campus=1;";

	      try {
	         PreparedStatement pstmt = con.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();

	         while (rs.next()) {
	            BuildingInfoDTO temp = new BuildingInfoDTO();
	            temp.setBcode(rs.getInt("bcode"));
	            temp.setBname(rs.getString("bname"));

	            array.add(temp);
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }

	      return array;
	   }
	   
	   public ArrayList<BuildingInfoDTO> select2cBname() {
	      ArrayList<BuildingInfoDTO> array = new ArrayList<BuildingInfoDTO>();
	      String sql = "select bcode, bname from building_info where campus=2;";

	      try {
	         PreparedStatement pstmt = con.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();

	         while (rs.next()) {
	            BuildingInfoDTO temp = new BuildingInfoDTO();
	            temp.setBcode(rs.getInt("bcode"));
	            temp.setBname(rs.getString("bname"));

	            array.add(temp);
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }

	      return array;
	   }
}
