package shinhan.campusmap.dto;

import java.util.Date;

public class ImageDTO {
	private int icode;
	private int bcode;
	private String iname;
	private Date date;
	private int ischecked;
	private int represent;
	private String route;
	private String bnameJoin;
	
	public int getIcode() {
		return icode;
	}
	
	public void setIcode(int icode) {
		this.icode = icode;
	}
	
	public int getBcode() {
		return bcode;
	}
	
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	
	public String getIname() {
		return iname;
	}
	
	public void setIname(String iname) {
		this.iname = iname;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getIschecked() {
		return ischecked;
	}
	
	public void setIschecked(int ischecked) {
		this.ischecked = ischecked;
	}
	
	public int getRepresent() {
		return represent;
	}
	
	public void setRepresent(int represent) {
		this.represent = represent;
	}
	
	public String getRoute() {
		return route;
	}
	
	public void setRoute(String route) {
		this.route = route;
	}
	
	public String getBnameJoin() {
		return bnameJoin;
	}

	public void setBnameJoin(String bnameJoin) {
		this.bnameJoin = bnameJoin;
	}

	@Override
	public String toString() {
		return icode + "," + bcode + "," + iname + "," + date + ","
				+ ischecked + "," + represent + "," + route + "," + bnameJoin;
	}
}