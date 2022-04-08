package com.qa.freeCRM.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.freeCRM.base.TestBase;

public class Utility extends TestBase {

	public void mouseHover(WebElement web) {
		Actions act = new Actions(driver);
		act.moveToElement(web).build().perform();
		
	}
	
	public String takeScreenshot(WebDriver driver, String filename) {
		TakesScreenshot scr = (TakesScreenshot)driver;
		File src= scr.getScreenshotAs(OutputType.FILE);
		File dest = new File(workingDir+"/Screenshots/"+filename+".png");
		String errpath=dest.getAbsolutePath();
		log.info(errpath);
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errpath;
	}
	
	public void ExpectedCondition(WebElement ele) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
