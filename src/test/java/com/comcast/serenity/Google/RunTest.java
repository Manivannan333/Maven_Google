package com.comcast.serenity.Google;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
tags = { "@reg"}//, glue={"com.comcast.serenity.XHomePOC"}
)

public class RunTest {

}
