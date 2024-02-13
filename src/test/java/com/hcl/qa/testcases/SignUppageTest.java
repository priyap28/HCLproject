package com.hcl.qa.testcases;

//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hcl.qa.base.TestBase;
import com.hcl.qa.pages.HomePage;
import com.hcl.qa.pages.LoginPage;
import com.hcl.qa.pages.SignUpPage;

public class SignUppageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	SignUpPage signUpPage;
	
	public SignUppageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization1();
		signUpPage = new SignUpPage();
	} 
	

//	@Test(priority=1)
//	public void clickonthecontinue()
//	{
//		signUpPage.clickoncontinue();
//	}
	
	@Test(priority=1)
	public void clickonsighuppage()
	{
		//signUpPage.logining(null, null, null, null, null, null, null, null);
		signUpPage.logining(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("email"),
				prop.getProperty("email"),prop.getProperty("citys"),prop.getProperty("zip"),prop.getProperty("loginname"),
				prop.getProperty("loginpassword"));
		
		}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
