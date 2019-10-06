package com.koreanair.common_adapter.altea.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class AlteaInputVo implements Serializable {

    private Object inputBody;
    private String operationName;
    private String responseName;
    private boolean stateful;

}
