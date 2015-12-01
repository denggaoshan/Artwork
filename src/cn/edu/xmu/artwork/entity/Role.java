package cn.edu.xmu.artwork.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private String guid;
	private String name;
	private String description;
	private Integer count;
	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(String guid, String name, String description, Integer count) {
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.count = count;
	}

	/** full constructor */
	public Role(String guid, String name, String description, Integer count,
			Set users) {
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.count = count;
		this.users = users;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}