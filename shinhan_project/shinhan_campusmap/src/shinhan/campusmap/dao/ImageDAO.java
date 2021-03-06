package shinhan.campusmap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import shinhan.campusmap.dto.ImageDTO;
import shinhan.campusmap.dto.MemberDTO;

public class ImageDAO {
	private Connection con;

	public ImageDAO(Connection con) {
		this.con = con;
	}

	/**
	 * 확인안된 데이터 출력 + bcode -> bname
	 * 
	 * @return
	 */
	public ArrayList<ImageDTO> selectIsNotchecked() {
		ArrayList<ImageDTO> array = new ArrayList<ImageDTO>();

		String sql = "select * from image as img join building_info as binfo on binfo.bcode = img.bcode where ischecked=0; ";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				ImageDTO temp = new ImageDTO();
				temp.setIcode(rs.getInt("icode"));
				temp.setIname(rs.getString("iname"));
				temp.setBnameJoin(rs.getString("binfo.bname"));
				temp.setRoute(rs.getString("route"));

				array.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return array;

	}

	/**
	 * 등록확정된 데이터 출력
	 * 
	 * @return
	 */
	public ArrayList<ImageDTO> selectIschecked(int bcode) {
		ArrayList<ImageDTO> image = new ArrayList<ImageDTO>();
		String sql = "select * from image where ischecked=1 and bcode = ?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				ImageDTO temp = new ImageDTO();
				temp.setIcode(rs.getInt("icode"));
				temp.setBcode(rs.getInt("bcode"));
				temp.setIname(rs.getString("iname"));
				temp.setRoute(rs.getString("route"));
				temp.setIschecked(rs.getInt("ischecked"));
				
				image.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return image;
	}

	/**
	 * Imgdata 삽입
	 */
	public boolean insertData(ImageDTO image) {
		boolean result = true;
		
		LocalDateTime date = LocalDateTime.now();
		java.sql.Date sqlDate = java.sql.Date.valueOf(date.toLocalDate());

		String sql = "insert into image(bcode, iname, date, route) values(?,?,?,?)";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, image.getBcode());
			pstmt.setString(2, image.getIname());
			pstmt.setDate(3, sqlDate);
			pstmt.setString(4, image.getRoute());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return result;
	}

	/**
	 * 삭제
	 */
	public boolean deleteData(int icode) {
		boolean result = true;

		String sql = "delete from image where icode=?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, icode);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return result;
	}


	/**
	 * 검수한 사진 ischecked 1로 수정
	 */
	public boolean updateChecked(int icode) {
		boolean result = true;

		String sql = "update image set ischecked=1 where icode=?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, icode);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return result;
	}
	/**
	 * 대표사진 설정 시 -> 건물별로 represent 1로 변경   나머지-> 0으로
	 */
	public boolean updateRepresent(int icode, int bcode) {
		boolean result = true;

		String sql = "UPDATE image SET represent = IF (icode = ?, 1, 0) WHERE bcode=?;";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, icode);
			pstmt.setInt(2, bcode);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return result;
	}
	

	/**
	 * 대표이미지 가져오기
	 * 
	 * @return
	 */
	public String selectRepresent(int bcode) {
		String r = "";
		String sql = "select route from image where represent = 1 and bcode = ?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				r = rs.getString("route");
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}
	
	/**
	 * 대표이미지 가져오기
	 * 
	 * @return
	 */
	public ArrayList<ImageDTO> selectImages(int bcode) {
		ArrayList<ImageDTO> r = new ArrayList<ImageDTO>();
		String sql = "select route from image where represent = 0 and bcode = ?";

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bcode);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ImageDTO temp = new ImageDTO();
				temp.setRoute(rs.getString("route"));
				
				r.add(temp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}
}