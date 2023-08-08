package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5_getColSize_in_row {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		short colsize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();	
	System.out.println(colsize);
	
	
	}
	
	
	
	
	
	
	

}
