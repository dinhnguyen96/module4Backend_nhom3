package com.example.casestudymodule4.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double salary;
    private Date postDate;
    private Date expriteDate;
    private Integer experience;
    @ManyToOne
    private Qualification qualification;
    @ManyToOne
    private ProgramingLanguage programingLanguage;
}
