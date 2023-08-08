package Cross_Browser_Testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex1 {
	
		@Parameters("browserName")
		@Test
		public void TC(String browserName) throws InterruptedException 
		{
			WebDriver driver=null;
					
			if(browserName.equals("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

				driver=new ChromeDriver();
			}
			else if (browserName.equals("FireFox"))
			{
				
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\geckodriver-v0.31.0-win32\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7066650010");
			driver.findElement(By.xpath("//button[text()='Login ']")).click();
			
			driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");
			driver.findElement(By.xpath("//button[text()='Continue ']")).click();
			
			String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			String expUserID = "VS6640";
			
			if (actUserID.equals(expUserID))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
					
			Thread.sleep(3000);
			
			driver.quit();
			
			
			
		}
		
			
	}


