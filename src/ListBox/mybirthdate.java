package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import HandlingOfCustomizedListbox.selectOptionUsing_HomeKey;

public class mybirthdate {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	
	
	WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");
/*
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Create new account']")).click();

 WebElement s1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
  WebElement s2 = driver.findElement(By.xpath("//select[@id='month']"));
    WebElement s3 = driver.findElement(By.xpath("//select[@id='year']"));
    
    Thread.sleep(2000);
    
Select bdate=new Select(s1);
bdate.selectByValue("16");

Select dmonth=new Select(s2);
dmonth.deselectByIndex(6);

Select byear=new Select(s3);
byear.selectByVisibleText("1998");

String text = bdate.getFirstSelectedOption().getText();
String text2 = dmonth.getFirstSelectedOption().getText();
String text3 = byear.getFirstSelectedOption().getText();

System.out.println("date of birth=" +text+"/"+text2+"/"+text3);

*/

driver.findElement(By.xpath("//a[text()='Create new account']")).click();
Thread.sleep(2000);


WebElement s1 = driver.findElement(By.xpath("//select[@id='day']"));
WebElement s2 = driver.findElement(By.xpath("//select[@id='month']"));
WebElement s3 = driver.findElement(By.xpath("//select[@id='year']"));

Select day=new Select(s1);
day.selectByValue("16");

Select month=new Select(s2);
month.selectByIndex(6);

Select year=new Select(s3);
year.selectByVisibleText("1998");;

String text = day.getFirstSelectedOption().getText();
String text2 = month.getFirstSelectedOption().getText();
String text3 = year.getFirstSelectedOption().getText();


System.out.println("date of birth: "+text+"/"+text2+"/"+text3);

























}
}