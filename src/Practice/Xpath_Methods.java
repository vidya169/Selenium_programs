package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chvanvidya123");
		  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("vidya123");
		  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
        Thread.sleep(2000);
		driver.navigate().back();
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(@class,'_42ft _4jy0 ')])[3]")).click();
		
		Thread.sleep(2000);
		WebElement UN = driver.findElement(By.xpath("//input[@name='firstname']"));
		           UN.sendKeys("snehal");
		           Thread.sleep(2000);
		           UN.clear();
		           Thread.sleep(2000);
		           UN.sendKeys("vidya");
		           Thread.sleep(2000);
		           
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("chavan");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[5]")).sendKeys("98765433245");

		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("vidya1234");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 Thread.sleep(2000);
		 
		 String text = driver.findElement(By.xpath("//p[contains(text(),'By clicking Sign Up')]")).getText();
		 System.out.println(text);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		
		

}
}
