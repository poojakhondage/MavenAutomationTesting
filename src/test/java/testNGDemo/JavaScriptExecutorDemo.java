package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class JavaScriptExecutorDemo {
  @Test
  public void amazonScroll()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  
	 
	  
	  
	  
  }
}
