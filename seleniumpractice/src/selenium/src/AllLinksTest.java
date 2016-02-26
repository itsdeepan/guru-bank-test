package selenium.src;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://newtours.demoaut.com/";
		String underConsTitle = "Under Construction: Mercury Tours";
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		String[] s = new String[linkElements.size()];
		int i = 0;
		
		for(WebElement link : linkElements){
			
			s[i] = link.getText();
			i++;
			
		}
		for(String linkText: s){
			
			driver.findElement(By.linkText(linkText)).click();
			if(driver.getTitle().equals(underConsTitle)){
				System.out.println("\""+linkText+"\""+" is under construction.");
			}else{
				System.out.println("\""+linkText+"\""+" is working.");
			}
			driver.navigate().back();	
			
		}
		
		driver.close();
	}

}
