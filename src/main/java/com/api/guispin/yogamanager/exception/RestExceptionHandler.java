package com.api.guispin.yogamanager.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UnprocessableException.class)
    public ResponseEntity handleUnprocessable(UnprocessableException e) {
       return ResponseEntity.badRequest().body(e.getMessage());
    }

}
