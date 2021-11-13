package utities;

import java.util.List;

import org.openqa.selenium.*;

public class action extends Testbase{

	  public WebElement getElement(By locator) {
	        WebElement element = null;
	        try {
	            element = driver.findElement(locator);
	            //scrollPageToElement(element);
	        } catch (Exception ignored) {
	        }
	        return element;
	    }

//	  public void scrollDownToView(WebElement result) {
//	        ((JavascriptExecutor) driver).
//	                executeScript("arguments[0].scrollIntoView({behavior:'smooth',block: 'center'});",
//	                        result);
//	    }

//	public void scrollDownToView(WebElement result) {
//		// TODO Auto-generated method stub
//		
//	}
	  public void scrollDownToBottomOfPage() {
	        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	        javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    }
	  }  
	  

