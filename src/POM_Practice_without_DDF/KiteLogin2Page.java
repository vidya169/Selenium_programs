package POM_Practice_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {
	
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']") private WebElement cntbtn;
	
	public KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void setKiteLogin2Pagepin()
	{
		pin.sendKeys("706665");
	}
	public void setKiteLogin2Pagecontinuebutton()
	{
		cntbtn.click();
	}
	
	

}
