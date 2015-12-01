package cn.edu.xmu.artwork.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Store entity. @author MyEclipse Persistence Tools
 */

public class Store implements java.io.Serializable {

	// Fields

	private String guid;
	private User userByAuditGuid;
	private User userByOwnerGuid;
	private String name;
	private String description;
	private String keyword;
	private String homeImage;
	private Timestamp createdOn;
	private Short type;
	private Short verifyStatus;
	private Boolean topMost;
	private Float satisfaction;
	private Set commodities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Store() {
	}

	/** minimal constructor */
	public Store(String guid, User userByAuditGuid, User userByOwnerGuid,
			String name, String description, String keyword, String homeImage,
			Timestamp createdOn, Short type, Short verifyStatus,
			Boolean topMost, Float satisfaction) {
		this.guid = guid;
		this.userByAuditGuid = userByAuditGuid;
		this.userByOwnerGuid = userByOwnerGuid;
		this.name = name;
		this.description = description;
		this.keyword = keyword;
		this.homeImage = homeImage;
		this.createdOn = createdOn;
		this.type = type;
		this.verifyStatus = verifyStatus;
		this.topMost = topMost;
		this.satisfaction = satisfaction;
	}

	/** full constructor */
	public Store(String guid, User userByAuditGuid, User userByOwnerGuid,
			String name, String description, String keyword, String homeImage,
			Timestamp createdOn, Short type, Short verifyStatus,
			Boolean topMost, Float satisfaction, Set commodities) {
		this.guid = guid;
		this.userByAuditGuid = userByAuditGuid;
		this.userByOwnerGuid = userByOwnerGuid;
		this.name = name;
		this.description = description;
		this.keyword = keyword;
		this.homeImage = homeImage;
		this.createdOn = createdOn;
		this.type = type;
		this.verifyStatus = verifyStatus;
		this.topMost = topMost;
		this.satisfaction = satisfaction;
		this.commodities = commodities;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public User getUserByAuditGuid() {
		return this.userByAuditGuid;
	}

	public void setUserByAuditGuid(User userByAuditGuid) {
		this.userByAuditGuid = userByAuditGuid;
	}

	public User getUserByOwnerGuid() {
		return this.userByOwnerGuid;
	}

	public void setUserByOwnerGuid(User userByOwnerGuid) {
		this.userByOwnerGuid = userByOwnerGuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Short getVerifyStatus() {
		return this.verifyStatus;
	}

	public void setVerifyStatus(Short verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public Boolean getTopMost() {
		return this.topMost;
	}

	public void setTopMost(Boolean topMost) {
		this.topMost = topMost;
	}

	public Float getSatisfaction() {
		return this.satisfaction;
	}

	public void setSatisfaction(Float satisfaction) {
		this.satisfaction = satisfaction;
	}

	public Set getCommodities() {
		return this.commodities;
	}

	public void setCommodities(Set commodities) {
		this.commodities = commodities;
	}

}