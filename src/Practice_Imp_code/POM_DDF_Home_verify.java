package Practice_Imp_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_DDF_Home_verify {

	@FindBy(xpath=("//span[text()='Welcome to Facebook, Vidya']"))private WebElement Verify;
	
	public POM_DDF_Home_verify(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public String verifytext()
	{
		String Act=Verify.getText();
		return Act;
	}
}
