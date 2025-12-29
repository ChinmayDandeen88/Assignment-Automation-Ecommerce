package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import com.utility.BrowserUtility;

public class LoginTest2 {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver(); // launches the browser session
		HomePage homePage = new HomePage("chrome");
		
		
		LoginPage loginPage = homePage.goToLoginPage();
		loginPage.doLoginWith("vanobey727@roratu.com", "Password");
		
		
		
		
		//wd.quit();
		//vanobey727@roratu.com

	}

}
