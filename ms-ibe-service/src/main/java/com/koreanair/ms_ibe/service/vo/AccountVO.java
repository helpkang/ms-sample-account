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
@ApiModel(value="AccountVO", description="")
public class AccountVO {
    
    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private int balance;

    @Builder
    public AccountVO(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

}