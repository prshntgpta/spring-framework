package org.prshntgpta.main.controller;

import java.util.List;

import org.prshntgpta.main.data.CompanyService;
import org.prshntgpta.main.domain.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping(path="/get")
	public Company getCompany(long id) {
		return companyService.getCompanyById(id);
	}
	
	@GetMapping(path="/getAll")
	public List<Company> getAllCompany() {
		return companyService.getAllCompanies();
	}

}
