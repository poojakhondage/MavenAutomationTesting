package testNGDemo;

import org.testng.annotations.Test;

public class TestDemo2 
{
  @Test(priority=1, description="Test case1")
  public void register() 
  {
	  System.out.println("User registration");
	  
  }
  
  @Test(priority=2, description="Test case2",invocationCount=3)
  
  public void login()
  {
	  System.out.println("User login");
	  
  }
  
@Test(priority=3)
  
  public void search()
  {
	  System.out.println("User search");
  }  

	
    @Test(priority=4,enabled=false)
    
    public void addtocart()
    {
  	  System.out.println(" User addtocart");

    }
}

	 
 



