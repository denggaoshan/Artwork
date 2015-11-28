package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Commoditycategory entity. @author MyEclipse Persistence Tools
 */

public class Commoditycategory implements java.io.Serializable {

	// Fields

	private String guid;
	private Commoditycategory commoditycategory;
	private String name;
	private String description;
	private String abstract_;
	private Set commoditycategories = new HashSet(0);
	private Set commodities = new HashSet(0);

	// Constructors

	/** default constructor */
	public Commoditycategory() {
	}

	/** minimal constructor */
	public Commoditycategory(String guid, String name, String description,
			String abstract_) {
		this.guid = guid;
		this.name = name;
		this.description = description;
		this.abstract_ = abstract_;
	}

	/** full constructor */
	public Commoditycategory(String guid, Commoditycategory commoditycategory,
			String name, String description, String abstract_,
			Set commoditycategories, Set commodities) {
		this.guid = guid;
		this.commoditycategory = commoditycategory;
		this.name = name;
		this.description = description;
		this.abstract_ = abstract_;
		this.commoditycategories = commoditycategories;
		this.commodities = commodities;
	}

	// Property accessors

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public Set getCommoditycategories() {
		return this.commoditycategories;
	}

	public void setCommoditycategories(Set commoditycategories) {
		this.commoditycategories = commoditycategories;
	}

	public Set getCommodities() {
		return this.commodities;
	}

	public void setCommodities(Set commodities) {
		this.commodities = commodities;
	}

}