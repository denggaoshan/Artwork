package entity;

import java.sql.Timestamp;

/**
 * Auction entity. @author MyEclipse Persistence Tools
 */

public class Auction implements java.io.Serializable 
{

	// Fields

	private String guid;
	private User user;
	private Commodity commodity;
	private Double price;
	private Timestamp createdOn;

	// Constructors

	/** default constructor */
	public Auction() {
	}

	/** full constructor */
	public Auction(String guid, User user, Commodity commodity, Double price,
			Timestamp createdOn) {
		this.guid = guid;
		this.user = user;
		this.commodity = commodity;
		this.price = price;
		this.createdOn = createdOn;
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

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

}