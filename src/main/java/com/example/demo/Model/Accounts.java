package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Currency;


@Data
@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String account;
    private Currency amount;
    @ManyToOne
    private Suppliers supplier_id;

}
