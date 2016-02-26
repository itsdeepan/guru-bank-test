package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByCss {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "http://littlelife.com";
		
		driver.manage().window().maximize();
		driver.get(url);
		
		//driver.findElement(By.cssSelector("#keywords-one")).sendKeys("daysack");
		//driver.findElement(By.cssSelector("[id=keywords-one]")).sendKeys("daysack");
		driver.findElement(By.cssSelector("input[id=keywords-one]")).sendKeys("daysack");
		driver.findElement(By.cssSelector("button.search-form-button#activate-search-header")).click();
		driver.findElement(By.xpath(".//*[@id='product-545']/p/span/a")).click();
	}

}
