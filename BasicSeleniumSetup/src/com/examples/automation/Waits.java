package com.examples.automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		try {
			setUp();
			
			// Implicit Waits
			//implicitWait();
			
			//Explicit Waits
			//explicitWait();
			
			
			//Fluent Waits
			fluentWait();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}
		
		
	}
	
	
	static void fluentWait() {
		driver.get("https://www.samsclub.com/p/bigelow-herbal-ast/prod13710038?xid=plp_product_2");
				
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(2))
				  .pollingEvery(Duration.ofSeconds(1))
				  .ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, Boolean>() {
		  public Boolean apply(WebDriver driver) {
		    return driver.findElement(By.id("ratings-summary")).getText().contains("61");
		  }
		});
		
		WebElement ratings = driver.findElement(By.id("ratings-summary"));
		String content = ratings.getAttribute("aria-label");
		System.out.println(content);
	}
	
	
	static void explicitWait() {
		driver.get("https://www.samsclub.com/p/bigelow-herbal-ast/prod13710038?xid=plp_product_2");
		new WebDriverWait(driver, 10).until(driver -> driver.findElement(By.id("ratings-summary")).getText().contains("61"));
		
		//new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("ratings-summary")));
		
		WebElement ratings = driver.findElement(By.id("ratings-summary"));
		
		
		
		String content = ratings.getAttribute("aria-label");
		System.out.println(content);
	}
	
	
	static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.samsclub.com/p/bigelow-herbal-ast/prod13710038?xid=plp_product_2");
		WebElement ratings = driver.findElement(By.id("ratings-summary"));
		String content = ratings.getAttribute("aria-label");
		System.out.println(content);
	}
	
	static void setUp() throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	static void tearDown() {
		driver.quit();
	}
	
	
	

}
