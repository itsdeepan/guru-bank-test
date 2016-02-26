package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrbitzHotelTestCase {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String url;
		
		driver = new FirefoxDriver();
		url = "http://www.orbitz.com";
		
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("search.type.hotel")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.name("hotel.keyword.key")).sendKeys("Boston, MA, United States");
		driver.findElement(By.name("hotel.chkin")).sendKeys("03/01/2016");
		driver.findElement(By.name("hotel.chkout")).sendKeys("03/02/2016");
		driver.findElement(By.name("hotel.hname")).sendKeys("westin");
		driver.findElement(By.name("search")).click();
		Thread.sleep(10000);
		String str = driver.findElement(By.xpath("html/body/div[3]/form/div[2]/div/div[1]/div[2]/div[2]/a/span[1]")).getText();
		
		System.out.println(str);
		

	}

}
