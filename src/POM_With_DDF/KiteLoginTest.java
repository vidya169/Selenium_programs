package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		//disable notification
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(option);
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.get("https://kite.zerodha.com/");
        
        KiteLogin1Page login1= new  KiteLogin1Page(driver);
        login1.setKiteLogin1Pageusername(sh.getRow(0).getCell(0).getStringCellValue());
        login1.setKiteLogin1Pagepassword(sh.getRow(0).getCell(1).getStringCellValue());
        login1.setKiteLogin1Login();
        
        KiteLogin2Page login2= new  KiteLogin2Page(driver);
        login2.setKiteLogin2Pagepin(sh.getRow(0).getCell(2).getStringCellValue());
        login2.setKiteLogin2Pagecontinuebutton();
        
        KiteHomePage home= new KiteHomePage(driver);
        home.setverifyuserid(sh.getRow(0).getCell(3).getStringCellValue());
        
        
        Thread.sleep(2000);
        driver.close();

	}

}
