package selenium.src.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

class AmazonBooksPageTestCase {
	WebDriver driver;
	String baseUrl;
	String books;
	// driver.manage().window().maximize();

	public AmazonBooksPageTestCase(WebDriver wd, String url) {
		driver = wd;
		baseUrl = url;
		
	}

	void BooksPage() {
		
		driver.get(baseUrl);

		// mouse hover selection
		Actions action = new Actions(driver);

	//	WebElement link1 = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]"));
	//	action.moveToElement(link1);
		
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")));

		WebElement subLink1 = driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"));
		action.moveToElement(subLink1);

		WebElement subLink2 = driver
				.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/a[1]/span"));
		action.moveToElement(subLink2);

		action.click();
		action.perform();

		books = driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[1]/span")).getText();

		if (books.equals("Books"))
			System.out.println(books + " page. ***Passed***");
		else
			System.out.println("Visited the wrong page. ***Failed***");
	}
}
