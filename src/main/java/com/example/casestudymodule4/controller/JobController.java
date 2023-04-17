package com.example.casestudymodule4.controller;

import com.example.casestudymodule4.model.Job;
import com.example.casestudymodule4.service.ext.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/homes/jobs")
public class JobController {
    @Autowired
    private IJobService jobService;

    @PostMapping("/searchingJob")
    public ResponseEntity<Page<Job>> searchJobBy(@PageableDefault Pageable pageable, @RequestParam(value = "searchLocationByJob", required = false) String cityName,
                                                 @RequestParam(value = "programmingLanguageJob", required = false) Long programmingLanguageId,
                                                 @RequestParam(value = "qualificationName", required = false) String qualificationName) {
        Page<Job> jobs;
        jobs= jobService.findJobsByQLOrLCOrPLanguage(programmingLanguageId, qualificationName, cityName,pageable);

        if (jobs.getTotalPages() == 0) {
            return new ResponseEntity<>(jobs, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(jobs, HttpStatus.OK);
        }
    }
    @GetMapping("/listJob")
    public ResponseEntity<Page<Job>> listJob(@PageableDefault Pageable pageable, Optional<String >name){
        Page<Job>jobs;
        if (name.isPresent()){
            jobs=jobService.findAll(name.get(),pageable);
        }else {
            jobs=jobService.findAll("",pageable);
        }
        return new ResponseEntity<>(jobs,HttpStatus.OK);
    }

    @PostMapping("/createJob")
    public ResponseEntity<Void> createJob(@RequestBody Job job) {
        jobService.save(job);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<Void>deleteJob(@PathVariable(value = "id") Long id){
        jobService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Void>updateJob(@PathVariable(value = "id") Long id){
        Job job=jobService.findOne(id);
        jobService.save(job);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
