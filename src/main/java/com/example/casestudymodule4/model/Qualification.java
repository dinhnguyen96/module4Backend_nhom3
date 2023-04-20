package com.example.casestudymodule4.model;

import javax.persistence.*;

@Entity
public class Qualification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Qualification(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Qualification() {
    }

    public Qualification(Long id) {
        this.id = id;
    }

    public Qualification(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
