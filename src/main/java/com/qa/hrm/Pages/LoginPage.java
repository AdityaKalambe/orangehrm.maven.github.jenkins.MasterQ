package com.qa.hrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	@FindBy(xpath = "//*[@name=\"username\"]")
	private WebElement username;

	@FindBy(xpath = "//*[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath = "//*[@type=\"submit\"]")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verifyurl(String url,WebDriver driver) {
		String Expected=url;
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, Expected);
		System.out.println("test completed");
	}
	public void logincredi(WebDriver driver,String email,String pass) {
		username.sendKeys(email);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
}
