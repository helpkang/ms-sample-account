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
@ApiModel(value="transfermodel", description="")
public class TransferAccountVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    String from;

    @ApiModelProperty(value = "")
    String to;

    @ApiModelProperty(value = "", example="1")
    int amount;
}