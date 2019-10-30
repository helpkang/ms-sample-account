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
@Api(value = "paymentapproval", tags = "ApprovalService")
@Slf4j
public class PaymentApprovalController {

    @Autowired
    PaymentApprovalService service;

    @PostMapping(value = "/Approval" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "payment approvalservice",
            notes = ""
    )
    @ResponseBody
    public PaymentApprovalOutput paymentApproval(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        return service.paymentApproval(inputVo);
    }

    @PostMapping(value = "/History" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "payment history",
            notes = ""
    )
    @ResponseBody
    public PaymentHistoryOutput paymentHistory(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/GetAvailablePaymentType" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "payment type search",
            notes = ""
    )
    @ResponseBody
    public PaymentTypeOutput getPaymentTypeCode(@RequestBody PaymentApprovalInput inputVo)throws Exception {
       // return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/PaypalCapture" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "paypal capture",
            notes = ""
    )
    @ResponseBody
    public PaymentApprovalOutput paypalCapture(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }

    @PostMapping(value = "/CashReceipt" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "cashreceipt",
            notes = ""
    )
    @ResponseBody
    public PaymentApprovalOutput cashReceipt(@RequestBody PaymentApprovalInput inputVo)throws Exception {
        //return service.getReservation(recLoc);
        return null;
    }
}