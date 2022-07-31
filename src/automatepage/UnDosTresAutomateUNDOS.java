package automatepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnDosTresAutomateUNDOS {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumAutomation\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();//Upcasting
		
		driver.manage().window().maximize();//get window maximize
		
		driver.get("http://sanbox.undostres.com.mx");//go to the url
		
		System.out.println("");
		WebElement mobile=driver.findElement(By.xpath("//div[@class='field']/descendant::div/descendant::input[@data-qa='celular-mobile']"));
		mobile.sendKeys("8465433546");// send data to mobile number field
		
		
		WebElement oprador=driver.findElement(By.xpath("//input[@data-qa='celular-operator']"));
		oprador.click();//select the operator
		
		driver.findElement(By.xpath("//li[@data-name='telcel']")).click();
		
		
		WebElement amt=driver.findElement(By.xpath("//input[@data-qa='celular-amount']"));
		amt.click();
		driver.findElement(By.xpath("//li[@data-show='$10 (Recarga Saldo)']")).click();//select the package which u want
		
		driver.findElement(By.xpath("//button[@data-qa='celular-pay']")).click();//next 
		
		
		//2nd page will open
		driver.findElement(By.xpath("//p[@data-qa='tarjeta-tab']")).click();
		WebElement radio1= driver.findElement(By.xpath("//*[text()='Usar nueva tarjeta']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(radio1).click().build().perform();
		
		radio1.click();//click on radio button
		
		driver.findElement(By.xpath("//input[@data-qa='numero-de-tarjeta-input']")).sendKeys("4111111111111111");
		driver.findElement(By.xpath("//input[@data-qa=\"mes-input\"]")).sendKeys("11");
		driver.findElement(By.xpath("//input[@data-qa=\"expyear-input\"]")).sendKeys("25");
		driver.findElement(By.xpath("//input[@data-qa=\"cvv-input\"]")).sendKeys("111");
		driver.findElement(By.xpath("//input[@class='form-control email preventChromeAutofill']")).sendKeys("test@test.com");
		
		driver.findElement(By.xpath("//button[@id='paylimit']")).click();
		
		
		//popup  window
		WebElement username=driver.findElement(By.xpath("//input[@id='usrname']"));//username xpath
			username.sendKeys("automationexcersise@test.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='psw']"));//password xpath
		password.sendKeys("123456");
	 
		//need to switch on frame
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='a-jg1qyairip5r']"));
		driver.switchTo().frame(iframe);
		
     	WebElement captcha=driver.findElement(By.xpath("//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-hover']"));
		captcha.click();		
		
		
		//submit button click
		WebElement submit=driver.findElement(By.xpath("//button[@class='button inactive btn-block']"));//last submitt button
		submit.click();
	
		
		
	}
}
