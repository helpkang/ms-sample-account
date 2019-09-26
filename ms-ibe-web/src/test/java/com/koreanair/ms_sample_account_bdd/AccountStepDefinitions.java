package com.koreanair.ms_sample_account_bdd;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Map;

import com.koreanair.common.utils.ConvertUtils;
import com.koreanair.ms_ibe.service.vo.CreateAccountVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import io.cucumber.java8.En;


public class AccountStepDefinitions extends SpringIntegrationTests implements En {
	private final Logger log = LoggerFactory.getLogger(AccountStepDefinitions.class);

	public AccountStepDefinitions() {

		Given("시작", () -> {
			// clean();
			// assertThat(getContents().isEmpty()).isTrue();
		});

		When("Account {} 잔고 {}으로 생성 ", (final String accountName, final Integer initValance) -> {
			// IntStream.range(0, initValance).peek(n -> log.info("가방에 {} {}개를 넣음", accountName, initValance))
			// 		.map(ignore -> put(accountName))
			// 		.forEach(statusCode -> assertThat(statusCode).isEqualTo(HttpStatus.CREATED.value()));
			
			Arrays.asList(0)
			.stream()
			.map( index-> CreateAccountVO.builder().name(accountName).initBalance(initValance).build() )
			.map( createAccountVO-> ConvertUtils.objectToJson(createAccountVO) )
			.map( createParam -> put(createParam))
			.forEach( statusCode -> assertThat(statusCode).isEqualTo(HttpStatus.CREATED.value()) );
		});

		Then("Account {} 잔고 {} 있어야 함", (final String accountName, final Integer initValance) -> {
			assertNumberOfTimes(accountName, initValance, true);
		});

	}

	private void assertNumberOfTimes(final String accountName, final int initValue, final boolean onlyThat) {
		log.info("Expecting {} times {}. The bag contains {}", initValue, accountName, onlyThat);
		Arrays.asList(getContents(accountName))
		.stream()
		.map( accountInfo -> ConvertUtils.jsonToObject(accountInfo, Map.class))
		.map( map -> Integer.parseInt(("balance")))
		.forEach( balance -> assertThat(balance).isEqualTo(initValue) );
	}

}
