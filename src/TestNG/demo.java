package TestNG;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
//import org.testng.annotations.Parameters; 
import org.testng.annotations.Test; 

public class demo 
{
		
	//@Parameters("browserName") 
	@Test
	public void TC() 
	 { 
	// WebDriver driver = null; 
	 //if(browserName.equals("Chrome")) 
	 
	 { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); 
	 
	
	 

	driver.get("https://kite.zerodha.com/"); 
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");
	
	//Enter pwd
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7066650010");
			
	//click on login btn
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	 }
	 }
}


