package cn.edu.xmu.artwork.entity;

/**
 * Allotprivilege entity. @author MyEclipse Persistence Tools
 */

public class Allotprivilege implements java.io.Serializable {

	// Fields

	private String guid;
	private Privilege privilege;
	private Short masterType;
	private String masterValue;

	// Constructors

	/** default constructor */
	public Allotprivilege() {
	}

	/** full constructor */
	public Allotprivilege(String guid, Privilege privilege, Short masterType,
			String masterValue) {
		this.guid = guid;
		this.privilege = privilege;
		this.masterType = masterType;
		this.masterValue = masterValue;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Privilege getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
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

}