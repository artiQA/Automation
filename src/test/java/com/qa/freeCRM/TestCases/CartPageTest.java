package com.qa.freeCRM.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.freeCRM.Pages.CartPage;
import com.qa.freeCRM.Pages.HomePage;
import com.qa.freeCRM.Pages.LoginPage;
import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class CartPageTest extends TestBase {
	CartPage cart;
	HomePage home;
	Utility util;
	LoginPage login;
	
	CartPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		login = new LoginPage();
		home = new HomePage();
		cart = new CartPage();
		home = login.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cart = home.clickOnCart(); 
		util=new Utility();
		
	}
	
	@Test 
	public void cartItemPresentCheck() {
		assertEquals(cart.cartItemPresentCheck(), true);

	}
	
	@Test 
	public void removeitemTest() {
		cart.removeCartItem();
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			String Screenshot = util.takeScreenshot(driver, result.getName());
			result.setAttribute("screenshotPath", Screenshot);
		}
		driver.quit();
		
	}

}
