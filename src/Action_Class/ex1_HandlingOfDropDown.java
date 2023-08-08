package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_HandlingOfDropDown {
/*	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
			
			
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//click on close button
			Thread.sleep(2000);
		
			//step 1
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		   //step 2
		Actions act = new Actions(driver);
		   //step 3
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		//click on gift card from dropdown element
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	} */
	public static void main(String[] args) throws InterruptedException
	{
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		
	    ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
			
	}

}


		
		
		
				
		
	