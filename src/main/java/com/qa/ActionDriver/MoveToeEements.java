package com.qa.ActionDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.BaseTest.BaseTest;

public class MoveToeEements extends BaseTest {

	public static void click(WebElement locatorNames) {
		Actions act = new Actions(driver);
		act.moveToElement(locatorNames).click().build().perform();
	}
}
