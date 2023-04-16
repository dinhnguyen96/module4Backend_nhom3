package com.example.casestudymodule4.service.ext;

import com.example.casestudymodule4.model.Company;
import com.example.casestudymodule4.service.core.ICoreService;

public interface ICompanyService extends ICoreService<Company>
{

    Iterable<Company> findAll();
    Integer companyCount();
}
