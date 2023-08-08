package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 {
	
	
	@FindBy(xpath = "//input[@id='pin']")private WebElement upin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement confbtn;
	
	
public  kitelogin2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setkitelogin2pin(String pin)
{
	upin.sendKeys(pin);
}
public void setkitelogin2confirm()
{
	confbtn.click();
}







}
