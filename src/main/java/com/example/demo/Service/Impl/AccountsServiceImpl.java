package com.example.demo.Service.Impl;

import com.example.demo.Exception.AccountNotFound;
import com.example.demo.Model.Accounts;
import com.example.demo.Repository.AccountsRepo;
import com.example.demo.Service.AccountsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    private AccountsRepo accountsRepo;

    public AccountsServiceImpl(AccountsRepo accountsRepo) {
        this.accountsRepo = accountsRepo;
    }

    @Override
    public Accounts create(Accounts accounts) {
        return accountsRepo.save(accounts);
    }

    @Override
    public Accounts findById(Long id) {
        return accountsRepo.findById(id).orElseThrow(()-> new AccountNotFound("Account does not exists"));
    }


    @Override
    public Accounts update(Accounts accounts) {
        return accountsRepo.save(accounts);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Accounts> findAll() {
        return (List<Accounts>) accountsRepo.findAll();
    }


}
