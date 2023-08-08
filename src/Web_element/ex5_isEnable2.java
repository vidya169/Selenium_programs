package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isEnable2 {
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		
		boolean result = driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		
		System.out.println(result);
		
		if(result==true) 
		{
			System.out.println("Element is enabled");
		}
		else 
		{
			System.out.println("Element is disabled");
		}
	}


}
