package com.hcl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hcl.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath= "//body/div[1]/div[1]/div[1]/section[1]/nav[1]/ul[1]/li[3]/a[1]")
	WebElement makeup;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	public void clickonmakeuppage()
	{
		makeup.click();
		
	}
	
}


