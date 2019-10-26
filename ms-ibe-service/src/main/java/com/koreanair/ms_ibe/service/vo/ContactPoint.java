package com.koreanair.ms_ibe.service.vo;

import lombok.Data;

@Data
public class ContactPoint {
    private String email;					/* 이메일*/
    private String phoneNumber;				/* 핸드폰번호 or 또는 전화번호*/
    private String phoneCode;				/* 전화번호 코드(H1, M1, B1, F1, O1) */
    private String homePhone;				/* 집전화번호*/
    private String mobilePhone;				/* 핸드폰번호*/
    private String businessPhone;			/* 회사번호*/
    private String payerName;				/* 구매자 이름 */
    private String firstName;				/* 성 */
    private String LastNmae;				/* 이름 */
    private String payerPhoneNumber;
    private String payerEmail;
    private String preferLanguage;			/* 선호 언어 - SMS 발송용 */
}
