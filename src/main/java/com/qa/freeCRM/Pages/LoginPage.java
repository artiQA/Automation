package com.qa.freeCRM.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class LoginPage extends TestBase {
	Utility util= new Utility();
	
	@FindBy(xpath="//*[contains(text(),'Account & Lists')]")
	WebElement AcctNavigation;
	
	@FindBy(xpath="//*[contains(@class,'nav-action-inner')]")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement emailContinue;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signInCTA;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginTitle() {
		return driver.getTitle();
	}
	
	public HomePage verifyLogin(String usrname, String pasword) {
		
		util.mouseHover(AcctNavigation);
		signIn.click();
		username.sendKeys(usrname);
		emailContinue.click();
		password.sendKeys(pasword);
		signInCTA.click();
		log.info("login sucessssssssssssssssssssssssssss");
		return new HomePage();
		
		
	}
	

}
