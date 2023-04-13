package com.example.casestudymodule4.repository;

import com.example.casestudymodule4.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {
    Page<Account> findAllByNameContaining(String name, Pageable pageable);
}
