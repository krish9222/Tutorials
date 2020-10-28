package com.sky.selenium;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(3000);
		
		String hompageH1Text = driver.findElement(By.cssSelector(".hero.homepage")).getText();
		
		Asserts.check(hompageH1Text.contains("Selenium automates browsers. That's it!"), "H1 text is incorrect!!");
		
		driver.quit();
		
	}

}
