package org.prshntgpta.main.data;

import java.util.List;

import org.prshntgpta.main.domain.Company;

public interface CompanyService {

	public List<Company> getAllCompanies();

	public Company getCompanyById(long id);

	public void saveOrUpdate(Company company);

	public void deleteCompany(long id);

	void deleteCompany(Company company);

}
