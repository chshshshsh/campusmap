package shinhan.campusmap.dto;

public class ClassInfoDTO {
	private int ccode;
	private int bcode;
	private String cname;
	private String place;
	private String purpose;
	private String details;
	
	public int getCcode() {
		return ccode;
	}
	
	public void setCcode(int ccode) {
		this.ccode = ccode;
	}
	
	public int getBcode() {
		return bcode;
	}
	
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String getPurpose() {
		return purpose;
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return ccode + "," + bcode + "," + cname + "," + place + "," + purpose + "," + details;
	}
}
