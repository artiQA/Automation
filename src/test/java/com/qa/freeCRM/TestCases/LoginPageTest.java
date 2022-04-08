package com.qa.freeCRM.TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freeCRM.Pages.LoginPage;
import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class LoginPageTest extends TestBase{
	LoginPage login;
	Utility util = new Utility();
	
	LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
	}
	
	@Test(priority =1)
	
	public void verifyLoginTitleTest() {
		String str = login.verifyLoginTitle();
		Assert.assertEquals(str, "Free CRM - CRM software for customer relationship management, sales, and support.");
		
	}
	
	@Test(priority =2)
	public void verfyLoginTest() {
		login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()||ITestResult.SKIP==result.getStatus()) {
		String screenshotPath=util.takeScreenshot(driver, result.getName());
		result.setAttribute("screenshotPath", screenshotPath);
		}
		driver.quit();
	}
	
	

}
