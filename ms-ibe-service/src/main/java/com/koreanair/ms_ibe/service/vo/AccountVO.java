package com.koreanair.ms_ibe.service.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@ApiModel(value="계좌 정보", description="계좌 정보")
public class AccountVO {
    
    @ApiModelProperty(value = "계좌이름")
    private String name;

    @ApiModelProperty(value = "잔고")
    private int balance;

    @Builder
    public AccountVO(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

}