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
@ApiModel(value="CreateAccount", description="")
public class CreateAccountVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "name")
    String name;

    @ApiModelProperty(value = "init", example="10")
    int initBalance;

    
    @Builder
    CreateAccountVO(String name, int initBalance){
        this.name = name;
        this.initBalance = initBalance; 
    }

}