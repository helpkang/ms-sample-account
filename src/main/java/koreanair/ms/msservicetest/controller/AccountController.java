package koreanair.ms.msservicetest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import koreanair.ms.msservicetest.service.AccountService;
import koreanair.ms.msservicetest.service.AccountVO;
import koreanair.ms.msservicetest.service.CreateAccountVO;
import koreanair.ms.msservicetest.service.TransferAccountVO;

@RestController
@RequestMapping("account")
@Api(value = "account", description = "gets some data from a servlet")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping
    public AccountVO getAccount(String name) {
        return service.getAccount(name);    
    }

    @PostMapping
    @ApiOperation(value = "Finds Pets by status",
    notes = "Multiple status values can be provided with comma seperated strings"
    )
    public AccountVO createAccount(CreateAccountVO createAccount) {
         service.createAccount(createAccount);
         return service.getAccount(createAccount.getName());
    }

    
    @PostMapping("transfer")
    public List<AccountVO> transfer(TransferAccountVO trasferAccountVO) {
         service.transfer(trasferAccountVO);

         // 이체하고 계좌 정보를 보여달라는 추가 요구사항은 화면상에서 구현 하면 됨 
         List<AccountVO> list = new ArrayList<>();
         list.add(service.getAccount(trasferAccountVO.getFrom()));
         list.add(service.getAccount(trasferAccountVO.getTo()));
         return list;
    }
    
}