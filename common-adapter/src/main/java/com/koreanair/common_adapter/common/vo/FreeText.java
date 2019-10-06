package com.koreanair.common_adapter.common.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class FreeText {

    private String Code;                        //SSR, RM ...
    private String freeText;                    //
    private String otNumber;
    private ArrayList<ReferenceCode> referenceCodeList;

}
