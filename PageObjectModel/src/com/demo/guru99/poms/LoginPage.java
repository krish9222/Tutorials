package com.demo.guru99.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	String baseUrl = "http://demo.guru99.com/v4/index.php";
	
	By inputUserName = By.xpath("//input[@name='uid']");
	By inputPassword = By.xpath("//input[@name='password']");
	By inputBtnLogin = By.xpath("//input[@name='btnLogin']");

	public LoginPage(WebDriver dr) {
		this.driver = dr;
	}
	
	public void open() {
		driver.get(baseUrl);
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(inputBtnLogin));
	}
	
	public void setUserName(String value) {
		driver.findElement(inputUserName).sendKeys(value);
	}
	
	public void setPassword(String value) {
		driver.findElement(inputPassword).sendKeys(value);
	}
	
	public void clickLoginBtn() {
		driver.findElement(inputBtnLogin).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(inputBtnLogin));
	}
	
	public HomePage login(String uname, String pass) {
		setUserName(uname);
		setPassword(pass);
		clickLoginBtn();
		return new HomePage(driver);
	}
}
