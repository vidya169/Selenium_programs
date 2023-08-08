package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_AddtoCard {
	@FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[1]")private WebElement ClicktoAdd;
	
	public Home_AddtoCard (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Click_Add_to_card()
	{
	ClicktoAdd.click();	
	}

}
