package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//input[@id='user-name']")private WebElement UserID;
	@FindBy(xpath = "//input[@id='password']")private WebElement Pass;
	@FindBy(xpath = "//input[@id='login-button']")private WebElement Clicklogin;

	
	public Login(WebDriver driver) 
	       {
		
	PageFactory.initElements(driver, this);
			}
	public void set_userid(String UID) 
	{
		
		UserID.sendKeys(UID);
		
	}
	
	public void set_pass(String PAS) {
		Pass.sendKeys(PAS);
		
	}
	public void Click_Login() {

		Clicklogin.click();
	}
}
