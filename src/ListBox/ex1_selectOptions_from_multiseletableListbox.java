package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_selectOptions_from_multiseletableListbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/DW-0820/Desktop/htmlfiles/listbox.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));  //step 1
		
		Select s = new Select(selectcountry);  //step2
		
		s.selectByVisibleText("Sri");   //step 3
		s.selectByIndex(2);
		s.selectByIndex(3);
		
	
	
	
	
	}

}
