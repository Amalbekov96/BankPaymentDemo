package com.example.demo.Service;

import com.example.demo.Model.Accounts;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountsService {
    Accounts create(Accounts accounts);
    Accounts findById(Long id);
    Accounts update(Accounts accounts);
    void deleteById(Long id);
    List<Accounts> findAll();

}
