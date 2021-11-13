package utities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testbase {
    public static WebDriver driver;

	//ChromeDriver driver;
	
   // public static WebDriverWait wait;
	    
	
	@BeforeClass
	
    public void launchBrowser(){
//		WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
      
        
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        
        
        
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
     //  wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	@AfterClass
	public void cloaseBrowser() {
		driver.quit();
	}
	
	
	
	
//	  public WebElement getElement(By locator) {
//	        WebElement element = null;
//	        try {
//	            element = driver.findElement(locator);
//	            //scrollPageToElement(element);
//	        } catch (Exception ignored) {
//	        }
//	        return element;
//	    }
	
}
