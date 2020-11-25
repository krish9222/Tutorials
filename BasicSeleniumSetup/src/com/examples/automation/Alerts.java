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

public class Alerts {
	static WebDriver driver;
	public static void main(String[] args) {
		
		Date start = new Date();
		System.out.println(start.getTime());
		try {

			setUp();

			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			
			Thread.sleep(2000);
			
			Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			alert.accept();

			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
			
			Date end = new Date();
			System.out.println(end.getTime());
			
			System.out.println(end.getTime() - start.getTime());
			
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
