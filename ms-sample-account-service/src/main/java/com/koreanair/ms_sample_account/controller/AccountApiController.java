package com.koreanair.ms_sample_account.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.koreanair.controller.PageRequest;
import com.koreanair.ms_sample_account.service.AccountService;
import com.koreanair.ms_sample_account.service.vo.AccountVO;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/account")
@Api(value = "account", description = "account 와 transfer 처리")
@Slf4j
public class AccountApiController {

    @Autowired
    AccountService service;

    @GetMapping(value = "/{name}")
    @ApiOperation(value = "계좌조회",
    notes = "계좌정보와 이체내역 조회"
    )
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "계좌명", required = true, dataType = "string", paramType = "path"),
    })
    public AccountVO getAccount(@PathVariable String name) {
        return service.getAccount(name);    
    }

    @GetMapping(value = "/transfer/{name}")
    @ApiOperation(value = "거래내역조회",
    notes = "거래내역 조회"
    )
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "계좌명", required = true, dataType = "string", paramType = "path"),
        @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query", value = "Results page you want to retrieve (0..N)"),
        @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query", value = "Number of records per page."),
        @ApiImplicitParam(name = "direction", dataType = "org.springframework.data.domain.Sort.Direction", paramType = "query", value = "ASC, DESC order direction."),
    })
    public List<TransferVO> getTransfer(@PathVariable String name, PageRequest pageRequest) {
        log.info("request: {}", pageRequest);
        try {
            return service.getTransfer(name, pageRequest);
            
        } catch (Exception e) {
            log.error("msg", e);
            throw e;
        }
        // return null;
    }

    @PostMapping
    @ApiOperation(value = "계좌 생성",
    notes = "계좌명과 잔액으로 생성"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public AccountVO createAccount(@RequestBody CreateAccountVO createAccount) {
         service.createAccount(createAccount);
         return service.getAccount(createAccount.getName());
    }

    
    @PostMapping("transfer")
    @ApiOperation(value = "이체",
    notes = "계좌명으로 이체"
    )
    @ResponseStatus(HttpStatus.CREATED)
    public List<AccountVO> transfer(@RequestBody TransferAccountVO trasferAccountVO) {
         service.transfer(trasferAccountVO);

         // 이체하고 계좌 정보를 보여달라는 추가 요구사항은 화면상에서 별도 구현해도 됨
         List<AccountVO> list = new ArrayList<>();
         list.add(service.getAccount(trasferAccountVO.getFrom()));
         list.add(service.getAccount(trasferAccountVO.getTo()));
         return list;
    }
    
}