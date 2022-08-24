package com.qa.ActionDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.BaseTest.BaseTest;

public class MoveToeEements extends BaseTest {

	public static void MoveToSingleElement(WebElement SingleLocator) {
		Actions act = new Actions(driver);
		act.moveToElement(SingleLocator).build().perform();
	}

	public static void MoveToMultipleElement(List<WebElement>MultipleElement) {
		Actions act = new Actions(driver);
		for(WebElement ele:MultipleElement) {
			act.moveToElement(ele).build().perform();
		}
		
	}
}
