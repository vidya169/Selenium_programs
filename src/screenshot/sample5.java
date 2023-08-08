package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample5 {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
      Thread.sleep(2000);	
      
     // String ss = RandomString.make(2);
      String ss = RandomString.make(2);
 
     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     
     File dest = new File("C:\\Users\\DW-0820\\Desktop\\screenshottt\\login "+ss+ ".jpg");
     
     
     FileHandler.copy(src, dest);
     
    
 
    
}
}

