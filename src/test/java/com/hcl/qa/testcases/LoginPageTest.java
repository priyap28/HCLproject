package com.hcl.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hcl.qa.base.TestBase;
import com.hcl.qa.pages.HomePage;
import com.hcl.qa.pages.LoginPage;
import com.hcl.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SignUpPage signUpPage;
	
	public LoginPageTest()
	{
		super();
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage = new LoginPage();
	}
	

	@Test(priority=1)
	public void loginPageTitleTest()
	{
	String title= loginPage.validateloginPageTitle();
	Assert.assertEquals(title, "Account Login");
	}
	
	
	@Test(priority=2)
	public void loginTest()
	{
		homePage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
