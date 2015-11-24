package entity;

/**
 * Financelog entity. @author MyEclipse Persistence Tools
 */

public class Financelog implements java.io.Serializable {

	// Fields

	private FinancelogId id;

	// Constructors

	/** default constructor */
	public Financelog() {
	}

	/** full constructor */
	public Financelog(FinancelogId id) {
		this.id = id;
	}

	// Property accessors

	public FinancelogId getId() {
		return this.id;
	}

	public void setId(FinancelogId id) {
		this.id = id;
	}

}