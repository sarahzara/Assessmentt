package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import utities.Testbase;
import utities.action;



public class googlepage extends action {
	
	

	
	By input = By.name("q");
	
	

        String googleURL =" https://www.google.com/ncr";


    public void opengoogle() {
       // System.out.println(ConfigUtil.Web_URL);
         driver.get(googleURL);
    }
    
    
    public void typeinput(String inputvalue) {
         getElement(input).sendKeys(inputvalue);
		
         
    }
    
    public void clickinput() {
    	getElement(input).sendKeys(Keys.ENTER);
    }
    
    

	
}
    
    
    
    
    
   


	
 