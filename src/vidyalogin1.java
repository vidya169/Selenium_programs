import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vidyalogin1 {
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")private WebElement UN;
	@FindBy(xpath = "//input[@type='password']")private WebElement pass;
	@FindBy(xpath = "(//button[@type='submit'])[2]")private WebElement login;
	
	public void vidyalogin1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);

}
	public void username()
	{
		UN.sendKeys("vidya");
	}
	public void password()
	{
		pass.sendKeys("1234");
	}
	public void login()
	{
		login.click();
	}
}

