import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProject {
	static WebDriver driver;
	static  WebDriverWait webwait;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
			
			//maximise browser
			driver.manage().window().maximize();
			
			
			//open url
		driver.get("https://amazon.com");
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		
		webwait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
		
		
		// Instantiate the Actions class
        Actions actions = new Actions(driver);
        

        // Perform the mouse hover action
        actions.moveToElement(element).build().perform();
	  driver.findElement(By.xpath("//a[@data-nav-ref='nav_signin']/span[@class='nav-action-inner']")).click();
      driver.findElement(By.name("Sign in")).click();
        
       driver.findElement(By.partialLinkText("https://www.amazon.com/ap/register")).click();
        
		
		
         webwait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		 driver.findElement(By.name("email")).sendKeys("pujabhendarkar@gmail .com");
		 driver.findElement(By.id("createAccountSubmit")).click();
		 driver.findElement(By.id("continue"));
		
		
		//2) search iphone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphone 15");
		
		//submit it
		driver.findElement(By.id("nav-search-submit-button")).submit();
		
		driver.findElement(By.linkText("Tracfone Apple iPhone SE 5G (3rd Generation), 64GB, Black - Prepaid Smartphone (Locked)")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		String value = driver.findElement(By.id("price")).getText();
		
		
		
	

     // 3)Apply filters--> validate filter list
		
		
}
}
