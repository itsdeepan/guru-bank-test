package selenium.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lib.ExcelDataConfig;



public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		ExcelDataConfig excel = new ExcelDataConfig("/Users/itsdeepan/Documents/Selenium/Selenium WebDriver/workspace/Guru99Bank/testData.xlsx");
		
		int rowCount = excel.getRowCount(0);
		
		for(int i=0;i<=rowCount;i++){
		String data1 = excel.readExcelData(0, i, 0);
		String data2 = excel.readExcelData(0, i, 1);
		
		//System.out.println(rowCount);
		System.out.print(data1+" ");
		System.out.println(data2);
		}
		
		
	}

}
