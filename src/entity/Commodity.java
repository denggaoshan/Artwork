package entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Commodity entity. @author MyEclipse Persistence Tools
 */

public class Commodity implements java.io.Serializable {

	// Fields

	private String guid;
	private User user;
	private Store store;
	private Commoditycategory commoditycategory;
	private String name;
	private Double price;
	private Double bidIncrement;
	private String abstract_;
	private String description;
	private String keyword;
	private String homeImage;
	private String parameters;
	private Timestamp createdOn;
	private Short type;
	private Boolean topMost;
	private Timestamp onlineTime;
	private Timestamp offlineTime;
	private Short dealStatus;
	private Set orderses = new HashSet(0);
	private Set userlogs = new HashSet(0);
	private Set auctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Commodity() {
	}

	/** minimal constructor */
	public Commodity(String guid, User user, Store store,
			Commoditycategory commoditycategory, String name, Double price,
			String abstract_, String description, String keyword,
			String homeImage, String parameters, Timestamp createdOn,
			Short type, Boolean topMost, Timestamp onlineTime,
			Timestamp offlineTime, Short dealStatus) {
		this.guid = guid;
		this.user = user;
		this.store = store;
		this.commoditycategory = commoditycategory;
		this.name = name;
		this.price = price;
		this.abstract_ = abstract_;
		this.description = description;
		this.keyword = keyword;
		this.homeImage = homeImage;
		this.parameters = parameters;
		this.createdOn = createdOn;
		this.type = type;
		this.topMost = topMost;
		this.onlineTime = onlineTime;
		this.offlineTime = offlineTime;
		this.dealStatus = dealStatus;
	}

	/** full constructor */
	public Commodity(String guid, User user, Store store,
			Commoditycategory commoditycategory, String name, Double price,
			Double bidIncrement, String abstract_, String description,
			String keyword, String homeImage, String parameters,
			Timestamp createdOn, Short type, Boolean topMost,
			Timestamp onlineTime, Timestamp offlineTime, Short dealStatus,
			Set orderses, Set userlogs, Set auctions) {
		this.guid = guid;
		this.user = user;
		this.store = store;
		this.commoditycategory = commoditycategory;
		this.name = name;
		this.price = price;
		this.bidIncrement = bidIncrement;
		this.abstract_ = abstract_;
		this.description = description;
		this.keyword = keyword;
		this.homeImage = homeImage;
		this.parameters = parameters;
		this.createdOn = createdOn;
		this.type = type;
		this.topMost = topMost;
		this.onlineTime = onlineTime;
		this.offlineTime = offlineTime;
		this.dealStatus = dealStatus;
		this.orderses = orderses;
		this.userlogs = userlogs;
		this.auctions = auctions;
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

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Commoditycategory getCommoditycategory() {
		return this.commoditycategory;
	}

	public void setCommoditycategory(Commoditycategory commoditycategory) {
		this.commoditycategory = commoditycategory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getBidIncrement() {
		return this.bidIncrement;
	}

	public void setBidIncrement(Double bidIncrement) {
		this.bidIncrement = bidIncrement;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getHomeImage() {
		return this.homeImage;
	}

	public void setHomeImage(String homeImage) {
		this.homeImage = homeImage;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Boolean getTopMost() {
		return this.topMost;
	}

	public void setTopMost(Boolean topMost) {
		this.topMost = topMost;
	}

	public Timestamp getOnlineTime() {
		return this.onlineTime;
	}

	public void setOnlineTime(Timestamp onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Timestamp getOfflineTime() {
		return this.offlineTime;
	}

	public void setOfflineTime(Timestamp offlineTime) {
		this.offlineTime = offlineTime;
	}

	public Short getDealStatus() {
		return this.dealStatus;
	}

	public void setDealStatus(Short dealStatus) {
		this.dealStatus = dealStatus;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getUserlogs() {
		return this.userlogs;
	}

	public void setUserlogs(Set userlogs) {
		this.userlogs = userlogs;
	}

	public Set getAuctions() {
		return this.auctions;
	}

	public void setAuctions(Set auctions) {
		this.auctions = auctions;
	}

}