package koreanair.ms.msservicetest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import koreanair.ms.msservicetest.service.AccountService;
import koreanair.ms.msservicetest.service.AccountVO;
import koreanair.ms.msservicetest.service.CreateAccountVO;
import koreanair.ms.msservicetest.service.TransferAccountVO;

@RestController
@RequestMapping("account")
@Api(value = "account", description = "account 와 transfer 처리")
public class AccountController {

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

    @PostMapping
    @ApiOperation(value = "계좌 생성",
    notes = "계좌명과 잔액으로 생성"
    )
    public AccountVO createAccount(@RequestBody CreateAccountVO createAccount) {
         service.createAccount(createAccount);
         return service.getAccount(createAccount.getName());
    }

    
    @PostMapping("transfer")
    @ApiOperation(value = "이체",
    notes = "계좌명으로 이체"
    )
    public List<AccountVO> transfer(@RequestBody TransferAccountVO trasferAccountVO) {
         service.transfer(trasferAccountVO);

         // 이체하고 계좌 정보를 보여달라는 추가 요구사항은 화면상에서 구현 하면 됨 
         List<AccountVO> list = new ArrayList<>();
         list.add(service.getAccount(trasferAccountVO.getFrom()));
         list.add(service.getAccount(trasferAccountVO.getTo()));
         return list;
    }
    
}