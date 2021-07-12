package com.example.demo.Controller;

import com.example.demo.Model.Accounts;
import com.example.demo.Model.Suppliers;
import com.example.demo.Service.SuppliersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SuppliersController {

    private SuppliersService suppliersService;

    public SuppliersController(SuppliersService suppliersService) {
        this.suppliersService = suppliersService;
    }

    @GetMapping("/findAll")
    public List<Suppliers> findAll(){
        return suppliersService.findAll();
    }

    @PostMapping("/save")
    public Suppliers save(@RequestBody Suppliers suppliers){ return suppliersService.create(suppliers); }

    @PutMapping("/update/{id}")
    public Suppliers update(@RequestBody Suppliers suppliers, @PathVariable("id") String id){
        return suppliersService.update(suppliers);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        suppliersService.deleteById(id);
    }
}
