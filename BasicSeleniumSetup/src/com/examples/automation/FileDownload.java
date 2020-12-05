package com.examples.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownload {
	static WebDriver driver;
	public static void main(String[] args) {
		
		setUp();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		
		driver.findElement(By.xpath("//textarea")).sendKeys("Hi Hello");
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create")));
		driver.findElement(By.cssSelector("#create")).click();
		//tearDown();
	}
	
	static void setUp() throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	static void tearDown() {
		driver.quit();
	}

}
