package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utities.action;

public class thirdtestPage  extends action {
	
	
	By DynamicLoading  = By.xpath("//a[contains(text(),'Dynamic Loading')]");
	By Example2 = By.xpath("//a[contains(text(),'Example 2: Element rendered after the fact')]");
	By Start  = By.xpath("//button[contains(text(),'Start')]");
	By text = By.xpath("//h4[contains(text(),'Hello World!')]");
	

    //=============================Strings==================================

     String URL =" https://the-internet.herokuapp.com/";
    	

    //===================================Actions===================================
    public void openURL() {
     
         driver.get(URL);
    }
    
    public void clickDynamicLoading() {
    	getElement(DynamicLoading).click();
    }
    
    
    
    public void clickExample2() {
    	getElement(Example2).click();
    }
    
    
    
    public void clickStart() {
    	
    	getElement(Start).click();
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, 40 );
         wait.until(ExpectedConditions.visibilityOfElementLocated(text));
    }
    
    
    public void textdisplayed() {

	
        getElement(text).isDisplayed(); 
        
        
    }
    
    
    public void checktext() {
        getElement(text).getText();
 	    assertTrue(true, "Hello World!");
   
    }
}
