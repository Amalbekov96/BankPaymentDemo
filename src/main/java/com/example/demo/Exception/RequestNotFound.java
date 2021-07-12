package com.example.demo.Exception;

public class RequestNotFound extends RuntimeException{
    public RequestNotFound(String message) {
        super(message);
    }
}
