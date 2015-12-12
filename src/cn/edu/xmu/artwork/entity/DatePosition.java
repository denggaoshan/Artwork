package cn.edu.xmu.artwork.entity;

import java.io.Serializable;
import java.sql.Date;

public class DatePosition implements Serializable{
	
	private Information information;
	private Date date;
	private Short position;
	
	
	public Information getInformation() {
		return information;
	}
	public void setInformation(Information information) {
		this.information = information;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Short getPosition() {
		return position;
	}
	public void setPosition(Short position) {
		this.position = position;
	}
	
}
