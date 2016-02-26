package selenium.src.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTestMain {

	public static void main(String[] args) {
		
		WebDriver wd = new FirefoxDriver();
		String url = "http://www.amazon.co.uk";
		
		AmazonBooksPageTestCase booksTest = new AmazonBooksPageTestCase(wd,url);
		booksTest.BooksPage();
		
		
		
	}

}
