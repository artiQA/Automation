package com.qa.freeCRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement username;
	
	@FindBy(id="ape_Gateway_right-2_desktop_placement_Feedback")
	WebElement laptopImage;
	
	@FindBy(id="nav-cart")
	WebElement cart;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	Utility util =new Utility();
	
	public String verifyHomeTitle() {
		return driver.getTitle();
		
	}
	
	public String verifyUserName() {
		return username.getText();
	}
	
	public CartPage clickOnCart() {
		cart.click();
		return new CartPage();
		
	}


}
