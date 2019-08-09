package koreanair.ms.msservicetest.service;

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
@ApiModel(value="출금요청", description="Sample model for the documentation")
@NoArgsConstructor
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TransferAccountVO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "출금계좌")
    String from;

    @ApiModelProperty(value = "받는계좌")
    String to;

    @ApiModelProperty(value = "보낼금액", example="1")
    int amount;
}