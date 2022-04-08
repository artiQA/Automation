package com.qa.freeCRM.TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freeCRM.Pages.HomePage;
import com.qa.freeCRM.Pages.LoginPage;
import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class HomePageTest extends TestBase {
	LoginPage login;
	HomePage home;
	Utility util=new Utility();
	
	HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
		home = login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String title = home.verifyHomeTitle();
		Assert.assertEquals(title, "Cogmen to CRM");
		
	}
	
	@Test(priority=2)
	public void verifyUserNameTest() {
		String expected= "Hello, Arti";
		String actual= home.verifyUserName();
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=3)
	public void clickOnCart() {
		home.clickOnCart();
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
