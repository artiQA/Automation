package com.qa.freeCRM.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.freeCRM.Utils.Utility;
import com.qa.freeCRM.base.TestBase;

public class CartPage extends TestBase{
	Utility util;
	
	@FindBy(xpath="//div[@class='sc-list-item-content']")
	List<WebElement> cartItems;
	
	@FindBy(xpath="//input[@value='Delete']")
	WebElement deleteCTA;
	
	public CartPage(){
		PageFactory.initElements(driver, this);
		util=new Utility();
	
	}
	
	public boolean cartItemPresentCheck() {
		WebElement wb = driver.findElement(By.xpath("//div[@class='sc-list-item-content']"));
		Boolean bool = wb.isDisplayed();
		return bool;
	}
	
	public void removeCartItem() {
		for(WebElement wb:cartItems) {
			System.out.println(wb);
			util.ExpectedCondition(deleteCTA);
			deleteCTA.click();
		}
	}

}
