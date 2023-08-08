package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7066650010");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String actuserid = driver.findElement(By.xpath("//span[text()='VS6640']")).getText();
	String expuserid = "VS6640";
	
	if(actuserid.equals(expuserid))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	Thread.sleep(2000);
	driver.close();
	
	
	
	
	
}

}
