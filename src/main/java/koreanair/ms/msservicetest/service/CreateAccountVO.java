package koreanair.ms.msservicetest.service;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel(value="DifferentModel", description="Sample model for the documentation")
public class CreateAccountVO implements Serializable{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "계좌번호")
    String name;

    @ApiModelProperty(value = "초기잔고", example="10")
    int initBalance;

    
    @Builder
    CreateAccountVO(String name, int initBalance){
        this.name = name;
        this.initBalance = initBalance; 
    }

    public CreateAccountVO(){}
}