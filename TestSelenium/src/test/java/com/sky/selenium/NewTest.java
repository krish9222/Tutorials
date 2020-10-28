package com.sky.selenium;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
	}
	
	@Test
	public void f() {
		String hompageH1Text = driver.findElement(By.cssSelector(".hero.homepage")).getText();		
		Assert.assertTrue(hompageH1Text.contains("Selenium automates browsers. That's it!"), "H1 text is incorrect!!");
	}
	

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
