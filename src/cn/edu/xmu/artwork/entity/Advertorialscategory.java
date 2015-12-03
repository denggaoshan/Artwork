package cn.edu.xmu.artwork.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Advertorialscategory entity. @author MyEclipse Persistence Tools
 */

public class Advertorialscategory implements java.io.Serializable {

	// Fields

	private String guid;
	private Advertorialscategory advertorialscategory;
	private String name;
	private String description;
	private String abstract_;
	private Set advertorials = new HashSet(0);
	private Set advertorialscategories = new HashSet(0);

	// Constructors

	/** default constructor */
	public Advertorialscategory() {
	}

	/** minimal constructor */
	public Advertorialscategory(String guid, String name, String description,
			String abstract_) {
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.abstract_ = abstract_;
	}

	/** full constructor */
	public Advertorialscategory(String guid,
			Advertorialscategory advertorialscategory, String name,
			String description, String abstract_, Set advertorials,
			Set advertorialscategories) {
		this.guid = guid;
		this.advertorialscategory = advertorialscategory;
		this.name = name;
		this.description = description;
		this.abstract_ = abstract_;
		this.advertorials = advertorials;
		this.advertorialscategories = advertorialscategories;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Advertorialscategory getAdvertorialscategory() {
		return this.advertorialscategory;
	}

	public void setAdvertorialscategory(
			Advertorialscategory advertorialscategory) {
		this.advertorialscategory = advertorialscategory;
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

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public Set getAdvertorials() {
		return this.advertorials;
	}

	public void setAdvertorials(Set advertorials) {
		this.advertorials = advertorials;
	}

	public Set getAdvertorialscategories() {
		return this.advertorialscategories;
	}

	public void setAdvertorialscategories(Set advertorialscategories) {
		this.advertorialscategories = advertorialscategories;
	}

}