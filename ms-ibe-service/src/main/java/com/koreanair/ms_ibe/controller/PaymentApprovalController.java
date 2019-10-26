package com.koreanair.ms_ibe.controller;


import com.koreanair.ms_ibe.service.PaymentApprovalService;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalInput;
import com.koreanair.ms_ibe.service.vo.PaymentApprovalOutput;
import com.koreanair.ms_ibe.service.vo.PaymentHistoryOutput;
import com.koreanair.ms_ibe.service.vo.PaymentTypeOutput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@Api(value = "승인정보", tags = "결제수단별 승인, 캡쳐 ")
@Slf4j
public class PaymentApprovalController {

    @Autowired
    PaymentApprovalService service;

    @PostMapping(value = "/Approval" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "결제 승인서비스",
            notes = "결제 수단별 승인서비스"
    )
    @ResponseBody
    public PaymentApprovalOutput paymentApproval(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        return service.paymentApproval(inputVo);
    }

    @PostMapping(value = "/History" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "결제 조회 서비스",
            notes = "결제 수단별 "
    )
    @ResponseBody
    public PaymentHistoryOutput paymentHistory(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/GetAvailablePaymentType" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "GPS oid별 결제수단 조회 서비스",
            notes = "결제 수단별 승인서비스"
    )
    @ResponseBody
    public PaymentTypeOutput getPaymentTypeCode(@RequestBody PaymentApprovalInput inputVo)throws Exception {
       // return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/PaypalCapture" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "paypal캡쳐 서비스",
            notes = "paypal결제수단에만 있는 승인 이후에 한번 더 호출하는 서비스"
    )
    @ResponseBody
    public PaymentApprovalOutput paypalCapture(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/CashReceipt" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "현금영수증 GPS에 등록",
            notes = "bankt결제시 현금영수증 GPS통해서 등록"
    )
    @ResponseBody
    public PaymentApprovalOutput cashReceipt(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }
}