package com.dc.jobPortal.common;


import lombok.Data;

@Data
public class ResponseUtil {

    private int code;
    private String message;
    private Object data;

    public ResponseUtil(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
