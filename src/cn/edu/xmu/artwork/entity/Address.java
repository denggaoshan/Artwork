package cn.edu.xmu.artwork.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private String guid;
	private Short masterType;
	private String masterValue;
	private String location;
	private String postcode;
	private String phone;
	private Set ordersForFromAddress = new HashSet(0);
	private Set ordersForToAddress = new HashSet(0);

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** minimal constructor */
	public Address(String guid, Short masterType, String masterValue,
			String location, String postcode, String phone) {
		this.guid = guid;
		this.masterType = masterType;
		this.masterValue = masterValue;
		this.location = location;
		this.postcode = postcode;
		this.phone = phone;
	}

	/** full constructor */
	public Address(String guid, Short masterType, String masterValue,
			String location, String postcode, String phone,
			Set ordersForFromAddress, Set ordersForToAddress) {
		this.guid = guid;
		this.masterType = masterType;
		this.masterValue = masterValue;
		this.location = location;
		this.postcode = postcode;
		this.phone = phone;
		this.ordersForFromAddress = ordersForFromAddress;
		this.ordersForToAddress = ordersForToAddress;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Short getMasterType() {
		return this.masterType;
	}

	public void setMasterType(Short masterType) {
		this.masterType = masterType;
	}

	public String getMasterValue() {
		return this.masterValue;
	}

	public void setMasterValue(String masterValue) {
		this.masterValue = masterValue;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set getOrdersForFromAddress() {
		return this.ordersForFromAddress;
	}

	public void setOrdersForFromAddress(Set ordersForFromAddress) {
		this.ordersForFromAddress = ordersForFromAddress;
	}

	public Set getOrdersForToAddress() {
		return this.ordersForToAddress;
	}

	public void setOrdersForToAddress(Set ordersForToAddress) {
		this.ordersForToAddress = ordersForToAddress;
	}

}