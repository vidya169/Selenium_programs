package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	//declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement UNID;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement login;
	
	//initialisation
	
	public KiteLogin1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//uses
	public void setKiteLogin1Pageusername(String UN)
	{
		UNID.sendKeys(UN);
	}
	public void setKiteLogin1Pagepassword(String PWD)
	{
		pass.sendKeys(PWD);
	}
	public void  setKiteLogin1Login()
	{
		login.click();
	}

}
