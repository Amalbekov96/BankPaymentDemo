package com.example.demo.Controller;

import com.example.demo.Model.Accounts;
import com.example.demo.Model.Requests;
import com.example.demo.Service.AccountsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountsController {

    private AccountsService accountsService;

    public AccountsController(AccountsService accountsService) {
        this.accountsService = accountsService;
    }

    @GetMapping("/findAll")
    public List<Accounts> findAll(){
        return accountsService.findAll();
    }

    @PostMapping("/save")
    public Accounts save(@RequestBody Accounts accounts){ return accountsService.create(accounts); }

    @PutMapping("/update/{id}")
    public Accounts update(@RequestBody Accounts accounts, @PathVariable("id") String id){
        return accountsService.update(accounts);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        accountsService.deleteById(id);
    }
}
