package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_DeselectedOpions_from_Multiselectablelistbox1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/DW-0820/Desktop/htmlfiles/listbox.html");
		
		WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));  //step 1
		
		Select s = new Select(selectcountry);   //step2
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		Thread.sleep(3000);
		
		s.deselectByVisibleText("Ind");
		s.deselectByIndex(2);
		s.deselectByValue("");
		

}
}

