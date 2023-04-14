package com.example.casestudymodule4.repository;

import com.example.casestudymodule4.model.Job;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepository extends JpaRepository<Job,Long> {
    Page<Job> findAllByNameContaining(String name, Pageable pageable);
}
