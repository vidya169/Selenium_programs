package popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_switch_to_main_window_from_child_page {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	
	//click on new tab from main page
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	//get child window id
	Set<String> aallds = driver.getWindowHandles();
	//main page id child window id
	ArrayList<String> al = new ArrayList<String>(aallds);
	//[mainpage id (0) child window id(1)]
	String chiledWindowId = al.get(1);
	
	//switch to child window
	driver.switchTo().window(chiledWindowId);  //string window id
	
	//click on training link from child window
	
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
Thread.sleep(2000);
//switch to main page
driver.switchTo().window(al.get(0));

//click on new window from main pade
driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
}

}
