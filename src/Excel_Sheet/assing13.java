package Excel_Sheet;

import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class assing13
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{

			FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
			int lastrowindex = sh.getLastRowNum();
			for(int i=0;i<=lastrowindex;i++)
			{
				int s1 = sh.getRow(i).getLastCellNum()-1;
				for(int j=0;j<=s1;j++)
				{
			
	          Cell s3 = sh.getRow(i).getCell(j);
				
				CellType s4= s3.getCellType();
				
				if(s4==CellType.STRING) 
				{
					
				String value = s3.getStringCellValue();
					System.out.println(s3.getStringCellValue()+" ");
				}
				else if (s4==CellType.NUMERIC)
				{
					
				double value = s3.getNumericCellValue();
					System.out.println(s3.getNumericCellValue()+" ");
				}
				else if (s4==CellType.BOOLEAN) 
				{
					
				boolean value = s3.getBooleanCellValue();
					System.out.println(s3.getBooleanCellValue()+" ");
				}
			}				
		}
		}
	}