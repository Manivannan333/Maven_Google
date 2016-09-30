package com.comcast.serenity.Google;

import org.openqa.selenium.WebDriver;

import com.comcast.serenity.GoogleMain.LoginPage;

public class Login_Steps {
	private LoginPage loginPage = new LoginPage();
	WebDriver browser;
	
	public void launchXfinityHome() {
		loginPage.launchBrowser();
		loginPage.openApplication();
	}
	
}
	
	

