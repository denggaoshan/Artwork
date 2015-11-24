package entity;

import java.sql.Timestamp;

/**
 * FinancelogId entity. @author MyEclipse Persistence Tools
 */

public class FinancelogId implements java.io.Serializable {

	// Fields

	private String guid;
	private Short type;
	private String userGuid;
	private String orderGuid;
	private Long price;
	private Short status;
	private Timestamp createTime;
	private Timestamp doneTime;

	// Constructors

	/** default constructor */
	public FinancelogId() {
	}

	/** full constructor */
	public FinancelogId(String guid, Short type, String userGuid,
			String orderGuid, Long price, Short status, Timestamp createTime,
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

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FinancelogId))
			return false;
		FinancelogId castOther = (FinancelogId) other;

		return ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
				&& castOther.getGuid() != null && this.getGuid().equals(
				castOther.getGuid())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null
						&& castOther.getType() != null && this.getType()
						.equals(castOther.getType())))
				&& ((this.getUserGuid() == castOther.getUserGuid()) || (this
						.getUserGuid() != null
						&& castOther.getUserGuid() != null && this
						.getUserGuid().equals(castOther.getUserGuid())))
				&& ((this.getOrderGuid() == castOther.getOrderGuid()) || (this
						.getOrderGuid() != null
						&& castOther.getOrderGuid() != null && this
						.getOrderGuid().equals(castOther.getOrderGuid())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getCreateTime() == castOther.getCreateTime()) || (this
						.getCreateTime() != null
						&& castOther.getCreateTime() != null && this
						.getCreateTime().equals(castOther.getCreateTime())))
				&& ((this.getDoneTime() == castOther.getDoneTime()) || (this
						.getDoneTime() != null
						&& castOther.getDoneTime() != null && this
						.getDoneTime().equals(castOther.getDoneTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result
				+ (getUserGuid() == null ? 0 : this.getUserGuid().hashCode());
		result = 37 * result
				+ (getOrderGuid() == null ? 0 : this.getOrderGuid().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37
				* result
				+ (getCreateTime() == null ? 0 : this.getCreateTime()
						.hashCode());
		result = 37 * result
				+ (getDoneTime() == null ? 0 : this.getDoneTime().hashCode());
		return result;
	}

}