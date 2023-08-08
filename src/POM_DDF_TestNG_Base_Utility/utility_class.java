package POM_DDF_TestNG_Base_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility_class {
	

	public static String GetData(int rowindex,int cellindex) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
    return value;
}
}
