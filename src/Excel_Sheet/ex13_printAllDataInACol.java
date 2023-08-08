package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex13_printAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\12Th MarchA Selenum soft\\12 March A.xlsx");						
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
			
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex; i++) 
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
			CellType s1 = cellInfo.getCellType();

			if(s1==CellType.STRING) 
			{
				System.out.println(cellInfo.getStringCellValue());
			}
			else if (s1==CellType.NUMERIC)
			{
				System.out.println(cellInfo.getNumericCellValue());
			}
			else if (s1==CellType.BOOLEAN) 
			{
				System.out.println(cellInfo.getBooleanCellValue());
			}
		
		}
			
	}

}
