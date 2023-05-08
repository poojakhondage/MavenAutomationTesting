package testNGDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

public class XmlDataPassingDemo1
{
 @Parameters({"id","name"})
	
  @Test
  public void testcase (int id,String name) 
  {
	  System.out.println("User id is: "+id);
	  System.out.println("User name is: "+name);
	  
  }
}
