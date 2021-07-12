package com.example.demo.Service;

import com.example.demo.Model.Dto.RequestsDto;
import com.example.demo.Model.Requests;
import com.example.demo.Model.Suppliers;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RequestsService {

    Requests create(Requests requests);
    Requests findById(String id);
    Requests update(Requests requests);
    void deleteById(String id);
    List<Requests> findAll();
    RequestsDto check(RequestsDto requestsDto);
    RequestsDto pay(RequestsDto requestsDto);
}
