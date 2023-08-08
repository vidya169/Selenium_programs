package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_Alert_popup2 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");  //get url
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123");//enter username
			
			driver.findElement(By.xpath("//input[@name='submit']")).click(); //click ubmit button
			
			Thread.sleep(2000);
			
			Alert alt = driver.switchTo().alert();  //swith to alert popup
			
			String text = alt.getText();  //get text from alert popup by creating object
			System.out.println(text);
			
			//alt.dismiss();  //  cilck on cancle button
			
			alt.accept();    //click on o button
			
			alt.accept();   //click on another ok button
			
			
			
	}

}
