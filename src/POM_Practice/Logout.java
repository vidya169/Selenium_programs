package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(xpath = "(//img[@class='inventory_item_img'])[4]")private WebElement clickimg;
	@FindBy(xpath = "//button[@class='inventory_details_back_button']")private WebElement clickback;


public Logout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Clickoimg()
{
	clickimg.click();
}
public void clickoback()
{
	clickback.click();
}
}
	

