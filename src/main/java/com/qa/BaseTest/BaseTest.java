package com.qa.BaseTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.qa.config.properties.prop;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	@BeforeSuite
	public void BrowserSetup() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		prop po=new prop();
		po.fetchurl("url");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name="testdata")
	public String [][]hrm() throws IOException{
	 String data[][]=com.qa.testdata.DproviderExcel.getData();
	return data;
	 }
}
