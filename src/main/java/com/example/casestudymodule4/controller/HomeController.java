package com.example.casestudymodule4.controller;

import com.example.casestudymodule4.model.Company;
import com.example.casestudymodule4.service.ext.ICityService;
import com.example.casestudymodule4.service.ext.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/homes")
public class HomeController
{
    @Autowired
    private ICityService cityService;


    @Autowired
    private ICompanyService companyService;


    @GetMapping("/cityCount")
    public ResponseEntity<Integer> branchCount()
    {
        return new ResponseEntity<>(cityService.branchCount(), HttpStatus.OK);
    }
    @GetMapping("/companyCount")
    public ResponseEntity<Integer> cityCount()
    {
        return new ResponseEntity<>(companyService.companyCount(), HttpStatus.OK);
    }

    @GetMapping("/companies")
    public ResponseEntity<List<Company>> companyList()
    {
        List<Company> companies = (List<Company>) companyService.findAll();

        if (companies.size() == 0)
        {
            return new ResponseEntity<>(companies, HttpStatus.NO_CONTENT);
        }
        else
        {
            return new ResponseEntity<>(companies, HttpStatus.OK);
        }
    }

}
