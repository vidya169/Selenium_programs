package Practice_Imp_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_DDF_Login1 {

	@FindBy(xpath="//input[@id=\"email\"]")private WebElement UN;
	@FindBy(xpath="//input[@id=\"pass\"]")private WebElement PASS;
	@FindBy(xpath="//button[@id=\"u_0_e_C4\"]")private WebElement login;
	
	public POM_DDF_Login1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserName(String U_N)
	{
		UN.sendKeys(U_N);
	}
	public void Password(String pass)
	{
		PASS.sendKeys(pass);
	}
	public void loginpage()
	{
		login.click();
	}
}
