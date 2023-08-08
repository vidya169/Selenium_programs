package Excel_Sheet;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ex12_printAllDataInARow 
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{

			FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");		
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
			
			int lastCellIndex = sh.getRow(2).getLastCellNum()-1;
			
			for(int i=0; i<=lastCellIndex; i++)
			{			
				Cell cellInfo = sh.getRow(2).getCell(i);
				
				CellType s1 = cellInfo.getCellType();
				
				if(s1==CellType.STRING) 
				{
					System.out.print(cellInfo.getStringCellValue()+" ");
				}
				else if (s1==CellType.NUMERIC)
				{
					System.out.print(cellInfo.getNumericCellValue()+" ");
				}
				else if (s1==CellType.BOOLEAN) 
				{
					System.out.print(cellInfo.getBooleanCellValue()+" ");
				}
			}				
		}


}
