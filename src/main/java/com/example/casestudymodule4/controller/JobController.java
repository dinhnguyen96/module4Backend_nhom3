package com.example.casestudymodule4.controller;

import com.example.casestudymodule4.model.Job;
import com.example.casestudymodule4.service.ext.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/homes/jobs")
public class JobController
{
    @Autowired
    private IJobService jobService;

    @PostMapping ("/searchingJob")
    public ResponseEntity<Iterable<Job>> searchJobBy(@RequestParam(value = "searchLocationByJob", required = false) String cityName,
                                                     @RequestParam(value = "programmingLanguageJob", required = false) Long programmingLanguageId,
                                                     @RequestParam(value = "qualificationName", required = false) String qualificationName)
    {
        List<Job> jobs =(List<Job>)jobService.findJobsByQLOrLCOrPLanguage(programmingLanguageId, qualificationName, cityName);

        if (jobs.size() == 0)
        {
            return new ResponseEntity<>(jobs, HttpStatus.NO_CONTENT);
        }
        else
        {
            return new ResponseEntity<>(jobs, HttpStatus.OK);
        }
    }
}
