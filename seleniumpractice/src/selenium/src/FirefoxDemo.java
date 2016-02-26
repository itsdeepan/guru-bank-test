package selenium.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		String baseUrl;
		
		driver = new FirefoxDriver();
		baseUrl = "http://mail.yahoo.com";
		driver.get(baseUrl);
		

	}

}
