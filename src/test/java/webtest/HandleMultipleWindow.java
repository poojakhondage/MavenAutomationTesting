package webtest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Parent Window 
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//child window
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String childId:allWindows)
		{
			if(!parentID.equals(childId))
			{
				driver.switchTo().window(childId);
				driver.findElement(By.name("EmailHomePage")).sendKeys("pooja@gmail.com");
				

			}
		}
		
		
		
		
		
		//driver.findElement(By.name("Email")).sendKeys("test@gmail.com");
		
	} 
	

}
