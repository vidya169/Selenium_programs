package Practice_Imp_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_DDF_Logout {

	@FindBy(xpath="(//span[contains(@class,'x4k7w5x ')])[5]")private WebElement user;
	@FindBy(xpath="//span[text()='Log out']")private WebElement logout;
	
	public POM_DDF_Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click_user()
	{
		user.click();
	}
	public void log_out()
	{
		logout.click();
	}
}
