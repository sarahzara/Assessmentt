package utities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshots extends Testbase{
	public static int screenshoutNumber = 0;
    public String captureScreenShot(String screenshotName)
    {
    	//String SCREENSHOTS ="C:\\Users\\Sarah\\Downloads\\Assement\\TASKASSEMENT\\test-output\\screenshots";
    	String SCREENSHOTS = System.getProperty("user.dir")+"/test-output/screenshots/";
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String dest = SCREENSHOTS +screenshotName+ screenshoutNumber++ +".png";
        //Adding time stamp else it will replace the previous screenshots
        try
        {
            FileUtils.copyFile(src, new File(dest));
        }
        catch (IOException e) {
            System.out.println("Failed to get screenshot"+e.getMessage());
            e.printStackTrace();
        }
        return dest;
    }
}
