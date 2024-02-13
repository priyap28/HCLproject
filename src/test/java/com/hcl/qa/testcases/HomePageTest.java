package com.hcl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hcl.qa.base.TestBase;
import com.hcl.qa.pages.HomePage;
import com.hcl.qa.pages.LoginPage;
import com.hcl.qa.pages.SignUpPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SignUpPage signUpPage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	  public void verifyHomePageTitle()
	  {
		String homepagetitle= homePage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "A place to practice your automation skills!");
	  }
	
	@Test(priority=2)
	public void clickonthemakeuppage()
	{
		homePage.clickonmakeuppage();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
