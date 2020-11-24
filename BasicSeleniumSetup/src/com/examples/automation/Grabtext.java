package com.examples.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grabtext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
	
		WebDriver browser = new ChromeDriver();

		browser.get("https://www.seleniumeasy.com/");
		
		
		//WebElement headingEle = browser.findElement(By.className("easy-title"));
		//WebElement headingEle = browser.findElement(By.xpath("//div[@class='easy-title']"));
		//WebElement headingEle = browser.findElement(By.cssSelector(".easy-title"));
		//WebElement headingEle = browser.findElement(By.id("navbar"));
		//WebElement headingEle = browser.findElement(By.linkText("Appium"));
		//WebElement headingEle = browser.findElement(By.name("search_block_form"));
		//WebElement headingEle = browser.findElement(By.partialLinkText("Apache"));
		//WebElement headingEle = browser.findElement(By.tagName("input"));

		
		//headingEle.sendKeys("Hello");
		//String txt = headingEle.getText();
		
		//System.out.println("Grabbed text is --> " + txt);
		Thread.sleep(1000);
		
		browser.findElement(By.xpath("//footer//a[@title='selenium tutorials']")).click();
				
		browser.findElement(By.xpath("//li[@class='last expanded dropdown']")).click();
		
		
		Thread.sleep(1000);
		
		//----------------------------------------------------
		List<WebElement> list = browser.findElements(By.xpath("//nav//a"));
		
		for (int i = 0; i < list.size(); i++) {
			WebElement ele = list.get(i);
			System.out.println("Text --> " + ele.getText());
			System.out.println("Attribute --> " + ele.getAttribute("href"));
		}
		
		System.out.println("List size is --> " + list.size());
		
		
		
		
		Thread.sleep(2000);
		browser.quit();
		
		
	}

}
