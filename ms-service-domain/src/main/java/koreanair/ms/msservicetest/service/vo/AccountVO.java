package koreanair.ms.msservicetest.service.vo;

import java.util.ArrayList;
import java.util.List;

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

    @ApiModelProperty(value = "거래내역")
    List<TransferVO> transfers = new ArrayList<>();

    @Builder
    public AccountVO(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

}