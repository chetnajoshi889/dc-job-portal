package com.dc.jobPortal.common.exceptions;

import com.dc.jobPortal.common.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice(basePackages = "com.dc.jobPortal")
@RestController
public class ApiExceptionHandler {

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public ResponseUtil exception(Exception e, HttpServletRequest httpServletRequest) throws Exception {
        return new ResponseUtil(500, "Sorry, something went wrong. We're working on it and get it fixed as soon as we can", null);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseUtil exception(MethodArgumentNotValidException e, HttpServletRequest httpServletRequest) throws Exception {
        List<String> resp = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach(field -> {
            resp.add(field.getDefaultMessage());
        });

        return new ResponseUtil(400, resp.get(0), null);
    }
}