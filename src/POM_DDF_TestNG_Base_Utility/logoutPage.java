package POM_DDF_TestNG_Base_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement clckuid;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logout;
	
	
	
	public logoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickuser()
	{
		clckuid.click();
	}
	public void logoutt() 
	{
	
		logout.click();
	}
}
