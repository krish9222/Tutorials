package com.examples.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) {

		try {
			setUp();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			
			
			Actions act = new Actions(driver);
			act.doubleClick(driver.findElement(By.xpath("//p/code"))).perform();
			
			act.contextClick(driver.findElement(By.xpath("//p/code"))).perform();
			
			act.sendKeys(Keys.ESCAPE).perform();

			String text = driver.findElement(By.xpath("//p/code")).getText();
			
			driver.findElement(By.cssSelector(".form-group input#user-message")).click();
			
			act.keyDown(Keys.COMMAND).sendKeys(driver.findElement(By.cssSelector(".form-group input#user-message")), "v").build().perform();
			
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			tearDown();
		}


	}
	
	
	static void rightClickAndReload() {
		
	}
	
	static void dragAndDrop1() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id='bank']/li"));

		Actions act = new Actions(driver);
		//act.clickAndHold(ele).moveToElement(destination).release().build().perform();
		act.dragAndDrop(ele, destination).build().perform();

		Thread.sleep(4000);
	}

	static void setUp() throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	static void tearDown() {
		driver.quit();
	}

}
