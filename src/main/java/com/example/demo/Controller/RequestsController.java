package com.example.demo.Controller;

import com.example.demo.Model.Dto.RequestsDto;
import com.example.demo.Model.Requests;
import com.example.demo.Service.AccountsService;
import com.example.demo.Service.RequestsService;
import com.example.demo.Service.SuppliersService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("request")
public class RequestsController {

    private RequestsService requestsService;
    private AccountsService accountsService;
    private SuppliersService suppliersService;

    public RequestsController(RequestsService requestsService, AccountsService accountsService, SuppliersService suppliersService) {
        this.requestsService = requestsService;
        this.accountsService = accountsService;
        this.suppliersService = suppliersService;
    }

    @GetMapping("/findAll")
    public List<Requests> findAll(){
        return requestsService.findAll();
    }

    @PostMapping("/save")
    public Requests save(@RequestBody Requests requests){ return requestsService.create(requests); }

    @PutMapping("/update/{id}")
    public Requests update(@RequestBody Requests requests, @PathVariable("id") String id){
        return requestsService.update(requests);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        requestsService.deleteById(id);
    }

    @PostMapping(path = "/check", produces = MediaType.APPLICATION_XML_VALUE)
    public RequestsDto check(@RequestBody RequestsDto requestsDto){
        return requestsService.check(requestsDto);
    }

    @PostMapping(path = "/pay", produces = MediaType.APPLICATION_XML_VALUE)
    public RequestsDto pay(@RequestBody RequestsDto requestsDto){
        return requestsService.pay(requestsDto);
    }

}
