package com.koreanair.ms_sample_account;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.repository.AccountRepository;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;
import com.koreanair.ms_sample_account.service.vo.TransferAccountVO;
import com.koreanair.utils.ConvertUtils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

@RunWith(SpringRunner.class)
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AccountControllerTest {

    final String testAccountName = "xx";
    final int testAccountBalance = 50;
    
    @Autowired
    private AccountRepository accountRepository;
    
    @LocalServerPort
    private int port;

    @Before
    public void setUp() {

        Account account = Account.builder()
        .name(testAccountName)
        .balance(testAccountBalance)
        .build();
        
        accountRepository.save(account);
    }

    @After
    public void tearDown() {
        accountRepository.deleteAll();
    }

    @Test
    public void getAccountTest() throws Exception {
        getAccountSame(testAccountName, testAccountBalance);
    }


    @Test
    public void makeNewAccountTest() throws Exception {
        final CreateAccountVO createAccountVO = CreateAccountVO.builder().name("yy").initBalance(10).build();
        given()
        .body(ConvertUtils.objectToJson(createAccountVO))
        .contentType(ContentType.JSON)
        .when()
        .post(String.format("http://localhost:%s/api/account", port ))
        .then()
        .statusCode(is(201))
        .body(containsString("yy"));
    }

    @Test
    public void transferAccountTest() throws Exception {

        final String[] accounts = {"aa", "bb"};
        final int initBalance = 10;
        final int trasferAmount = 2;

        Arrays.stream(accounts).forEach(account->{
            createAccountSame(account, initBalance);
        });

        final TransferAccountVO transferAccountVO = TransferAccountVO.builder()
        .from(accounts[0])
        .to(accounts[1])
        .amount(trasferAmount)
        .build();

        given()
        .body(ConvertUtils.objectToJson(transferAccountVO))
        .contentType(ContentType.JSON)
        .when()
        .post(String.format("http://localhost:%s/api/account/transfer", port ))
        .then()
        .statusCode(is(201));

        final int[] i = { 0 };
        Arrays.stream(accounts).forEach(( account )->{
            int value = i[0]==0 ? initBalance-trasferAmount : initBalance+trasferAmount;
            getAccountSame(account, value);
            i[0]++;
        });
       
    }



    public void createAccountSame(String expectAccountName, int expectBalacne){

        final CreateAccountVO createAccountVO = CreateAccountVO.builder().name(expectAccountName).initBalance(expectBalacne).build();
        Response json = given()
        .body(ConvertUtils.objectToJson(createAccountVO))
        .contentType(ContentType.JSON)
        .when()
        .contentType(ContentType.JSON)
        .post(String.format("http://localhost:%s/api/account", port ))
        .thenReturn();
        
        String name = json.jsonPath().getString("name");
        assertEquals(expectAccountName, name);
        
        int balance = json.jsonPath().getInt("balance");
        assertEquals(expectBalacne, balance);

    }

    public void getAccountSame(String expectAccountName, int expectBalacne) {

        Response json = when()
        .get(String.format("http://localhost:%s/api/account/%s", port, expectAccountName))
        .then()
        .contentType(ContentType.JSON)
        .extract()
        .response();

        String name = json.jsonPath().getString("name");
        assertEquals(expectAccountName, name);
        
        int balance = json.jsonPath().getInt("balance");
        assertEquals(expectBalacne, balance);
    }


    // private String objectToJson(Object o) {
    //     ObjectMapper mapper = new ObjectMapper();
    //     ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
    //     String requestJson = null;
    //     try {
    //         requestJson = ow.writeValueAsString(o);
    //     } catch (JsonProcessingException e) {
    //         e.printStackTrace();
    //     }
    //     return requestJson;
    // }
}