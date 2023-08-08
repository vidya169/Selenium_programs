package Practice_Imp_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class List_box_birthdate {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		/*
		driver.findElement(By.xpath("//input[@id='u_2_b_2C']")).sendKeys("vidya");
		driver.findElement(By.xpath("//input[@id='u_2_d_Zc']")).sendKeys("chavan");
		driver.findElement(By.xpath("//input[@id='u_2_g_7r']")).sendKeys("9764849036");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Vidya@123");
		*/
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		
		
		Select s=new Select(day);
		s.selectByValue("16");
		
		Select s2=new Select(month);
		s2.selectByIndex(5);
		
		Select s3=new Select(year);
		s3.selectByVisibleText("1998");
		
		String text=s.getFirstSelectedOption().getText();
		String text1=s2.getFirstSelectedOption().getText();
		String text2=s3.getFirstSelectedOption().getText();
		
		System.out.println("date of birth- "+text+"/"+text1+"/"+text2);
		
		
				
	}

}
