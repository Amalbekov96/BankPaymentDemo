package com.example.demo.Service.Impl;

import com.example.demo.Exception.SupplierNotFound;
import com.example.demo.Model.Suppliers;
import com.example.demo.Repository.SuppliersRepo;
import com.example.demo.Service.SuppliersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliersServiceImpl implements SuppliersService {

    private SuppliersRepo suppliersRepo;

    public SuppliersServiceImpl(SuppliersRepo suppliersRepo) {
        this.suppliersRepo = suppliersRepo;
    }

    @Override
    public Suppliers create(Suppliers suppliers) {
        return suppliersRepo.save(suppliers);
    }

    @Override
    public Suppliers findById(String id) {
        return suppliersRepo.findById(id).orElseThrow(()->new SupplierNotFound("Supplier is not found"));
    }

    @Override
    public Suppliers update(Suppliers suppliers) {
        return suppliersRepo.save(suppliers);
    }

    @Override
    public void deleteById(String id) {
        suppliersRepo.deleteById(id);
    }

    @Override
    public List<Suppliers> findAll() {
        return (List<Suppliers>) suppliersRepo.findAll();
    }
}
