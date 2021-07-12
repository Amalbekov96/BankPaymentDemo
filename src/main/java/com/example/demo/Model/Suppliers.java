package com.example.demo.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "suppliers")
public class Suppliers {
    @Id
    private String id;
    private String name;
    private String surname;
}
