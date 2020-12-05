package com.examples.automation;

import java.io.File;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor100 {

	static WebDriver driver;

	public static void main(String[] args) {
		try {

			setUp();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
			
			Map<String, String> myMap = new HashMap<String, String>();
			
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					  .withTimeout(Duration.ofSeconds(10))
					  .pollingEvery(Duration.ofSeconds(1))
					  .ignoring(NoSuchElementException.class)
					  .ignoring(StaleElementReferenceException.class);
			
//			for (int i = 0; i < 5; i++) {
				driver.findElement(By.id("save")).click();
				
				wait.until(ExpectedConditions
						.attributeContains(
								By.cssSelector("#loading img"), 
								"src", 
								"randomuser"));
				
				String text = driver.findElement(By.id("loading")).getText().trim();
				System.out.println(text);
				System.out.println("------------------------------------");
				
				text = text.replaceFirst("\n", ",");
				System.out.println(text);
				System.out.println("------------------------------------");
				
				
				String[] textArr = text.split(",");
				String fname = textArr[0].trim();
				String lname = textArr[1].trim();
//				System.out.println(fname);
//				System.out.println(lname);
//				System.out.println("------------------------------------");
				
				
				fname = fname.substring(fname.indexOf(":")).replace(":", "").trim();
				lname = lname.substring(lname.indexOf(":")).replace(":", "").trim();
//				System.out.println(fname);
//				System.out.println(lname);
//				System.out.println("------------------------------------");
				
				myMap.put(fname, lname);
//			}
			
//			System.out.println(myMap);


			Thread.sleep(2000);
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
