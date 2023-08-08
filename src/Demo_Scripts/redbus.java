package Demo_Scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class redbus {
	public static void main(String[] args) throws InterruptedException 
	{		
		ChromeOptions option1=new ChromeOptions();
		option1.addArguments("--disable notifications");
		
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);


		driver.get("https://www.redbus.in/");

		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Shivaji Nagar, Pune");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madiwala, Bangalore");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
	     driver.findElement(By.xpath("//button[@class='fl button']")).click();

		Thread.sleep(2000);
		
		//Actions act=new Actions(driver);
		//act.moveToElement(date).sendKeys("16-Oct-2022");
	
		//sendKeys("16-Oct-2022")
		
	     //driver.findElement(By.xpath("//button[@class='fl button']")).click();
		
		//WebElement month = driver.findElement(By.xpath("(//input[@class='rdc-db'])[1]"));
	    //Select date=new Select(month);
		//date.selectByValue("20");
		
		

}
}