package Guru99Bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class Guru99BankTest {

	WebDriver driver;
	int i=0;

	@Test(dataProvider="Guru99Bank")
	public void loginToGuruBank(String userName, String password){

		
		String actualTitle = "";
		String actualBoxtitle = "";
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(Util.BASE_URL);

		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();

		/* Determine Pass Fail Status of the Script
		 * If login credentials are correct,  Alert(Pop up) is NOT present. An Exception is thrown and code in catch block is executed	
		 * If login credentials are invalid, Alert is present. Code in try block is executed 	    
		 */

		try{ 

			Alert alt = driver.switchTo().alert();
			actualBoxtitle = alt.getText(); // get content of the Alter Message
			alt.accept();
			if (actualBoxtitle.contains(Util.EXPECT_ERROR)) { // Compare Error Text with Expected Error Value
				System.out.println("Test case SS["+i+"]: Passed"); 
			} else {
				System.out.println("Test case SS["+i+"]: Failed");
			}
		}    
		catch (NoAlertPresentException Ex){ 
			actualTitle = driver.getTitle();
			// On Successful login compare Actual Page Title with Expected Title
			if (actualTitle.contains(Util.EXPECT_TITLE)) {
				System.out.println("Test case SS["+i+"]: Passed");
			} else {
				System.out.println("Test case SS["+i+"]: Failed");
			}
		} 
	}

	@AfterMethod
	public void tearDown(){
		i++;
		driver.quit();
	}

	@DataProvider(name="Guru99Bank")
	public Object[][] passData(){
		
		ExcelDataConfig config = new ExcelDataConfig(Util.EXCEL_FILE_PATH);
		
		int rowCount = config.getRowCount(Util.SHEET_NO);
		
		
		Object[][] data = new Object[rowCount][2];
		
		for(int i=0;i<rowCount;i++){
			
			data[i][0] = config.readExcelData(0, i, 0);
			data[i][1] = config.readExcelData(0, i, 1);
		}

		

		return data;
	}

}
