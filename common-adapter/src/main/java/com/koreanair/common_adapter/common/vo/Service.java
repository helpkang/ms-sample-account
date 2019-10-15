package com.koreanair.common_adapter.common.vo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Service {
    private String otNumber;
    private String ssrCode;
    private String ssrStatus;
    private String quantity;
    private String data;
    private String freetext;
    private ArrayList<ReferenceCode> referenceCodeList;
}
