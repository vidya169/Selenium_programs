package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_SelectOptionUsing_Endkey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		Thread.sleep(2000);
		
		//navigate to last option using end key
		
		act.sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		//navigate to aug option
		for(int i=1;i<=4;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		Thread.sleep(2000);
		//select aug option using enter key
		
		act.sendKeys(Keys.ENTER).perform();
		
	

}
}
