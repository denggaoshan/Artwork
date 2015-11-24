package entity;

import java.sql.Timestamp;

/**
 * Userlog entity. @author MyEclipse Persistence Tools
 */

public class Userlog implements java.io.Serializable {

	// Fields

	private String guid;
	private User user;
	private Commodity commodity;
	private Timestamp recentlyTime;
	private Integer count;

	// Constructors

	/** default constructor */
	public Userlog() {
	}

	/** full constructor */
	public Userlog(String guid, User user, Commodity commodity,
			Timestamp recentlyTime, Integer count) {
		this.guid = guid;
		this.user = user;
		this.commodity = commodity;
		this.recentlyTime = recentlyTime;
		this.count = count;
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

	public Timestamp getRecentlyTime() {
		return this.recentlyTime;
	}

	public void setRecentlyTime(Timestamp recentlyTime) {
		this.recentlyTime = recentlyTime;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}