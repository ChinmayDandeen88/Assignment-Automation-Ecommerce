package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer { 

	private static final int MAX_NUMBER_OF_ATTEMPTS = Integer.parseInt(PropertiesUtil.readProperty(Env.DEV,"MAX_NUMBER_OF_ATTEMPTS"));
	private static int currentAttempt = 1;
	/* retry method is returns true - then rerun the test 
	 if retry method returns false, then TestNG will mark the test as failed */
	
	// IRetryAnalyzer its methods which has to be override 
	// this method is invoked only when test is failing
	
	/* */
	
	@Override
	public boolean retry(ITestResult result) {   
		if(currentAttempt <= MAX_NUMBER_OF_ATTEMPTS) {
			currentAttempt++;
			return true;
		}
		return false;
	}

}
