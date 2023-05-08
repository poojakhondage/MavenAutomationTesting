package testNGDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserTest
{
  @Test(priority=1)
  public void ChromeTest()
  {
	  WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com");
  }
  
  @Test(priority=2)
  
  public void EdgeTest()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.amazon.in");
	  
  }
  
  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }

