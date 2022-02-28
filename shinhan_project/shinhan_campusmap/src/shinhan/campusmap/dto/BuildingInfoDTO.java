package shinhan.campusmap.dto;

public class BuildingInfoDTO {
	private int bcode;
	private String bname;
	private int campus;
	private String details;
	private String latitude;
	private String longitude;
	
	public int getBcode() {
		return bcode;
	}
	
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	
	public String getBname() {
		return bname;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public int getCampus() {
		return campus;
	}
	
	public void setCampus(int campus) {
		this.campus = campus;
	}
	
	public String getDetails() {
		return details;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString() {
		return bcode + "," + bname + "," + campus + "," + details
				+ "," + latitude + "," + longitude;
	}
}
