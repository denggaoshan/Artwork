package entity;

import java.sql.Timestamp;

/**
 * Systemlog entity. @author MyEclipse Persistence Tools
 */

public class Systemlog implements java.io.Serializable {

	// Fields

	private String guid;
	private User user;
	private String message;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Systemlog() {
	}

	/** full constructor */
	public Systemlog(String guid, User user, String message, Timestamp time) {
		this.guid = guid;
		this.user = user;
		this.message = message;
		this.time = time;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}