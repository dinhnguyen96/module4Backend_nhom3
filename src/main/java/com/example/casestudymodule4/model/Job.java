package com.example.casestudymodule4.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salary;
    private String postDate;
    private String expriteDate;
    private Integer experience;
    private String content;

    private String uploadCV;
    private Boolean status=false;
    @ManyToOne
    private Qualification qualification;
    @ManyToOne
    private ProgramingLanguage programingLanguage;


    public Job() {
    }

    public Job(Long id, String name, Double salary, String postDate, String expriteDate, Integer experience, String content, String uploadCV, Boolean status, Qualification qualification, ProgramingLanguage programingLanguage) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.postDate = postDate;
        this.expriteDate = expriteDate;
        this.experience = experience;
        this.content = content;
        this.uploadCV = uploadCV;
        this.status = status;
        this.qualification = qualification;
        this.programingLanguage = programingLanguage;
    }

    public Job(Long id, String name, Double salary, String postDate, String expriteDate, Integer experience, String content, String uploadCV) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.postDate = postDate;
        this.expriteDate = expriteDate;
        this.experience = experience;
        this.content = content;
        this.uploadCV = uploadCV;
    }

    public Job(String name, Double salary, String postDate, String expriteDate, Integer experience, String content, String uploadCV, Qualification qualification, ProgramingLanguage programingLanguage) {
        this.name = name;
        this.salary = salary;
        this.postDate = postDate;
        this.expriteDate = expriteDate;
        this.experience = experience;
        this.content = content;
        this.uploadCV = uploadCV;
        this.qualification = qualification;
        this.programingLanguage = programingLanguage;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getExpriteDate() {
        return expriteDate;
    }

    public void setExpriteDate(String expriteDate) {
        this.expriteDate = expriteDate;
    }

    public String getUploadCV() {
        return uploadCV;
    }

    public void setUploadCV(String uploadCV) {
        this.uploadCV = uploadCV;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
