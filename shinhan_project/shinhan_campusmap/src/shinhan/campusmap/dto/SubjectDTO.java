package shinhan.campusmap.dto;

import java.util.Date;

public class SubjectDTO {
	private String scode;
	private int division;
	private String sdomain;
	private String sname;
	private String professor;
	private String lecture_object;
	private String lecture_day;
	private Date lecture_endtime;
	private Date lecture_starttime;
	
	public String getScode() {
		return scode;
	}
	
	public void setScode(String scode) {
		this.scode = scode;
	}
	
	public int getDivision() {
		return division;
	}
	
	public void setDivision(int division) {
		this.division = division;
	}
	
	public String getSdomain() {
		return sdomain;
	}
	
	public void setSdomain(String sdomain) {
		this.sdomain = sdomain;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getLecture_object() {
		return lecture_object;
	}
	
	public void setLecture_object(String lecture_object) {
		this.lecture_object = lecture_object;
	}
	
	public String getLecture_day() {
		return lecture_day;
	}
	
	public void setLecture_day(String lecture_day) {
		this.lecture_day = lecture_day;
	}
	
	public Date getLecture_endtime() {
		return lecture_endtime;
	}
	
	public void setLecture_endtime(Date lecture_endtime) {
		this.lecture_endtime = lecture_endtime;
	}
	
	public Date getLecture_starttime() {
		return lecture_starttime;
	}
	
	public void setLecture_starttime(Date lecture_starttime) {
		this.lecture_starttime = lecture_starttime;
	}

	@Override
	public String toString() {
		return "SubjectDTO [scode=" + scode + ", division=" + division + ", sdomain=" + sdomain + ", sname=" + sname
				+ ", professor=" + professor + ", lecture_object=" + lecture_object + ", lecture_day=" + lecture_day
				+ ", lecture_endtime=" + lecture_endtime + ", lecture_starttime=" + lecture_starttime + "]";
	}
	
}
