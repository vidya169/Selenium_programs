package Excel_Sheet;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ex11_getDataByVeryfyingTypeOfcell 
	{
	/*	public static void main(String[] args) throws EncryptedDocumentException, IOException
		{
			
			FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
					
			Cell cellInfo = sh.getRow(0).getCell(6);
			
			CellType s1 = cellInfo.getCellType();
					
			if(s1==CellType.STRING) 
			{
				String value = cellInfo.getStringCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.NUMERIC) 
			{
				double value = cellInfo.getNumericCellValue();
				System.out.println(value);
			}
			else if (s1==CellType.BOOLEAN)
			{
				boolean value = cellInfo.getBooleanCellValue();
				System.out.println(value);
			}
			
			
		}  */
		public static void main(String[] args) throws IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
			Cell cellinfo = sh.getRow(1).getCell(2);
			 CellType s1 = cellinfo.getCellType();
			 
			 if(s1==CellType.STRING)
			 {
				 String value = cellinfo.getStringCellValue();
				 System.out.println(value);
				 
	     	}
			 else if(s1==CellType.NUMERIC)
			 {
				 double value1 = cellinfo.getNumericCellValue();
				 System.out.println(value1);
			 }
			 
			 else if(s1==CellType.BOOLEAN)
			 {
				 boolean value2 = cellinfo.getBooleanCellValue();
				 System.out.println(value2);
			 }
		}
}
