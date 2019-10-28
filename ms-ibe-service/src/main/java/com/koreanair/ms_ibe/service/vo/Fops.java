package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class Fops {
    private String fopNumber;                      /*FOP 번호*/
    private Integer fopFare;                           /*FOP 지불액*/
    private String fopCode;                          /*FOP 코드*/
    private String cardCompanyCode;             /*Card 회사 코드*/
    private String cardNumber;                     /*Card 번호*/
    private String cardExpierdate;                  /*카드 유효 기간*/
    private String cardInstallmentMonth;         /*할부개월수*/
    private String approveNumber;                /*승인번호*/
    private String skypassNumber;                /*스카이패스 번호*/
    private String airlineCode;                     /*항공사 코드*/
    private String fopContents;                    /*FOP 내용*/
    private String tktDate;							/*FOP별 발권날짜*/
}
