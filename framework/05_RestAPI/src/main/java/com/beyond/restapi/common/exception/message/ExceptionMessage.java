package com.beyond.restapi.common.exception.message;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ExceptionMessage
{
    DEPARTMENT_NOT_FOUND("학과 정보를 찾을 수 없습니다.",HttpStatus.NOT_FOUND);

    private final String message;

    private final HttpStatus status;
}
