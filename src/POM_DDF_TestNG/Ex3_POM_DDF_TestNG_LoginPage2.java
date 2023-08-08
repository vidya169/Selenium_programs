package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Ex3_POM_DDF_TestNG_LoginPage2 
{
	@FindBy(xpath="//input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement ClickOnCTN;
	
	public Ex3_POM_DDF_TestNG_LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Set_KiteLogin_Pin(String PIN)
	{
		Pin.sendKeys(PIN);
	}
	public void Set_KiteLogin_ClickON_CTN()
	{
		ClickOnCTN.click();
	}
}