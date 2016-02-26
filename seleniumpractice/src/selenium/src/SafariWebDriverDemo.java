package selenium.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariWebDriverDemo {
	public static void main(String[] arg){
		
		WebDriver driver;
		String baseUrl;
		
		driver = new SafariDriver();
		baseUrl = "http://mail.yahoo.com";
		
		driver.get(baseUrl);
	}

}
