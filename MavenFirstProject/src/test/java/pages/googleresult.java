package pages;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import utities.action;

public class googleresult extends action {
	
	By thirdResult = By.xpath("//div[@class='g']//h3");

	
	// @param keyword A string value to be entered in the field

	public  void  isLinkDisplayed(String elementName) {

		String searchResultLink="//h3[contains(.,'"+elementName+"')]";
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement ele= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchResultLink)));

	}
	
	
	public  WebElement getthirdResult() {
		WebElement Link= driver.findElement(thirdResult);
		return Link;
	}
}