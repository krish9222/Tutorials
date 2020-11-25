package com.examples.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			setUp();
			
			
			driver.get("http://www.globemoon.net/iframe-ex.html");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='iframe-congrats.html']")));
			
			String text = driver.findElement(By.xpath("//pre")).getText();
			System.out.println(text);
			
			
			driver.switchTo().defaultContent();
			
			
			String title = driver.findElement(By.xpath("//center/u//font")).getText();
			System.out.println(title);
			
			
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
