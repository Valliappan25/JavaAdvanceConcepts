package automation.JavaAdvancedConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	public static FileInputStream stream;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String location = "Files/data.xls";
		String[][] dataTable = null;

		try {
			 stream = new FileInputStream(location);
			 HSSFWorkbook workbook = new HSSFWorkbook(stream);
			 HSSFSheet sheet = workbook.getSheetAt(0);
			 int rows = sheet.getLastRowNum()+1;
			 int columns = sheet.getRow(0).getLastCellNum();
			 
			 dataTable = new String [rows][columns];
			 
			 for (int i=1; i<rows;i++)
			 {
				 HSSFRow xlRow = sheet.getRow(i);
				 for(int j=0;j<columns;j++)
				 {
					 HSSFCell xlCell = xlRow.getCell(j);
					 dataTable[i][j] = xlCell.toString();
					 System.out.print(dataTable[i][j]+"\t");
				 }
				 System.out.println();
			 }
			 
			
						
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
