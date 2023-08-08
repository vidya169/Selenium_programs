package Iframe;
/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_Switch_to_MainPage_From_Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		
		driver.switchTo().frame("iframeResult");//string frame id
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click(); //click on button
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();  //back to main page
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();  //click on home icon
		
		 
		
		
		
	}

}*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_Switch_to_MainPage_From_Frame {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@id=\"tryhome\"]")).click();
	}
}
