package entity;

import java.sql.Timestamp;

/**
 * Advertorial entity. @author MyEclipse Persistence Tools
 */

public class Advertorial implements java.io.Serializable {

	// Fields

	private String guid;
	private User userByAuditGuid;
	private User userByAuthorGuid;
	private Advertorialscategory advertorialscategory;
	private String topic;
	private String abstract_;
	private String content;
	private String keyword;
	private Timestamp createdOn;
	private Timestamp updatedOn;
	private Short targetType;
	private String targetGuid;
	private Timestamp onlineTime;
	private Timestamp offlineTime;
	private Short position;
	private Integer clickCount;
	private Boolean topMost;
	private Short verifyStatus;
	private String homeImage;
	private Boolean isDisplay;

	// Constructors

	/** default constructor */
	public Advertorial() {
	}

	/** full constructor */
	public Advertorial(String guid, User userByAuditGuid,
			User userByAuthorGuid, Advertorialscategory advertorialscategory,
			String topic, String abstract_, String content, String keyword,
			Timestamp createdOn, Timestamp updatedOn, Short targetType,
			String targetGuid, Timestamp onlineTime, Timestamp offlineTime,
			Short position, Integer clickCount, Boolean topMost,
			Short verifyStatus, String homeImage, Boolean isDisplay) {
		this.guid = guid;
		this.userByAuditGuid = userByAuditGuid;
		this.userByAuthorGuid = userByAuthorGuid;
		this.advertorialscategory = advertorialscategory;
		this.topic = topic;
		this.abstract_ = abstract_;
		this.content = content;
		this.keyword = keyword;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.targetType = targetType;
		this.targetGuid = targetGuid;
		this.onlineTime = onlineTime;
		this.offlineTime = offlineTime;
		this.position = position;
		this.clickCount = clickCount;
		this.topMost = topMost;
		this.verifyStatus = verifyStatus;
		this.homeImage = homeImage;
		this.isDisplay = isDisplay;
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

	public User getUserByAuthorGuid() {
		return this.userByAuthorGuid;
	}

	public void setUserByAuthorGuid(User userByAuthorGuid) {
		this.userByAuthorGuid = userByAuthorGuid;
	}

	public Advertorialscategory getAdvertorialscategory() {
		return this.advertorialscategory;
	}

	public void setAdvertorialscategory(
			Advertorialscategory advertorialscategory) {
		this.advertorialscategory = advertorialscategory;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Short getTargetType() {
		return this.targetType;
	}

	public void setTargetType(Short targetType) {
		this.targetType = targetType;
	}

	public String getTargetGuid() {
		return this.targetGuid;
	}

	public void setTargetGuid(String targetGuid) {
		this.targetGuid = targetGuid;
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

	public Short getPosition() {
		return this.position;
	}

	public void setPosition(Short position) {
		this.position = position;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Boolean getTopMost() {
		return this.topMost;
	}

	public void setTopMost(Boolean topMost) {
		this.topMost = topMost;
	}

	public Short getVerifyStatus() {
		return this.verifyStatus;
	}

	public void setVerifyStatus(Short verifyStatus) {
		this.verifyStatus = verifyStatus;
	}

	public String getHomeImage() {
		return this.homeImage;
	}

	public void setHomeImage(String homeImage) {
		this.homeImage = homeImage;
	}

	public Boolean getIsDisplay() {
		return this.isDisplay;
	}

	public void setIsDisplay(Boolean isDisplay) {
		this.isDisplay = isDisplay;
	}

}