package web.task;


import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.thirdtestPage;
import utities.Testbase;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
@Listeners({ExtentITestListenerClassAdapter.class})
public class thirdTest extends   Testbase {
	
	thirdtestPage loadingtest = new thirdtestPage();
	@Test 
	public void LOADing()  {
		
		loadingtest.openURL();
		loadingtest.clickDynamicLoading();
		loadingtest.clickExample2();
		loadingtest.clickStart();
		loadingtest.textdisplayed();
		loadingtest.checktext();
		
//		WebDriverWait wait = new WebDriverWait(driver, 40 );
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Dynamically Loaded Page Elements')]")));
//	
		
		
		
		
		
	}
	
	
	

}
