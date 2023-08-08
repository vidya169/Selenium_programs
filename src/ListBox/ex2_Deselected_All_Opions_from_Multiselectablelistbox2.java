package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_Deselected_All_Opions_from_Multiselectablelistbox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/DW-0820/Desktop/htmlfiles/listbox.html");
		
		 
		WebElement selectountry= driver.findElement(By.xpath("//select[@id='1234']"));  //first step
		
		Select s = new Select(selectountry);  //step 2
		
		//step 3
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s.deselectAll();
		
		
		
		

}
}
