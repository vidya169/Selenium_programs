package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/login?");
		
	/*	driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close(); */
		
		
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("9764849036");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
		
		
		

}
}
