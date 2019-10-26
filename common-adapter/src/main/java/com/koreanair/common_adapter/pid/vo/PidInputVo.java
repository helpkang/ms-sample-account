package com.koreanair.common_adapter.pid.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class PidInputVo implements Serializable {
    private String host;
    private Object inputBody;
    private String operationName;
    private String responseName;
    private Class<?> responseClass;
}
