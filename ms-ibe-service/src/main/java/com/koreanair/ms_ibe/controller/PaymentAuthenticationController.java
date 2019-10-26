package com.koreanair.ms_ibe.controller;


import com.koreanair.ms_ibe.service.PaymentAuthenticationService;
import com.koreanair.ms_ibe.service.vo.*;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment/Authentication")
@Slf4j
public class PaymentAuthenticationController {

    @Autowired
    PaymentAuthenticationService service;

    @PostMapping(value = "/Kakao" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "카카오 인증",
            notes = "카카오 채번 및 인증창 요청"
    )
    @ResponseBody
    public KakaoAuthenticationOutput kakao(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.kakao(inputVo);
    }

    @PostMapping(value = "/Payco" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "페이코 인증",
            notes = "페이코 채번 및 인증창 요청"
    )
    @ResponseBody
    public PaycoAuthenticationOutput payco(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.payco(inputVo);
    }

    @PostMapping(value = "/Paypal" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "페이팔 인증",
            notes = "페이팔 채번 및 인증창 요청"
    )
    @ResponseBody
    public PaypalAuthenticationOutput paypal(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.paypal(inputVo);
    }

    @PostMapping(value = "/Toss" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "토스 인증",
            notes = "토스 채번 및 인증창 요청"
    )
    @ResponseBody
    public TossAuthenticationOutput toss(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.toss(inputVo);
    }

    @PostMapping(value = "/AliPay" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "토스 인증",
            notes = "토스 채번 및 인증창 요청"
    )
    @ResponseBody
    public AlipayAuthenticationOutput alipay(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.alipay(inputVo);
    }

    @PostMapping(value = "/ChinaPay" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "토스 인증",
            notes = "토스 채번 및 인증창 요청"
    )
    @ResponseBody
    public ChinapayAuthenticationOutput chinapay(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.chinapay(inputVo);
    }

    @PostMapping(value = "/Cbsc" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "사이버소스 인증",
            notes = "사이버소스 인증창 요청"
    )
    @ResponseBody
    public PaymentAuthenticationOutput cbsc(@RequestBody PaymentAuthenticationInput inputVo)throws Exception {
        return service.cbsc(inputVo);
    }
}