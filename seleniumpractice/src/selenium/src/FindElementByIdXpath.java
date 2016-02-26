package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByIdXpath {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("http://google.co.uk");
		driver.manage().window().maximize();

		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath(".//*[@id='sblsbb']/button")).click();
		
	}

}
