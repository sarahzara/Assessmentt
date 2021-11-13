package web.task;

import static org.junit.Assume.assumeTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.googlepage;
import pages.googleresult;
import utities.Testbase;
import utities.action;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
@Listeners({ExtentITestListenerClassAdapter.class})
public class firstTest extends Testbase {
	
	
	googlepage FirstTest = new googlepage();
	googleresult result = new googleresult();
    action Action = new action();
	@Test 
	public void googlesearch() throws IOException {
	
			//FirstTest.launchBrowser();
			FirstTest.opengoogle();
			FirstTest.typeinput("selenium webdriver");
			FirstTest.clickinput();
			


					
			
				String thirdLinkText= result.getthirdResult().getAttribute("innerText");
				
				
				if(thirdLinkText.contains("What is Selenium WebDriver?")) {
				   System.out.println("the third result text contains What is Selenium WebDriver? ");
				}else {
					System.out.println("the third result text NOT  contains What is Selenium WebDriver? ");

				}
		//assertTrue(thirdLinkText.contains("What is Selenium WebDriver?"));
			}
	


	}
	

