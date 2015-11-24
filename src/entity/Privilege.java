package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Privilege entity. @author MyEclipse Persistence Tools
 */

public class Privilege implements java.io.Serializable {

	// Fields

	private String guid;
	private String name;
	private String description;
	private Set allotprivileges = new HashSet(0);

	// Constructors

	/** default constructor */
	public Privilege() {
	}

	/** minimal constructor */
	public Privilege(String guid, String name, String description) {
		this.guid = guid;
		this.name = name;
		this.description = description;
	}

	/** full constructor */
	public Privilege(String guid, String name, String description,
			Set allotprivileges) {
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.allotprivileges = allotprivileges;
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

	public Set getAllotprivileges() {
		return this.allotprivileges;
	}

	public void setAllotprivileges(Set allotprivileges) {
		this.allotprivileges = allotprivileges;
	}

}