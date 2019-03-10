package org.prshntgpta.dao;

import java.util.List;

import javax.sql.DataSource;

import org.prshntgpta.domain.Company;

public interface CompanyDao {
	
	 public void setDataSource(DataSource ds);
	   
	   /** 
	      * This is the method to be used to create
	      * a record in the Student table.
	   */
	   public void create(String id, String companyName);
	   
	   /** 
	      * This is the method to be used to list down
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public Company getCompany(String id);
	   
	   /** 
	      * This is the method to be used to list down
	      * all the records from the Student table.
	   */
	   public List<Company> listCompanies();
	   
	   /** 
	      * This is the method to be used to delete
	      * a record from the Student table corresponding
	      * to a passed student id.
	   */
	   public void delete(String id);
	   
	   /** 
	      * This is the method to be used to update
	      * a record into the Student table.
	   */
	   public void update(String id, String companyName);

}
