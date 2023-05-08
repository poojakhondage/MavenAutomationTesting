package DataDrivenTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
    public static void captureScreenshot(WebDriver driver)
    {
    	 try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./"+"\\ScreenShots\\Screen"+System.currentTimeMillis()+".png"));
		} catch (WebDriverException | IOException e) {
			
			e.printStackTrace();
		}
	
    }
	
}
