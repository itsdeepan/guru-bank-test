package selenium.src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		String baseUrl;
		
		System.setProperty("webdriver.chrome.driver","/Users/itsdeepan/Java/workspace/seleniumpractice/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "http://mail.yahoo.com";
		
		driver.get(baseUrl);

	}

}
