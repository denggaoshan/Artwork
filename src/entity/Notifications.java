package entity;

import java.sql.Timestamp;

/**
 * Notifications entity. @author MyEclipse Persistence Tools
 */

public class Notifications implements java.io.Serializable {

	// Fields

	private String guid;
	private User userByFromGuid;
	private User userByToGuid;
	private String title;
	private String notiContent;
	private String fromUser;
	private String toUser;
	private Short messageType;
	private Boolean isRead;
	private Boolean isHide;
	private Timestamp sendTime;

	// Constructors

	/** default constructor */
	public Notifications() {
	}

	/** full constructor */
	public Notifications(String guid, User userByFromGuid, User userByToGuid,
			String title, String notiContent, String fromUser, String toUser,
			Short messageType, Boolean isRead, Boolean isHide,
			Timestamp sendTime) {
		this.guid = guid;
		this.userByFromGuid = userByFromGuid;
		this.userByToGuid = userByToGuid;
		this.title = title;
		this.notiContent = notiContent;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.messageType = messageType;
		this.isRead = isRead;
		this.isHide = isHide;
		this.sendTime = sendTime;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public User getUserByFromGuid() {
		return this.userByFromGuid;
	}

	public void setUserByFromGuid(User userByFromGuid) {
		this.userByFromGuid = userByFromGuid;
	}

	public User getUserByToGuid() {
		return this.userByToGuid;
	}

	public void setUserByToGuid(User userByToGuid) {
		this.userByToGuid = userByToGuid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNotiContent() {
		return this.notiContent;
	}

	public void setNotiContent(String notiContent) {
		this.notiContent = notiContent;
	}

	public String getFromUser() {
		return this.fromUser;
	}

	public void setFromUser(String fromUser) {
		this.fromUser = fromUser;
	}

	public String getToUser() {
		return this.toUser;
	}

	public void setToUser(String toUser) {
		this.toUser = toUser;
	}

	public Short getMessageType() {
		return this.messageType;
	}

	public void setMessageType(Short messageType) {
		this.messageType = messageType;
	}

	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

	public Boolean getIsHide() {
		return this.isHide;
	}

	public void setIsHide(Boolean isHide) {
		this.isHide = isHide;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

}