 	package com.comcast.serenity.GoogleMain;

//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import junit.framework.Assert;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
		

	
	WebDriver browser;

	public void launchBrowser() {
		//System.setProperty("webdriver.chrome.driver","/Users/imurth002c/Documents/chromedriver");
		
	//	browser = new SafariDriver();
	//	browser= new FirefoxDriver();
		browser = getDriver();
	}

	public WebDriver openApplication() {
		getDriver().get("https://www.google.com/");
	//	browser.navigate().to("https://tps.home.xfinity.com");
	//	new WebDriverWait(browser, 2)
    //    .until(ExpectedConditions.titleIs("SagemcomBox"));
		return browser;
	}
	


	

}
