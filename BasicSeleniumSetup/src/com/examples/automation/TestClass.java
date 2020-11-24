package com.examples.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		//System.setProperty("webdriver.gecko.driver","/Users/krish/Downloads/geckodriver");
		//System.setProperty("webdriver.edge.driver","/Users/krish/Downloads/edgedriver_mac64/msedgedriver");
		
		//WebDriver browser = new ChromeDriver();
		WebDriver browser = new ChromeDriver();

		browser.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		
		WebElement projetcsTab = browser.findElement(By.xpath("//a[@href='/projects' and @class='nav-item']"));
		
		projetcsTab.click();
	
		Thread.sleep(2000);
		
		WebElement searchBox = browser.findElement(By.xpath("//input[@name='search']"));
		
		searchBox.sendKeys("drivers");
		
		Thread.sleep(2000);
		
		WebElement magnifier = browser.findElement(By.cssSelector("img.search-icon"));
		
		magnifier.click();
		
		Thread.sleep(2000);
		
		browser.quit();
		
	}

}
