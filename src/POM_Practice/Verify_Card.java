package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_Card {
	@FindBy(xpath = "(//div[@class='inventory_item_name'])[2]")private WebElement clickoncart;


public Verify_Card(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}
public String Verify_Add_to_Card()
{
	String Actresult=clickoncart.getText();
	return Actresult;
	
}

}




