package TestAPI.TestDebugging;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDebug {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
	}
	
	

	
	@Test
	public void testDebug(){
		
		
		
		List <WebElement> wB = driver.findElements(By.name("hsjhfkwehfkeshf"));		
		wB.get(0);
		
		Actions act =new Actions(driver);
	}

	@Test
	public void wtest() {
		
		List <WebElement> wB = driver.findElements(By.name("hsjhfkwehfkeshf"));
		System.out.println("webelements" +wB);

	}
}
