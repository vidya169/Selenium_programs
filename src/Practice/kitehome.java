package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehome {
	
@FindBy(xpath = "//span[@class='user-id']private")WebElement useridd;


public kitehome (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setkitehomeuserid(String expid)
{
String actid = useridd.getText();
if(actid.equals(expid))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
}
