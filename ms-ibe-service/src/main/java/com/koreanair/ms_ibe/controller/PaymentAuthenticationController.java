package com.koreanair.ms_ibe.controller;


import com.koreanair.ms_ibe.service.PaymentAuthenticationService;
import com.koreanair.ms_ibe.service.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api/payment/Authentication")
//@Api(value = "결제인증", tags = "결제수단별 인증")
@Slf4j
public class PaymentAuthenticationController {

    @Autowired
    PaymentAuthenticationService service;

    @PostMapping(value = "/Kakao" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "카카오 인증",
            notes = "카카오 채번 및 인증창 요청"
    )
            /*@ApiImplicitParam(name = "domestic", value = "국내선여부", required = true,  dataType = "boolean"),
            @ApiImplicitParam(name = "award", value = "무상여부", required = true, dataType = "boolean", paramType = "path"),
            @ApiImplicitParam(name = "amount", value = "결제금액", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "currency", value = "결제통화", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "reservationNumber", value = "예약번호(8자리숫자)", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "callbackUrl", value = "인증 완료 후 callbackUrl", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "cancelUrl", value = "인증 중 취소 시 callbackUrl", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "failUrl", value = "인증 실패 시 callbackUrl", required = true, dataType = "string", paramType = "path"),
            @ApiImplicitParam(name = "officeId", value = "officeId", required = true, dataType = "string", paramType = "path")*/

    @ResponseBody
    public KakaoAuthenticationOutput kakao(@RequestBody KakaoAuthenticationInput inputVo)throws Exception {
        return service.kakao(inputVo);
    }

    @PostMapping(value = "/Payco" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "페이코 인증",
            notes = "페이코 채번 및 인증창 요청"
    )
    @ResponseBody
    public PaycoAuthenticationOutput payco(@RequestBody PaycoAuthenticationInput inputVo)throws Exception {
        return service.payco(inputVo);
    }

    @PostMapping(value = "/Paypal" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "페이팔 인증",
            notes = "페이팔 채번 및 인증창 요청"
    )
    @ResponseBody
    public PaypalAuthenticationOutput paypal(@RequestBody PaypalAuthenticationInput inputVo)throws Exception {
        return service.paypal(inputVo);
    }

    @PostMapping(value = "/Toss" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "토스 인증",
            notes = "토스 채번 및 인증창 요청"
    )
    @ResponseBody
    public TossAuthenticationOutput toss(@RequestBody TossAuthenticationInput inputVo)throws Exception {
        return service.toss(inputVo);
    }

    @PostMapping(value = "/AliPay" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "알리페이 인증",
            notes = "알리페이 채번 및 인증창 요청"
    )
    @ResponseBody
    public AlipayAuthenticationOutput alipay(@RequestBody AlipayAuthenticationInput inputVo)throws Exception {
        return service.alipay(inputVo);
    }

    @PostMapping(value = "/ChinaPay" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "차이나페이(유니온페이) 인증",
            notes = "차이나페이 채번 및 인증창 요청"
    )
    @ResponseBody
    public ChinapayAuthenticationOutput chinapay(@RequestBody ChinapayAuthenticationInput inputVo)throws Exception {
        return service.chinapay(inputVo);
    }

    @PostMapping(value = "/Cbsc" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "사이버소스 인증",
            notes = "사이버소스 인증창 요청"
    )
    @ResponseBody
    public CbscAuthenticationOutput cbsc(@RequestBody CbscAuthenticationInput inputVo)throws Exception {
        return service.cbsc(inputVo);
    }
}