package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome","C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("");
	
	driver.manage().window().maximize();
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("");
	
	FileHandler.copy(src, dest);
	
}
}
