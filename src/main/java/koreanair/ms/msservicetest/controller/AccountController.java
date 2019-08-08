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
import koreanair.ms.msservicetest.domain.account.Account;
import koreanair.ms.msservicetest.service.AccountService;
import koreanair.ms.msservicetest.service.CreateAccountVO;

@RestController
@RequestMapping("account")
@Api(value = "account", description = "gets some data from a servlet")
public class AccountController {

    @Autowired
    AccountService service;

    @GetMapping
    public Account getAccount(String name) {
        return service.getAccount(name);    
    }

    @PostMapping
    @ApiOperation(value = "Finds Pets by status",
    notes = "Multiple status values can be provided with comma seperated strings"
    )
    public Account createAccount(CreateAccountVO createAccount) {
         service.createAccount(createAccount);
         return service.getAccount(createAccount.getName());
    }

    
    @PostMapping("transfer")
    public List<Account> transfer(String from, String to, int amount) {
         service.transfer(from, to, amount);
         List<Account> list = new ArrayList<>();
         list.add(service.getAccount(from));
         list.add(service.getAccount(to));
         return list;
    }
    
}