package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FreeText {

    private String Code;                        //SSR, RM ...
    private String freeText;                    //
    private String otNumber;
    private ArrayList<ReferenceCode> referenceCodeList;

}
