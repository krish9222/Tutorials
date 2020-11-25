package com.examples.automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShot {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		try {
			
			setUp();
			
			driver.get("https://www.seleniumeasy.com/selenium-tutorials");
			
			Thread.sleep(2000);
			
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        FileUtils.copyFile(scrFile, new File("/Users/krish/Desktop/image.png"));
	        
	        WebElement navBar = driver.findElement(By.cssSelector("header#navbar"));
	        
	        scrFile = navBar.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("/Users/krish/Desktop/image2.png"));
	        
	        
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
