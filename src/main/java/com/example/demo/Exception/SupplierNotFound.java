package com.example.demo.Exception;

public class SupplierNotFound extends RuntimeException{
    public SupplierNotFound(String message) {
        super(message);
    }
}
