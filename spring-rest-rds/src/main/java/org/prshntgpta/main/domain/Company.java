package org.prshntgpta.main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="COMPANY_NAME")
	private String companyName;

	public Company(long id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}

	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getCompanyName() {
		return companyName;
	}

	public long getId() {
		return id;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setId(long id) {
		this.id = id;
	}

}
