package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginYahooChromeBrowser {

@Test
	public void LoginYahoo() throws InterruptedException{

	System.setProperty("webdriver.chrome.driver", "V:/SeleniumJars/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(3000);
	
	driver.get("http://mail.yahoo.com");
	
	//driver.findElement(By.linkText("Sign in")).click();
	
	driver.findElement(By.id("login-username")).sendKeys("vijayv75");
	driver.findElement(By.id("login-passwd")).sendKeys("Create78");
	driver.findElement(By.id("login-signin")).click();
		
	
}
	
}
