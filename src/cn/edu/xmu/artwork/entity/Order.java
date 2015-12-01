package cn.edu.xmu.artwork.entity;

import java.sql.Timestamp;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private String guid;
	private User user;
	private Address addressByToAddress;
	private Address addressByFromAddress;
	private Commodity commodity;
	private Double price;
	private Short discountType;
	private Double discountValue;
	private Double donePrice;
	private String expressNumber;
	private Timestamp createdOn;
	private Short dealStatus;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(String guid, User user, Address addressByToAddress,
			Address addressByFromAddress, Commodity commodity, Double price,
			Short discountType, Double discountValue, Double donePrice,
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Short getDiscountType() {
		return this.discountType;
	}

	public void setDiscountType(Short discountType) {
		this.discountType = discountType;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Double getDonePrice() {
		return this.donePrice;
	}

	public void setDonePrice(Double donePrice) {
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