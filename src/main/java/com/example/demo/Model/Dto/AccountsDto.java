package com.example.demo.Model.Dto;

import com.example.demo.Model.Suppliers;
import lombok.Data;

import java.util.Currency;
import java.util.Date;

@Data
public class AccountsDto {

    private Long id;
    private String account;
    private Currency amount;
    private String command;
    private Suppliers supplier_id;
    private Date date;
}
