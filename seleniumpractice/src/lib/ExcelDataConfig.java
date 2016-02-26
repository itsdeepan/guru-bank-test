package lib;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelFilePath){
		
		File src = new File(excelFilePath);
		try {
			fis = new FileInputStream(src);
			workbook = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public String readExcelData(int sheetNo,int rowNo,int colNo){
		String data;
		sheet1 = workbook.getSheetAt(sheetNo);
		data = sheet1.getRow(rowNo).getCell(colNo).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetNo){
		sheet1 = workbook.getSheetAt(sheetNo);
		int rowCount = sheet1.getLastRowNum();
		return rowCount+1;
	}

}
