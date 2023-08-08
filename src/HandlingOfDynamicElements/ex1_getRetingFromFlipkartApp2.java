package HandlingOfDynamicElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getRetingFromFlipkartApp2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.manage().window().maximize();
				
				driver.get("https://www.flipkart.com/");
			
				//click on close btn
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				
				//search mob
				driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi 9 power");
				
				
				//click on search icon
				driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
				
				
				//get rating
				String rating = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
				System.out.println(rating);
				
			}

		}



