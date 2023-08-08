package Practice_Imp_code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_all_links_webpage2 {
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi Note 10");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	System.out.println(alllinks.size());
	
	for(WebElement s1:alllinks)
	{
		System.out.println(s1.getText());
	}
	Thread.sleep(2000);
	driver.close();

	}
	

}
