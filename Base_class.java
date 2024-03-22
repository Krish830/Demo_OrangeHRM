package Genric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class implements Base_constant 
{
	public WebDriver driver;
 @BeforeMethod
public void oppapp()
 {
	 System.setProperty(chrome_key,chrome_value );
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
 }
 @AfterMethod
 public void close() throws InterruptedException
 {
	 Thread.sleep(time);
	driver.quit(); 
 }
}
