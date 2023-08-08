package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getBooleanData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
	
	
//	Workbook book = WorkbookFactory.create(file);
//	Sheet sh = book.getSheet("Sheet");
//	Row rw = sh.getRow(0);
//	Cell cl = rw.getCell(3);
//	boolean value = cl.getBooleanCellValue();	
//	System.out.println(value);
	
boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();	
System.out.println(value);
	
	
	
	
	
	}

}
