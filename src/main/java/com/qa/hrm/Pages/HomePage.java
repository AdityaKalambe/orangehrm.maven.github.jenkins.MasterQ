package com.qa.hrm.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ActionDriver.MoveToeEements;

public class HomePage {
	@FindBy(xpath="//*[@class=\"oxd-topbar-body-nav-tab-item\"]")
	private WebElement Report;
	
	@FindBy(xpath="//li[@class=\"oxd-main-menu-item-wrapper\"]")
	private List<WebElement>sideindex;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void MouseHoverOnReport() {
		MoveToeEements.MoveToSingleElement(Report);
		
	}
	public void MouseHoverOnSideIndex() {
		MoveToeEements.MoveToMultipleElement(sideindex);
	}
	public void verfiytitle(WebDriver driver,String expectedTitle,String actual) {
	    
	}

}
