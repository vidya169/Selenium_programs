package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex8_PrintAllData_in_a_col {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(value);
		}
		
	}

}
