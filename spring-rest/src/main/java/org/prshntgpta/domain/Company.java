package org.prshntgpta.domain;

public class Company {
	
	private String id;
	
	private String companyName;

	public Company(String id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getId() {
		return id;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setId(String id) {
		this.id = id;
	}

}
