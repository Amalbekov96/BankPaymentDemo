package com.example.demo.Model;

import com.example.demo.Model.Enums.CommandTypes;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Currency;
import java.util.Date;

@Data
@Entity
public class Requests {

    @Id
    private String id;
    @ManyToOne
    private Suppliers supplier;
    @ManyToOne
    private Accounts account;
    private Currency amount;
    private CommandTypes command;
    @CreationTimestamp
    @DateTimeFormat(pattern="dd-MM-yyyy HH:mm")
    private Date date;
}
