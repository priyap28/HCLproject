package com.hcl.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 
	 public TestBase() {
		 try
		 {
			 prop= new Properties();
			 FileInputStream ip= new FileInputStream("C:\\Users\\Pradeep\\eclipse-workspace\\Dec2023seleniumsessions\\src\\main\\java\\com\\hcl\\qa\\config\\config.properties");
			 prop.load(ip);
		 } catch (FileNotFoundException e)
		 {
			e.printStackTrace(); 
			 
		 } catch (IOException e)
		 {
			 e.printStackTrace();
		 }
		 
	 }
		 
		 public static void initialization()
		 {
			String browsername =  prop.getProperty("broswer");
			
			if(browsername.equals("chrome"))
			{
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
			
			
		 
		 
	 
}

public static void initialization1()
{
	String browsername =  prop.getProperty("broswer");
	
	if(browsername.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url1"));
	
}}






	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
