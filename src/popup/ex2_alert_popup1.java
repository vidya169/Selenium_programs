package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_alert_popup1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");  //get url
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");//enter username
		
		driver.findElement(By.xpath("//input[@name='submit']")).click(); //click ubmit button
		
		Thread.sleep(2000);
		
	String text = driver.switchTo().alert().getText(); //get text from popup window
	System.out.println(text);
	
	//driver.switchTo().alert().dismiss();   //cick on cancle button
	
	driver.switchTo().alert().accept();  //click on ok button
	//Thread.sleep(1000);
	
	driver.switchTo().alert().accept(); //click on another o button
	
	
}

}
