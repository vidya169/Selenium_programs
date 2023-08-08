package flipcard;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		
		driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Women']")).click();
		driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[14]")).click();
		
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		act.moveToElement(more).perform();
		
		driver.findElement(By.xpath("//div[text()='24x7 Customer Care']")).click();

		

	}
}
