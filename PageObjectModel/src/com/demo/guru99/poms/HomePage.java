package com.demo.guru99.poms;

import com.demo.guru99.utils.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	
	String baseUrl;
	
	By homePageWelcomeText = By.xpath("//marquee[@class='heading3']");
	
	public HomePage(WebDriver driver) {
		this.baseUrl = CommonUtils.getBaseProperty("guru99DomainName") + "/v4/manager/Managerhomepage.php";
		this.driver = driver;
	}
	
	public String getWelcomeMessage() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(homePageWelcomeText));
		String text = driver.findElement(homePageWelcomeText).getText();
		return text;
	}
	
}
