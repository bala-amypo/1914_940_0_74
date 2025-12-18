package com.example.demo.exception;

public class ResourceNotFoundHandler extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }
    
}