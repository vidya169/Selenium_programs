package Practice_Imp_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Action_drag_drop {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	Actions act=new Actions(driver);
	//act.dragAndDrop(src, dest).perform();
	act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	
	
	}

}
