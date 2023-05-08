package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest 
{
  @Test(priority=1)
  public void registration() 
  {
	  System.out.println("This is Registration Process");
	  Assert.assertEquals(false, true);
  }
  
  
  @Test(priority=2,dependsOnMethods = "registration")
  public void login() 
  {
	  System.out.println("This is login Process");
	  
  }
  
}


