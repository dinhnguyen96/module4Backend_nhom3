package com.example.casestudymodule4.service.ext;

import com.example.casestudymodule4.model.City;
import com.example.casestudymodule4.service.core.ICoreService;

public interface ICityService extends ICoreService<City>
{
    Iterable<City> findAllCities();
    Integer branchCount();
}
