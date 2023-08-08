package POM_Practice_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy (xpath = "//span[@class='user-id']") private WebElement userid;
	
	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void setverifyuserid()
	{
		String actUserid = userid.getText();
		String expUserid = "VS6640";
		
		if(actUserid.equals(expUserid))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
