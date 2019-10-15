package com.koreanair.common_adapter.common.vo;

import lombok.Data;


@Data
public class TaxDetail {
    private String passengerTypeCodeDetailTaxStatus;			/*ptc 타입 1인의 tax 상태 코드*/
    private String passengerTypeCodeDetailTaxCode;				/*tax 코드*/
    private Float passengerTypeCodeDetailTax;					/*ptc 타입 1인의 tax 코드에 해당하는 tax 금액*/
    private Float passengerTypeCodeDetailTotalTax;				/*ptc 타입의 tax의 총금액*/
}
