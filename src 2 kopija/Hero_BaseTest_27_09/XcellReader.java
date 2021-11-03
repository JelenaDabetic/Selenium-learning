package Hero_BaseTest_27_09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcellReader {

	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell; //collumn
		

		public XcellReader(String filePath) throws IOException  {
		super();
		this.file= new File (filePath);
		this.fis= new FileInputStream (file);
		this.wb = new XSSFWorkbook (fis);
	}
	
	    public String getStringData(String sheetName, int rowNumber, int cellNumber) {
	        this.sheet = wb.getSheet(sheetName);
	        this.row = sheet.getRow(rowNumber);
	        this.cell = row.getCell(cellNumber);
	        return this.cell.getStringCellValue();
	    }

	    public int getIntegerData(String sheetName, int rowNumber, int cellNumber) {
	        this.sheet = wb.getSheet(sheetName);
	        this.row = sheet.getRow(rowNumber);
	        this.cell = row.getCell(cellNumber);
	        return (int) this.cell.getNumericCellValue();
	    }

	    public int getLastRowNumber() {
	        return sheet.getLastRowNum();
	    }
	

	

	
}
