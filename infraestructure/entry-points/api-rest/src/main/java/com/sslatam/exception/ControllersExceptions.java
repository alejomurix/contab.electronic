package com.sslatam.exception;

import com.sslatam.domain.exception.ValidatorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Map;

@RestControllerAdvice
public class ControllersExceptions {

    @ExceptionHandler(ValidatorException.class)
    public ResponseEntity<Map<String, String>> valException(ValidatorException validationException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap("Error", validationException.getMessage()));
    }
}
