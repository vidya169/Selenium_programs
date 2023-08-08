package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5_getFirstSelectedOption_from_MultiselectableListbox2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/listbox.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s = new Select (selectCountry);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		//WebElement firstSelecteOption = s.getFirstSelectedOption();
		
		//String text = firstSelecteOption.getText();
		
		//System.out.println(text);
		
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	//	System.out.println(s.getFirstSelectedOption().getText());
		
		driver.close();
		
		
}
}
