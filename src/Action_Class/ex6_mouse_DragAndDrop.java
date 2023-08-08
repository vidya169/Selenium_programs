package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex6_mouse_DragAndDrop {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			
			WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));//drag 5000 button
			
			WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));//drop here
			
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest).perform();
			//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
			//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	}

}


