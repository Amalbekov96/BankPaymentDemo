package com.example.demo.Repository;

import com.example.demo.Model.Requests;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepo extends CrudRepository<Requests, String> {
}
