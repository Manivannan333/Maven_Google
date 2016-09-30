package com.comcast.serenity.GoogleMain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Overview extends PageObject {

	WebDriver browser;
	@FindBy (xpath = "html/body/xh-app/div[1]/xh-page-overview/xh-overview-hero/div/div[1]/xh-overview-tile-arm/section[1]/div[1]/span[1]")
	private WebElementFacade SystemArmed;
		
	@FindBy (xpath = "html/body/xh-app/div[1]/xh-page-overview/xh-overview-hero/div/div[1]/xh-overview-tile-arm/section[3]/div[1]")
	private WebElementFacade SystemDisarmed;
	
	@FindBy(xpath=".//*[@id='disarmButton']")
	private WebElementFacade buttonDisarmSystem;
	
	@FindBy (xpath = ".//*[@id='armButton']")
	private WebElementFacade buttonArmSystem;
	
	@FindBy(xpath="html/body/xh-app/div[1]/xh-page-overview/xh-overview-hero/div/div[1]/xh-overview-tile-arm/section[3]/button[2]")
	private WebElementFacade Armbutton;
	
	@FindBy(xpath="html/body/xh-app/div[1]/xh-page-overview/xh-overview-hero/div/div[1]/xh-overview-tile-arm/section[1]/button[2]")
	private static WebElementFacade Disarmbutton;
	
	@FindBy (id = "password")
	private WebElementFacade pin;
	
	@FindBy (xpath = "//*[@id='setup']//button[contains(@type,'button')][1]")
	private WebElementFacade buttonStay;
	
	@FindBy (xpath = "//*[@id='setup']//button[contains(@type,'button')][2]")
	private WebElementFacade buttonAway;

	@FindBy (xpath = "//*[@id='setup']//button[contains(@type,'button')][3]")
	private WebElementFacade buttonNight;
	
	@FindBy(css = ".ftue-banner__open.style-scope.xh-ftue-banner")	
	private WebElementFacade buttonTour;
	
	@FindBy(css=".ftue-tour__footer-right.style-scope.xh-ftue-tour")
	private WebElementFacade ForwardSlider;
	
	@FindBy(css=".ftue-tour__arrow-left style-scope xh-ftue-tour")
	private WebElementFacade Backwardslider;
	
	@FindBy(xpath=".//*[@id='content']/button")
	private WebElementFacade CloseTour;
	        
	
// Boolean method to check whether system status is Armed or disarmed
		public boolean CheckArmedStatus() {
			System.out.println("Function");			
			try{
				SystemArmed.getText().contains("Armed");
				return true;
			}catch (Exception e)
			{
				System.out.println("Disarmed");
				return false;
			}
			
		}
		
		public void clickToggleToDisarmed(){
		buttonDisarmSystem.isVisible();
		buttonDisarmSystem.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		

		public void DisarmButton() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Disarmbutton.waitUntilClickable();
				Disarmbutton.click();
				enter4DigitPin();
				clickToggleToDisarmed();
	}
		
		public void enter4DigitPin(){
		pin.sendKeys("5555");
	}
		
		public void selectArmMode(String armMode, int time) {
			Armbutton.waitUntilClickable();
			Armbutton.click();
		if (armMode.contains("Stay"))
		{
			System.out.println("Enter stay mode");
			buttonStay.click();
			enter4DigitPin();
			buttonArmSystem.shouldBeVisible();
			buttonArmSystem.click();
		//	buttonArmSystem.waitUntilNotVisible();
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (armMode.contains("Away"))
		{
		//	buttonAway.waitUntilClickable();
			System.out.println("Enter Away mode");
			buttonAway.click();	
			enter4DigitPin();
			buttonArmSystem.shouldBeVisible();
			buttonArmSystem.click();
		//	buttonArmSystem.waitUntilNotVisible();
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (armMode.contains("Night"))
		{
		//	buttonNight.waitUntilClickable();
			System.out.println("Enter Night mode");
			buttonNight.click();
			enter4DigitPin();
			buttonArmSystem.shouldBeVisible();
			buttonArmSystem.click();
		//	buttonArmSystem.waitUntilNotVisible();
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			Assert.fail("Invalid Arm mode");
	}
		
		public void SelectTakeTour(){
		try {
			Thread.sleep(5000);
			System.out.println("Testing out ");
			if(buttonTour.containsText("Take the Tour"))
				buttonTour.click();
			else
				System.out.println("Button Tour Element not found ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buttonTour.click();
	}
	
			public void ForwardSlider()
			{
				
			do {
				ForwardSlider.click();
				
			} while (ForwardSlider.isDisplayed());
		
			}
			
			
			public void BackwardSlider() 
			{
				if(Backwardslider.isVisible())
				{
				int i;
				for(i=0;i<4;i++)
				{
					Backwardslider.click();
				}
				}
				else
					System.out.println("Left Slider not found");
			}
			
			public void CloseTour()
			{
				CloseTour.click();
			}


	
}


