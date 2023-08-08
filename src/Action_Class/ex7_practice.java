package Action_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ex7_practice {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(options);
//driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.get("http://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();

WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));


Actions act=new Actions(driver);
act.dragAndDrop(src, dest).perform();
//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();








/*
WebElement abc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
Actions act=new Actions(driver);
act.doubleClick(abc).perform(); */



/*
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));

Actions act=new Actions(driver);
act.moveToElement(login).perform();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();

Thread.sleep(2000);

WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
act.moveToElement(more).perform();
 WebElement abc = driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
 act.contextClick().perform();  */




	}

}
