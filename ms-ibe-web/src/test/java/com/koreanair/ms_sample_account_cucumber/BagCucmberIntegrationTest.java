package com.koreanair.ms_sample_account_cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/account.feature", plugin = {"pretty", "html:target/cucumber"})
public class BagCucmberIntegrationTest {

}
