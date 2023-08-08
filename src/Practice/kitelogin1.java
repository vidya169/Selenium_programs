package Practice;

import org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi.sha256WithSM2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1 {
   @FindBy(xpath = "//input[@id='userid']")private WebElement UN;
	@FindBy(xpath = "//input[@id='password']")private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbtn;
	
	public kitelogin1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setkitelogin1userid(String username)
	{
		UN.sendKeys(username);
	}
	public void  setkitelogin1userpass(String password)
	{
		pass.sendKeys(password);
	}
	public void setkitelogin1login()
	{
		loginbtn.click();
	}

}
