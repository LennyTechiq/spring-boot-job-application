package com.leo.jobapp.company;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    void createCompany(Company company);

    Company getCompanyById(Long id);

    boolean deleteById(Long id);

    boolean updateCompany(Long id, Company updateCompany);
}
