package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex3_POM_DDF_TestNG_LogoutPage
{
	@FindBy(xpath="//div[@class='avatar']")private WebElement ClickONUSer;
	@FindBy(xpath="//a[@target='_self']")private WebElement Logout;

	public Ex3_POM_DDF_TestNG_LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_KiteLogout_ClickOnUser()
	{
		ClickONUSer.click();
	}
	public void Set_KiteLogout_clickonLogOut()
	{
		Logout.click();
	}
}




