package com.demo.guru99.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.demo.guru99.poms.HomePage;
import com.demo.guru99.poms.LoginPage;
import com.demo.guru99.utils.*;

public class LoginTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/krish/Downloads/chromedriver");
		String expectedValue = "Welcome To Manager's Page of Guru99 Bank";
		WebDriver driver = new ChromeDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.open();
		HomePage home = loginPage.login(CommonUtils.getBaseProperty("uname"), CommonUtils.getBaseProperty("password"));
		String actualValue = home.getWelcomeMessage();
		
		System.out.println(actualValue.contains(expectedValue));
		driver.quit();
	}

}
