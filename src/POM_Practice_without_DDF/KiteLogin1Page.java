package POM_Practice_without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page {
	
	
	//declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath = "//button[text()='Login ']") private WebElement login;
	
	//initialisation
	
	public KiteLogin1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//uses
	public void setKiteLogin1Pageusername()
	{
		UN.sendKeys("VS6640");
	}
	public void setKiteLogin1Pagepassword()
	{
		pass.sendKeys("7066650010");
	}
	public void  setKiteLogin1Login()
	{
		login.click();
}}