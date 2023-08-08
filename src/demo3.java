import org.testng.annotations.DataProvider;

public class demo3 {
	@DataProvider(name="logininfo")
	public Object[][] getData()
	{
		Object [][] data= {{121,"vidya","chavan"},{234,"rajat","date"},{275,"snehal","mane"}};
		return data;
	}

}
