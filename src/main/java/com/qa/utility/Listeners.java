package com.qa.utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.BaseTest.BaseTest;

public class Listeners extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.captureScreen(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	

}
