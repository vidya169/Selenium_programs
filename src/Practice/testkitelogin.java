package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testkitelogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
	System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	
	kitelogin1 login1=new kitelogin1(driver);
	login1.setkitelogin1userid(sh.getRow(0).getCell(0).getStringCellValue());
	login1.setkitelogin1userpass(sh.getRow(0).getCell(1).getStringCellValue());
	login1.setkitelogin1login();
	
	kitelogin2 login2=new kitelogin2(driver);
	login2.setkitelogin2pin(sh.getRow(0).getCell(2).getStringCellValue());
	login2.setkitelogin2confirm();
	
	kitehome login3=new kitehome(driver);
	login3.setkitehomeuserid(sh.getRow(0).getCell(3).getStringCellValue());

}
}