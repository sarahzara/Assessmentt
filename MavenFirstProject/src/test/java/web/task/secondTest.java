package web.task;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import com.google.common.collect.Table.Cell;

import pages.secondtestpage;
import utities.Testbase;


import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
@Listeners({ExtentITestListenerClassAdapter.class})
public class secondTest extends  Testbase {
	
	
	
	secondtestpage uploadtest = new secondtestpage();
	
	
	@Test 
	public void UPLOAD() {
    	

		uploadtest.openURL();
		uploadtest.clickupload();
		//uploadtest.clickimage();
		uploadtest.typeimage();
		uploadtest.clicksubmit();
		uploadtest.checkdisplay();
		
	
		
		
	}
	

	
	
	
}
	

