package com.koreanair.ms_sample_account_cucumber;

import com.koreanair.ms_ibe.WebApplication;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = WebApplication.class)
@Ignore
public class SpringCucumberIntegrationTests {

	private final String SERVER_URL = "http://localhost";
	private final String THINGS_ENDPOINT = "/api/account";

	private RestTemplate restTemplate;

	@LocalServerPort
	protected int port;

	public SpringCucumberIntegrationTests() {

		this.restTemplate = new RestTemplate();
	}

	private String thingsEndpoint() {
		return SERVER_URL + ":" + port + THINGS_ENDPOINT;
	}

	public int put(String param) {
		
		return restTemplate.postForEntity(thingsEndpoint(), param, Void.class).getStatusCodeValue();
	}

	public String getContents(String param) {
		return restTemplate.getForEntity(thingsEndpoint(), String.class).getBody();
	}

	public void clean() {
		restTemplate.delete(thingsEndpoint());
	}

}
