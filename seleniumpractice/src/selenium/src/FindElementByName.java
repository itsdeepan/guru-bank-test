package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByName {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		String url = "https://www.enterprise.co.uk/en/car-hire/locations/uk/belfast.html";
		
		driver.manage().window().maximize();
		driver.get(url);
		
		/*driver.findElement(By.id("lst-ib")).sendKeys("car rental");
		driver.findElement(By.name("btnG")).click();*/
		
		//driver.findElement(By.linkText("Belfast Car Hire")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.partialLinkText("Career")).click();
		driver.findElement(By.xpath(".//*[@id='footer-nav']/div/div[3]/div/ul[3]/li[6]/a")).click();
		
	}

}
