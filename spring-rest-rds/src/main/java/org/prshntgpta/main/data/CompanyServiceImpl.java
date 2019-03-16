package org.prshntgpta.main.data;

import java.util.List;

import org.prshntgpta.main.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public List<Company> getAllCompanies() {
		return (List<Company>)companyRepository.findAll();
	}

	@Override
	public Company getCompanyById(long id) {
		return companyRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Company company) {
		companyRepository.save(company);
		
	}

	@Override
	public void deleteCompany(long id) {
		companyRepository.deleteById(id);
		
	}
	
	@Override
	public void deleteCompany(Company company) {
		companyRepository.delete(company);
		
	}

}
