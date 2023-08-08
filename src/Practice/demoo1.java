package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demoo1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("VS6640");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("7066650010");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String actid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String expid = "VS6640";
	
	if( actid.equals(expid)) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
	
	}

}
