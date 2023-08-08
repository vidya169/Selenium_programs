package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Ex3_POM_DDF_TestNGLoginPage1 
{
	@FindBy(xpath="//input[@id='userid']")private WebElement UserID;
	@FindBy(xpath="//input[@id='password']")private WebElement Pass;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ClickOnLogin;

	public Ex3_POM_DDF_TestNGLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Set_KiteLoginUserId(String UID)
	{
		UserID.sendKeys(UID);
	}

	public void Set_KiteLoginPassword(String PWD) 
	{
		Pass.sendKeys(PWD);
	}
	public void Set_KiteLoginClickOnLogin()
	{
		ClickOnLogin.click();
	}
	
	
}








