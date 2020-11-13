package com.my.crud.common.exception;

import com.my.crud.common.lang.Result;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author myx
 * @date 2020/11/13 - 10:20
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handler(MethodArgumentNotValidException e){
        return Result.fail("400",e.getMessage());
    }
}
