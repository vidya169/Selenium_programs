package Practice_Imp_code;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(login).perform();
	
	Thread.sleep(2000);
	
WebElement	order=driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"));
act.contextClick(order).perform();
	
}
}
