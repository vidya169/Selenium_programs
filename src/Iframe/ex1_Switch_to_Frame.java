package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ex1_Switch_to_Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
			
		
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//switch to frame
		
	/*	driver.switchTo().frame("iframeResult");   //frame id
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //frame web element 
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me ')]")).click(); //click on button
	*/
		driver.switchTo().frame("iframewrapper");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
	
	}
	
	

}
