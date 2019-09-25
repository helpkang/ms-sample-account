package com.koreanair.ms_ibe.exception;

import java.util.AbstractMap;

import com.koreanair.common.exception.BizException;
import com.koreanair.common.exception.ForbiddenException;
import com.koreanair.common.exception.InValidBizException;
import com.koreanair.common.exception.UnauthorizedException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
    
    @ExceptionHandler(value = { ForbiddenException.class })
    protected ResponseEntity<Object> handleForbidden(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "forbidden";
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.FORBIDDEN, request);
    }

    @ExceptionHandler(value = { UnauthorizedException.class})
    protected ResponseEntity<Object> handleUnauthorized(RuntimeException ex, WebRequest request) {
        String bodyOfResponse = "unauthorized";
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
    }

    @ExceptionHandler(value = { BizException.class, InValidBizException.class})
    protected ResponseEntity<Object> handleBizException(BizException ex, WebRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(ex instanceof InValidBizException){
            status = HttpStatus.UNPROCESSABLE_ENTITY;
        }
        AbstractMap.SimpleEntry<String, String> bodyOfResponse = new AbstractMap.SimpleEntry<>(ex.getCode(), ex.getMessage());
        return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), status, request);
    }
}