package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.constants.Env;
import com.utility.BrowserUtility;
import com.utility.PropertiesUtil;

public final class HomePage extends BrowserUtility {

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");
	
	public HomePage(Browser browserName) {
		super(browserName);
		goToWebsite(PropertiesUtil.readProperty(Env.QA, "URL"));
		maximizeBrowserWindow();
		
	}

	public LoginPage goToLoginPage() { // Page Functions : In page Object Design void is not used 
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}
