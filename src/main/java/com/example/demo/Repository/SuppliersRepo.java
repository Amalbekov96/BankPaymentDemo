package com.example.demo.Repository;

import com.example.demo.Model.Suppliers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuppliersRepo extends CrudRepository<Suppliers, String> {
}
