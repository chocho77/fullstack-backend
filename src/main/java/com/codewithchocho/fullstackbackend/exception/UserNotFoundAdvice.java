package com.codewithchocho.fullstackbackend.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Map;

@ControllerAdvice
public class UserNotFoundAdvice {

    public Map<String, String> exceptionHandler(UserNotFoundException exception){
        
    }

}
