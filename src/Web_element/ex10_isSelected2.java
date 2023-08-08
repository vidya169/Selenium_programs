package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_isSelected2 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	

	driver.get("https://www.facebook.com/");
	//click on create new acc link
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			Thread.sleep(2000);		
			
			

 WebElement femaleRadioBtn = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
			
			boolean result1 = femaleRadioBtn.isSelected();
			 
			if(result1==true)
			{
				System.out.println("radio button already selected");
			}
			else 
			{
				Thread.sleep(3000);
							
				femaleRadioBtn.click(); 
				//click on radio btn
				
				boolean result2 = femaleRadioBtn.isSelected();
				
				if(result2==true) 
				{
					System.out.println("radio button selected");
				} 
				else 
				{
					System.out.println("radio button de-selected");
				}			
			}
				
		}


}
