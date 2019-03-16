package org.prshntgpta.main.data;

import org.prshntgpta.main.domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}