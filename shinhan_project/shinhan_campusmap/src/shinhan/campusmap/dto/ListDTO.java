package shinhan.campusmap.dto;

public class ListDTO {
	private int bcode;
	private int ccode;
	private String bname;
	private String cname;
	
	public int getBcode() {
		return bcode;
	}
	
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	
	public int getCcode() {
		return ccode;
	}
	
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return bcode + "," + ccode + "," + bname + " " + cname;
	}
}
