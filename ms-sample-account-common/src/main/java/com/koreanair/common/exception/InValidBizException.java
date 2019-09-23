package com.koreanair.common.exception;


public class InValidBizException extends BizException {

    private static final long serialVersionUID = 1L;

    public InValidBizException(String code) {
        super(code);
    }

    public InValidBizException(String code, String... message) {
        super(code, message);
    }

    public InValidBizException(String code, Throwable cause, String... message) {
        super(code, cause, message);
    }

    public InValidBizException(String code, Throwable cause) {
        super(code, cause);
    }
    
}