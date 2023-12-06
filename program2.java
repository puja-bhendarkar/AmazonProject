package mytest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program2 {
	
	WebDriver driver;
	@BeforeMethod
	
	
	public void setUp()
	{
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new WebDriver();
	driver.get("https://amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	@Test
	public void AddtoCart()
	{
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphone 15");
		
		//submit it
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		driver.findElement(By.linkText("Tracfone Apple iPhone SE 5G (3rd Generation), 64GB, Black - Prepaid Smartphone (Locked)")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		String value = driver.findElement(By.id("price")).getText();
		
		
	}
	}
@AfterMethod
public void tearDown()

{
driver.quit();	
}

}
