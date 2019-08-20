package com.koreanair.exception;

import java.util.Arrays;

/**
 * BizException
 */
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;

    private String[] messageArgs;

    public BizException(String code) {
        this.setCode(code);
    }

    public BizException(String code, String... messageArgs) {
        this.setCode(code);
        this.messageArgs = messageArgs;
    }

    public BizException(String code, Throwable cause, String... messageArgs) {
        super(cause);
        this.setCode(code);
        this.messageArgs = messageArgs;
    }

    public BizException(String code, Throwable cause) {
        super(cause);
        this.setCode(code);
    }
    
    @Override
    public String getMessage() {
        String msg = code;
        if(messageArgs != null) msg+=Arrays.toString(messageArgs);
        return msg;
    }

    @Override
    public String getLocalizedMessage() {
        return getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}