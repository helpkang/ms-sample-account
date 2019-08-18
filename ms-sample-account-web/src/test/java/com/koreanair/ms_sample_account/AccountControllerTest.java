package com.koreanair.ms_sample_account;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.koreanair.ms_sample_account.domain.account.Account;
import com.koreanair.ms_sample_account.repository.AccountRepository;
import com.koreanair.ms_sample_account.service.vo.CreateAccountVO;

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

@RunWith(SpringRunner.class)
@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AccountControllerTest {
    
    @Autowired
    private AccountRepository accountRepository;
    
    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        Account account = Account.builder().name("a1").balance(10).build();
        accountRepository.save(account);
    }

    @After
    public void tearDown() {
        accountRepository.deleteAll();
    }

    @Test
    public void getAccountTest() throws Exception {

        when()
        .get(String.format("http://localhost:%s/account/%s", port, "a1"))
        .then()
        .statusCode(is(200))
        .body(containsString("a1"));



        final CreateAccountVO createAccountVO = CreateAccountVO.builder().name("a").initBalance(10).build();
        System.out.println("json:"+objectToJson(createAccountVO));
        given()
        .body(objectToJson(createAccountVO))
        .contentType(ContentType.JSON)
        .when()
        .post(String.format("http://localhost:%s/account", port ))
        .then()
        .statusCode(is(200))
        .body(containsString("a"));

    }

    private String objectToJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson = null;
        try {
            requestJson = ow.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return requestJson;
    }
}