package entity;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String guid;
	private User user;
	private Address addressByToAddress;
	private Address addressByFromAddress;
	private Commodity commodity;
	private Long price;
	private Short discountType;
	private Long discountValue;
	private Long donePrice;
	private String expressNumber;
	private Timestamp createdOn;
	private Short dealStatus;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(String guid, User user, Address addressByToAddress,
			Address addressByFromAddress, Commodity commodity, Long price,
			Short discountType, Long discountValue, Long donePrice,
			String expressNumber, Timestamp createdOn, Short dealStatus) {
		this.guid = guid;
		this.user = user;
		this.addressByToAddress = addressByToAddress;
		this.addressByFromAddress = addressByFromAddress;
		this.commodity = commodity;
		this.price = price;
		this.discountType = discountType;
		this.discountValue = discountValue;
		this.donePrice = donePrice;
		this.expressNumber = expressNumber;
		this.createdOn = createdOn;
		this.dealStatus = dealStatus;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getAddressByToAddress() {
		return this.addressByToAddress;
	}

	public void setAddressByToAddress(Address addressByToAddress) {
		this.addressByToAddress = addressByToAddress;
	}

	public Address getAddressByFromAddress() {
		return this.addressByFromAddress;
	}

	public void setAddressByFromAddress(Address addressByFromAddress) {
		this.addressByFromAddress = addressByFromAddress;
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Short getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(Short discountType) {
		this.discountType = discountType;
	}

	public Long getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Long discountValue) {
		this.discountValue = discountValue;
	}

	public Long getDonePrice() {
		return this.donePrice;
	}

	public void setDonePrice(Long donePrice) {
		this.donePrice = donePrice;
	}

	public String getExpressNumber() {
		return this.expressNumber;
	}

	public void setExpressNumber(String expressNumber) {
		this.expressNumber = expressNumber;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Short getDealStatus() {
		return this.dealStatus;
	}

	public void setDealStatus(Short dealStatus) {
		this.dealStatus = dealStatus;
	}

}