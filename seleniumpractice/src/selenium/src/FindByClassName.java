package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) {
		WebDriver driver;
		String url;
		
		driver = new FirefoxDriver();
		url = "https://www.littlelife.com/products/kids-daysacks/classic-3-plus";
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("product-category-kids-daysacks-text")).click();
	}

}
