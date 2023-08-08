package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.examples.hssf.usermodel.CellTypes;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practice {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastcellindex = sh.getRow(1).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellindex;i++)
		{
		
		Cell cellinfo = sh.getRow(1).getCell(i);
		CellType s1 = cellinfo.getCellType();
		
		
		if(s1==CellType.STRING)
		{
			String value1 = cellinfo.getStringCellValue();
			System.out.println(value1);
		}
		else if(s1==CellType.NUMERIC)
		{
			double value2 = cellinfo.getNumericCellValue();
			System.out.println(value2);
		}
		else if(s1==CellType.BOOLEAN) {
		boolean	value3=cellinfo.getBooleanCellValue();
		System.out.println(value3);
	}

}
}
}
