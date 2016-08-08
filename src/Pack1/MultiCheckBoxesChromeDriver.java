package Pack1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultiCheckBoxesChromeDriver {
	
	@Test
	
	public void checkboxes() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "V:/SeleniumJars/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		driver.get("http://tizag.com");
		driver.findElement(By.linkText("HTML Tutorial")).click();
		driver.findElement(By.linkText("HTML - Checkboxes")).click();
		//driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[i]")).click();
		
		for (int i=1; i<=4; i++){
	driver.findElement(By.xpath("//html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input["+i+"]")).click();
		}
		
		
		
		
		
	}

}
