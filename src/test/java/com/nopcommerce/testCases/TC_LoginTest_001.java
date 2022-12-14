package com.nopcommerce.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseURL);
		driver.manage().window().maximize(); 
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName("");
		logger.info("User provided"); //logger msg
		
		lp.setPassword("");
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		Thread.sleep(2000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
			
		} else {
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}

	}

	
}
