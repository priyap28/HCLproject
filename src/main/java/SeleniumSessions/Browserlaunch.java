package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		
if(title.equals("Google"))
{
	System.out.println("correct broswer");
}

else
{
	System.out.println("wrong browser");
}
	String latesttitle=driver.getTitle();
	System.out.println(latesttitle);
    driver.close();
    
	}

}
