package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipcard_widowhadles {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
    ChromeOptions option=new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");
    WebDriver driver=new ChromeDriver(option);
    driver.manage().window().maximize();
    
    driver.get("https://www.flipkart.com");
    
    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
    driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
    
    
    Set<String> allids = driver.getWindowHandles();
   ArrayList<String> al=new ArrayList<String>(allids);
   String chiledwindowId = al.get(1);
   driver.switchTo().window(chiledwindowId);
   
   Thread.sleep(1000);
   
   //driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
   //driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
 //  driver.findElement(By.xpath("//div[text()='Popularity']")).click();
   
   
    
}
}
