package com.qa.Testclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest.BaseTest;
import com.qa.hrm.Pages.LoginPage;

public class Loginpage_TC extends BaseTest {
	LoginPage lp;
	SoftAssert sa;

	@BeforeClass
	public void initObject() {
		lp = new LoginPage(driver);
		sa = new SoftAssert();

	}

	@Test(priority = 1)
	public void verifyurl() {
		lp.verifyurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

	}

	@Test(dataProvider = "testdata", priority = 2)
	public void logindetail(String email, String pass) {
		
			lp.logincredi(driver,email, pass);
		System.out.println("done");
		
	}
}
