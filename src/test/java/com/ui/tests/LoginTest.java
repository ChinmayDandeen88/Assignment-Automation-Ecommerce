package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.ui.pojo.User;

public class LoginTest {
	HomePage homePage;

	@BeforeMethod(description = "Load the Homepage of the website")
	public void setup() {
		homePage = new HomePage(Browser.CHROME);
	}



	@Test(description = "verifies with valid login user is able to login into application", groups = {"e2e","sanity"},
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Chinmay Dandeen");
	}


	@Test(description = "verifies with valid login user is able to login into application", groups = {"e2e","sanity"},
			dataProviderClass = com.ui.dataproviders.LoginDataProvider.class,dataProvider = "LoginTestCSVDataProvider")
	public void loginCSVTest(User user) {

		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),
				"Chinmay Dandeen");
	}



	//wd.quit();
	//vanobey727@roratu.com
	/* String userName = homePage.goToLoginPage().doLoginWith("vanobey727@roratu.com", "Password").getUserName();
	Assert.assertEquals(userName, "Chinmay Dandeen"); */

}


