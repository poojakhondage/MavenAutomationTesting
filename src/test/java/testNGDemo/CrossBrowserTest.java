package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
  public WebDriver driver;
  @Parameters({"bname"})
  @Test
  public void tsetOnBrowser(String bname)
  {
	  if(bname.equalsIgnoreCase("Chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }else if(bname.equalsIgnoreCase("Edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  
	  driver.get("https://www.google.com");
  }	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  
	/*  if(bname.equalsIgnoreCase("Chrome"));
	  {
        driver=new ChromeDriver();
        
	  }else if(bname.equalsIgnoreCase("Edge"));
	  {
	
	    
	  }
	 */ 
		  
	
		 
	  

  
  }

