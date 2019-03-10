package org.prshntgpta.controller;

import org.prshntgpta.domain.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@GetMapping(path="/get")
	public Company getCompany(String id) {
		return new Company(id,"Test");
	}

}
