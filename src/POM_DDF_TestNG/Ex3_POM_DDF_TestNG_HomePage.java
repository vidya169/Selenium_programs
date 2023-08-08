package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex3_POM_DDF_TestNG_HomePage 
{
	@FindBy(xpath="//span[@class='user-id']")private WebElement VerifyUserId;
	
	public Ex3_POM_DDF_TestNG_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String Set_Kite_verifyUserID()
	{
		String ActUserId = VerifyUserId.getText();
		return ActUserId; 
	}
	

}