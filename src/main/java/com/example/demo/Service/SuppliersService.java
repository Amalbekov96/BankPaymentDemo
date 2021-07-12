package com.example.demo.Service;

import com.example.demo.Model.Accounts;
import com.example.demo.Model.Suppliers;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SuppliersService {

    Suppliers create(Suppliers suppliers);
    Suppliers findById(String id);
    Suppliers update(Suppliers suppliers);
    void deleteById(String id);
    List<Suppliers> findAll();
}
