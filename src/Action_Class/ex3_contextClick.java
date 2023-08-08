package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ex3_contextClick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();//click on close button
	Thread.sleep(2000);
	
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	Actions act = new Actions(driver);
//	act.moveToElement(login).perform();
	
//	act.contextClick().perform();
	
//	act.moveToElement(login).contextClick().build().perform();
	
//	act.contextClick(login).perform();
	act.moveToElement(login).perform();
	act.contextClick().perform();
	act.moveToElement(login).contextClick().build().perform();
	
	}

}
