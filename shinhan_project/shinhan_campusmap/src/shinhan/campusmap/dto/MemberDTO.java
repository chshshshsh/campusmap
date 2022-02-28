package shinhan.campusmap.dto;

public class MemberDTO {
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "MemberDAO [id=" + id + ", pw=" + pw + "]";
	}
}
