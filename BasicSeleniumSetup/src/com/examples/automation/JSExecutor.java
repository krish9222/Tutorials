package com.examples.automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {
	static WebDriver driver;
	public static void main(String[] args) {
		try {

			setUp();

			driver.get("https://www.seleniumeasy.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			Thread.sleep(3000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("console.log('Hello, I came from selenium!!!!');", "");
			
			
			Thread.sleep(5000);
			
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
