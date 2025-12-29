package com.ui.tests;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest3 {

	public static void main(String[] args) {
		
		HomePage homePage = new HomePage(Browser.FIREFOX);
		String userName = homePage.goToLoginPage().doLoginWith("vanobey727@roratu.com", "Password").getUserName();
		System.out.println(userName);
		
		//wd.quit();
		//vanobey727@roratu.com

	}

}
