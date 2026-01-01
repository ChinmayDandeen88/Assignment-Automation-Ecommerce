package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTestOld {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); // launches the browser session
		
		BrowserUtility browserUtility = new BrowserUtility(wd);
		
		browserUtility.goToWebsite("http://www.automationpractice.pl");
		browserUtility.maximizeBrowserWindow();
		
		By signLinkLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		browserUtility.clickOn(signLinkLocator);
		
		By emailTextBoxLocator = By.id("email");
		browserUtility.enterText(emailTextBoxLocator, "vanobey727@roratu.com");
		
		By passwordTextBoxLocator = By.id("passwd");
		browserUtility.enterText(passwordTextBoxLocator,"Password" );
		
		By submitLoginButtonLocator =By.id("SubmitLogin");
		browserUtility.clickOn(submitLoginButtonLocator);
		
		//wd.quit();
		//vanobey727@roratu.com

	}

}
