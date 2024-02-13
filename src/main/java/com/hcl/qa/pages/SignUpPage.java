package com.hcl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import com.hcl.qa.base.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(id="AccountFrm_firstname")
	WebElement firstname;
	
	@FindBy(id="AccountFrm_lastname")
	WebElement lastname;
	
	@FindBy(id="AccountFrm_email")
	WebElement email;
	
	@FindBy(id="AccountFrm_address_1")
	WebElement address1;
	
	@FindBy(id="AccountFrm_city")
	WebElement citys;
	
	@FindBy(id="AccountFrm_postcode")
	WebElement zip;
	
	@FindBy(id="AccountFrm_loginname")
	WebElement loginname;
	
	@FindBy(id="AccountFrm_password")
	WebElement loginpassword;
	
	@FindBy(id="AccountFrm_confirm")
	WebElement passwordconfirm;
	
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/button[1]")
	WebElement clickee;
	
	
	public SignUpPage()
{
		PageFactory.initElements(driver, this);
		
	}
//	
//	public void clickoncontinue()
//	{
//		clickee.click();
//		
//	}
	
	public void logining(String firstn, String lastn,String emai,String add1,String city, String postc,String loginn,String passd)
	{
		
		//firstname.click();
		firstname.sendKeys(firstn);
		lastname.sendKeys(lastn);
		email.sendKeys(emai);
		address1.sendKeys(add1);
		citys.sendKeys(city);
		zip.sendKeys(postc);
		loginname.sendKeys(loginn);
		loginpassword.sendKeys(passd);
		
		passwordconfirm.click();
		//return new HomePage();
	}


}
