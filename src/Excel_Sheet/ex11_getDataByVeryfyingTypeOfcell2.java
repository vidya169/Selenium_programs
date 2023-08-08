package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_getDataByVeryfyingTypeOfcell2  
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {			
	FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");

    Cell cellinfo= sh.getRow(0).getCell(5);
    CellType v2 = cellinfo.getCellType();
    
    if(v2==CellType.STRING)
    {
    	String value = cellinfo.getStringCellValue();
    	System.out.println(value);
    }
    else if(v2==CellType.NUMERIC)
    {
    	double value = cellinfo.getNumericCellValue();
    	System.out.println(value);
    }
    else if(v2==CellType.BOOLEAN)
    {
    	boolean value = cellinfo.getBooleanCellValue();
    	System.out.println(value);
    	
    }

	


}
}
