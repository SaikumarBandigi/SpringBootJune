package com.sb.crud.exhandle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ResponseError> responseErrorResponseEntity(ResourceNotFoundException e) {

        ResponseError responseError = new ResponseError(e.getMessage(),"NOT_FOUND");
        return new ResponseEntity<>(responseError, HttpStatus.NOT_FOUND);

    }

}
