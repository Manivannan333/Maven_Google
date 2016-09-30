package com.comcast.serenity.Google;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login_StepDefinition {
	
	@Steps
	Login_Steps  Login_Steps;;
	
	@Given("Open google url")
	public void launchApplication(){
		Login_Steps.launchXfinityHome();
	}	
	
}
