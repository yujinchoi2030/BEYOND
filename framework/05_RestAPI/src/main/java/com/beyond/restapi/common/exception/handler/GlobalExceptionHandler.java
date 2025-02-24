package com.beyond.restapi.common.exception.handler;

import com.beyond.restapi.common.exception.UniversityException;
import com.beyond.restapi.common.exception.dto.ApiErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler
{
    @ExceptionHandler(UniversityException.class)
    public ResponseEntity<ApiErrorResponseDto> handleException(UniversityException e)
    {
        log.error("UniversityException : {}", e.getMessage());

        return new ResponseEntity<>(
                new ApiErrorResponseDto(e.getStatus().value(), e.getType(), e.getMessage())
                , e.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponseDto> handleException(Exception e)
    {
        log.error("Global Exception : {}", e.getMessage());

        return new ResponseEntity<>(
                new ApiErrorResponseDto(
                        HttpStatus.INTERNAL_SERVER_ERROR.value()
                        ,HttpStatus.INTERNAL_SERVER_ERROR.name()
                        ,e.getMessage())
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}