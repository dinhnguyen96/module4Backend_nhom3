package com.example.casestudymodule4.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;
    private Double salary;
    private Date postDate;
    private Date expriteDate;
    private Integer experience;

    @ManyToOne
    private Qualification qualification;
    @ManyToOne
    private ProgramingLanguage programingLanguage;

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Date getExpriteDate() {
        return expriteDate;
    }

    public void setExpriteDate(Date expriteDate) {
        this.expriteDate = expriteDate;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public ProgramingLanguage getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(ProgramingLanguage programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
