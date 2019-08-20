package com.koreanair.ms_sample_account.inter_client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleClientTest {

    @Autowired
    ExampleClient client;
 
    @Test
    public void httpTest() {
        String result = client.status("get");
        System.out.println("result="+result); 
    }
}