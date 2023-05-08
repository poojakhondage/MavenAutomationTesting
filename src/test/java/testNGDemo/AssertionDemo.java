package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
  @Test
  public void hardAssertTest()
  {
	  String act="Selenium WebDriver is webui automation library.";
	  String exp="Selenium WebDriver is webui automation library.";
	  
	  Assert.assertEquals(act, exp,"String are not matchings!");
	  System.out.println("Hard Assert Demo is Completed! ");
  }
  
  
  
}
