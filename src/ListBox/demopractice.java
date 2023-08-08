package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demopractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement s1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement s2 = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement s3 = driver.findElement(By.xpath("//select[@id='year']"));
		


		Select bdate = new Select(s1);
		bdate.selectByValue("16");
		Thread.sleep(2000);
	
		
		Select month = new Select(s2);
		month.selectByIndex(5);
		Thread.sleep(2000);
		
		Select year = new Select(s3);
		year.selectByVisibleText("1998");
		Thread.sleep(2000);
		
		
		String text = bdate.getFirstSelectedOption().getText();
		String text2 = month.getFirstSelectedOption().getText();
		String text3 = year.getFirstSelectedOption().getText();
		
		System.out.println("date of birth = " + text +"/"+ text2 + "/"+ text3);
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
		
		
		
		
		
		
		
}
