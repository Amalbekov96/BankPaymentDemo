package com.example.demo.Service.Impl;

import com.example.demo.Exception.AccountNotFound;
import com.example.demo.Exception.RequestNotFound;
import com.example.demo.Mapper.RequestsMapper;
import com.example.demo.Model.Dto.RequestsDto;
import com.example.demo.Model.Requests;
import com.example.demo.Repository.AccountsRepo;
import com.example.demo.Repository.RequestsRepo;
import com.example.demo.Service.RequestsService;
import org.slf4j.LoggerFactory;

import java.util.List;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class RequestsServiceImpl implements RequestsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(Requests.class);

    private RequestsRepo requestsRepo;
    private AccountsRepo accountsRepo;
    private RequestsMapper requestsMapper;

    public RequestsServiceImpl(RequestsRepo requestsRepo, AccountsRepo accountsRepo, RequestsMapper requestsMapper) {
        this.requestsRepo = requestsRepo;
        this.accountsRepo = accountsRepo;
        this.requestsMapper = requestsMapper;
    }

    @Override
    public Requests create(Requests requests) {
        return requestsRepo.save(requests);
    }

    @Override
    public Requests findById(String id) {
        return requestsRepo.findById(id).orElseThrow(()-> new RequestNotFound("Request is not found"));
    }

    @Override
    public Requests update(Requests requests) {
        return requestsRepo.save(requests);
    }

    @Override
    public void deleteById(String id) {
        requestsRepo.deleteById(id);
    }

    @Override
    public List<Requests> findAll() {
        return (List<Requests>) requestsRepo.findAll();
    }

    @Override
    public RequestsDto check(RequestsDto requestsDto) {

        Requests requests = requestsMapper.toRequests(requestsDto);

        try{
            accountsRepo.findById(requests.getAccount().getId());
            return requestsDto;
        }catch(AccountNotFound a){
            LOGGER.error(a.toString());
            throw new AccountNotFound("Account is not found");
        }
    }

    @Override
    public RequestsDto pay(RequestsDto requestsDto) {
        Requests requests = requestsMapper.toRequests(requestsDto);
        requestsRepo.save(requests);
        return requestsDto;
    }
}
