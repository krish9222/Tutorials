package com.examples.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsExamples {
	static WebDriver driver;
	public static void main(String[] args) {
		
		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/ExpectedConditions.html");
			
			WebElement ele = driver.findElement(By.xpath("//a[@href='ExpectedCondition.html']/code"));
			
			Actions act = new Actions(driver);
			act.keyDown(Keys.COMMAND).click(ele).perform();
			
			
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}
		
		
	}
	
	static void setUp() throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	static void tearDown() {
		driver.quit();
	}

}
