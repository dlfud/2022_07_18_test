package com.test.test.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNOtFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public DataNOtFoundException(String message){
        super(message);
    }
}
