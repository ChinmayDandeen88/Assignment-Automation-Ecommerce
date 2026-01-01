package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest {
	HomePage homePage;
	
	@BeforeMethod(description = "Load the Homepage of the website")
	public void setup() {
		homePage = new HomePage(Browser.CHROME);
	}
	
	
	
	@Test(description = "verifies with valid login user is able to login into application", groups = {"e2e","sanity"})
	public void loginTest() {
		
		/* 
		 * Test scripts should be small
		 * no conditional statements,loops,exceptions, try catch block should not be there
		 * no local variables or reduce local variables 
		 * At-least one assertions
		 * 
		 * 
		 */
		
		String userName = homePage.goToLoginPage().doLoginWith("vanobey727@roratu.com", "Password").getUserName();
		Assert.assertEquals(userName, "Chinmay Dandeen");
		
		//wd.quit();
		//vanobey727@roratu.com

	}

}
