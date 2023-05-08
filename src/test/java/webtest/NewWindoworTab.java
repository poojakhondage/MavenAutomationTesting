package webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindoworTab {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		for (int i=1; i<=10; i++)
		{
		//new Tab

		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("https://www.facebook.com");
		}
		//new Window
		
		
        driver.switchTo().newWindow(WindowType.WINDOW);
       // newTab.get("https://www.amazon.in");
        
		driver.close();
		
		}
	}
	

		
		
		
		
		
		
		
		
	


