package Handling_Of_AutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
			
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	/*	
	Thread.sleep(2000);
	String expText = "redmi note 10";
	
	List<WebElement> alloptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));//inspect all page
	
	for(WebElement s1:alloptions)
	{
		String actText = s1.getText();
		if(actText.equals(expText))
		{
			s1.click();
			break;
		}
	} */
		String exp = "Redmi Note 11";
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		
		for(WebElement s1:alllinks)
		{
			String actText = s1.getText();
			if(actText.equals(exp))
			{
				s1.click();
				break;
			}
		}
	
	
	
	
	}
}

