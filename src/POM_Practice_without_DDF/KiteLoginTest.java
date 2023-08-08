package POM_Practice_without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://kite.zerodha.com/");
        
        KiteLogin1Page login1= new  KiteLogin1Page(driver);
        login1.setKiteLogin1Pageusername();
        login1.setKiteLogin1Pagepassword();
        login1.setKiteLogin1Login();
        
        KiteLogin2Page login2= new  KiteLogin2Page(driver);
        login2.setKiteLogin2Pagepin();
        login2.setKiteLogin2Pagecontinuebutton();
        
        KiteHomePage home= new KiteHomePage(driver);
        home.setverifyuserid();
        
        
        Thread.sleep(2000);
        driver.close();

	}

}
