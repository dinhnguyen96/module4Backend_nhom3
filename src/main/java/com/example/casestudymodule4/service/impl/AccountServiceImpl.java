package com.example.casestudymodule4.service.impl;

import com.example.casestudymodule4.model.Account;
import com.example.casestudymodule4.repository.IAccountRepository;
import com.example.casestudymodule4.service.ext.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Page<Account> findAll(String gmail, Pageable pageable) {
        return accountRepository.findAllByGmailContaining(gmail, pageable);
    }

    @Override
    public Account findOne(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }
}
