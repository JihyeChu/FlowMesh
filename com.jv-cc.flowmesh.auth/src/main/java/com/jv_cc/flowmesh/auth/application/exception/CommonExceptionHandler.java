package com.jv_cc.flowmesh.auth.application.exception;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RequiredArgsConstructor
@RestControllerAdvice
@Hidden
public class CommonExceptionHandler {

    @ExceptionHandler(AuthException.class)
    public ResponseEntity<Object> AuthExceptionHandler(AuthException e) {

        Error error = e.getError();

        return ResponseEntity
                .status(e.getHttpStatus())
                .body(Map.of(
                        "code", error.getCode(),
                        "message", error.getMessage()
                ));
    }

}