package com.example.demo.Model.Enums;

public enum CommandTypes {
    PAY(0),
    CHECK(1);

    private int id;

    CommandTypes(int id) {
        this.id = id;
    }
}
