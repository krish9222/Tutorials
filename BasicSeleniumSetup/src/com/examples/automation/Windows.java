package com.examples.automation;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver browser=null;
		
		try {
			System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
			browser = new ChromeDriver();
			
			
			String baseUrl = "https://www.kayak.com/cars/SFO-a13852/2020-11-28/2020-12-09?sort=rank_a";
			browser.get(baseUrl);
			String mainWindow = browser.getWindowHandle();
			System.out.println("getWindowHandle before clikcing on view button --> " + mainWindow);
			Thread.sleep(3000);
			
			
			
			
			browser.findElement(By.cssSelector("#providerSelect_b186628608f6acbf39d21c70d729e698")).click();
			Thread.sleep(3000);
			System.out.println("getWindowHandle after clicking on view button --> " + browser.getWindowHandle());
			
			
			
			ArrayList<String> list = new ArrayList<String>(browser.getWindowHandles());
			System.out.println("Size of the list = " + list.size());
			System.out.println("ID 1 = " + list.get(0));
			System.out.println("ID 2 = " + list.get(1));
			
			// Switch to second window
			browser.switchTo().window(list.get(1));
			
			// Print the window ID 
			System.out.println("getWindowHandle after switching the window --> " + browser.getWindowHandle());
			String window2Url = browser.getCurrentUrl();
			
			// Print URLs
			System.out.println("Base/Window1 URL = " + baseUrl);
			System.out.println("Window2 URl = " + window2Url);
			
			
			browser.close();
			Thread.sleep(1000);
			
			browser.switchTo().window(list.get(0));
			Thread.sleep(1000);
			
			browser.findElement(By.xpath("//button[@class='_tW _isC _tQ _iAx _iqi']")).click();
			Thread.sleep(500);
			
			browser.findElement(By.cssSelector("#providerSelect_b186628608f6acbf39d21c70d729e698")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		Thread.sleep(5000);
		browser.quit();
	}
	
	

}
