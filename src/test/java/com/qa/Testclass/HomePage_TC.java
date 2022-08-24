package com.qa.Testclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.BaseTest.BaseTest;
import com.qa.hrm.Pages.HomePage;

public class HomePage_TC extends BaseTest {
HomePage hp;
SoftAssert sa;
	
	@BeforeClass
	public void initObjec() {
		hp=new HomePage(driver);
		sa=new SoftAssert();
	}
	@Test(priority=1)
	public void mouseHove()  {
		hp.MouseHoverOnReport();
		System.out.println("mouseHover On Report Tab completed Successfully");
	}
	@Test(priority=2)
	public void MouseActionOnSideIndex() {
		hp.MouseHoverOnSideIndex();
	}
	@Test(priority=3)
	public void verifyTitle() {
		hp.verfiytitle(driver, "OrangeHRM", driver.getTitle());
		sa.assertTrue(false);
		System.out.println("intentionally fail ");
		sa.assertAll();
	}
}
