package com.koreanair.ms_ibe.service.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value="계좌 생성", description="계좌 생성 정보")
public class CreateAccountVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "계좌이름")
    String name;

    @ApiModelProperty(value = "초기잔고", example="10")
    int initBalance;

    
    @Builder
    CreateAccountVO(String name, int initBalance){
        this.name = name;
        this.initBalance = initBalance; 
    }

}