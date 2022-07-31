package supportMultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UnDosTresAssingment1 {
	
 @Test //test case
 public void facebookTest()
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\chromedriver_win32\\chromedriver.exe");
	
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumAutomation\\geckodriver.exe");
		
			WebDriver driver1 =new ChromeDriver();//open chrome driver
			driver1.manage().window().maximize();
			driver1.get("https://www.google.com");
			
			WebDriver driver=new FirefoxDriver();//open firefox driver
			driver.manage().window().maximize();
			driver.get("https//www.facebook.com");
			
	}


}
