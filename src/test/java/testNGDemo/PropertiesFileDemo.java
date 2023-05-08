package testNGDemo;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileDemo 
{
  @Test
  public void readfile() throws IOException
  {
	  File f1=new File("./"+"\\config.properties");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  System.out.println("Browser Name is: "+p1.getProperty("browser Name"));
	  System.out.println("Browser Version is: "+p1.getProperty("browser Version"));
  }
  
}
