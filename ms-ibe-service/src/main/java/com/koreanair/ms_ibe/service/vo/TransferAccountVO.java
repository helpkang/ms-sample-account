package com.koreanair.ms_ibe.service.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ApiModel(value="이체요청", description="이체요청")
public class TransferAccountVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "출금계좌")
    String from;

    @ApiModelProperty(value = "받는계좌")
    String to;

    @ApiModelProperty(value = "이체금액", example="1")
    int amount;
}