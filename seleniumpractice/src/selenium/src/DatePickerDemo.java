package selenium.src;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("txtOnwardCalendar")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]//td"));
		
		for(WebElement d: dates){
			
			String dt = d.getText();
			System.out.println("****"+dt);
			if(dt.equals("14")){
				d.click();
				break;
			}
		}

	}

}
