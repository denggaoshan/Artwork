package cn.edu.xmu.artwork.entity;

import java.sql.Timestamp;

/**
 * Financelog entity. @author MyEclipse Persistence Tools
 */

public class Financelog implements java.io.Serializable {

	// Fields

	private String guid;
	private Short type;
	private String userGuid;
	private String orderGuid;
	private Double price;
	private Short status;
	private Timestamp createTime;
	private Timestamp doneTime;

	// Constructors

	/** default constructor */
	public Financelog() {
	}

	/** full constructor */
	public Financelog(String guid, Short type, String userGuid,
			String orderGuid, Double price, Short status, Timestamp createTime,
			Timestamp doneTime) {
		this.guid = guid;
		this.type = type;
		this.userGuid = userGuid;
		this.orderGuid = orderGuid;
		this.price = price;
		this.status = status;
		this.createTime = createTime;
		this.doneTime = doneTime;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getUserGuid() {
		return this.userGuid;
	}

	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	public String getOrderGuid() {
		return this.orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getDoneTime() {
		return this.doneTime;
	}

	public void setDoneTime(Timestamp doneTime) {
		this.doneTime = doneTime;
	}

}