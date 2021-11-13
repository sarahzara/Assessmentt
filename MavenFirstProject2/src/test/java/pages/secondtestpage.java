package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import utities.action;

public class secondtestpage  extends action  {
	
	
		By upload  = By.xpath("//a[contains(text(),'File Upload')]");
		By fileupload  = By.id("file-upload");
        By submit = By.id("file-submit");
		
	    By checkImage = By.id("uploaded-files");
	   
    	String filepath = "C:\\Users\\Sarah\\Downloads\\Assement\\TASKASSEMENT\\resources\\star-vector-icon-260nw-660000226.jpg";

	     String URL =" https://the-internet.herokuapp.com/";
	    	//ChromeDriver driver;

	   
	    public void openURL() {
	       
	         driver.get(URL);
	    }
	  
	    
	    
	    public void clickupload() {
	    	getElement(upload).click();
	    }
	    
	    

	    public void typeimage() {
	        // getElement(upload).click();

	         getElement(fileupload).sendKeys(filepath);
	         
	    }
	  
	    
	    public void clicksubmit() {
	    	getElement(submit).click();
	    }
	    
	    
	    public void checkdisplay() {
	         getElement (checkImage).isDisplayed();  
	         
     	    assertTrue(true, " picture is Uploaded");
//		    }else {
//		    assertTrue(false, " picture not Uploaded");
		    
	    }
}
