package com.qa.ActionDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.BaseTest.BaseTest;

	public class ScrollWebPage extends BaseTest {

		public static void scrollByvisiblityofElement(WebElement ele) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments [0].scrollIntoView();", ele);
		}
}
