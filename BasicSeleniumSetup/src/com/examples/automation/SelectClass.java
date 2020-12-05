package com.examples.automation;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		try {

			setUp();

			driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
//			Select myDropdown = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
//			myDropdown.selectByValue("Thursday");
//			myDropdown.selectByValue("Monday");
			Thread.sleep(2000);
			Select myDropdown = new Select(driver.findElement(By.xpath("//select[@name='States']")));
			
			myDropdown.selectByIndex(0);
			Thread.sleep(500);
			myDropdown.selectByIndex(4);
			Thread.sleep(500);
			myDropdown.selectByIndex(6);
			Thread.sleep(3000);
			myDropdown.deselectByIndex(2);
			Thread.sleep(500);
			myDropdown.deselectByIndex(4);
			Thread.sleep(500);
			myDropdown.deselectByIndex(6);
			
			
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
