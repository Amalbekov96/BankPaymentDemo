package com.example.demo.Model.Dto;

import com.example.demo.Model.Enums.CommandTypes;
import lombok.Data;

import java.util.Currency;
import java.util.Date;

@Data
public class RequestsDto {
    private String id;
    private String supplier;
    private String account;
    private Currency amount;
    private CommandTypes command;
    private Date date;
}
