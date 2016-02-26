package selenium.src;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class QuitBrowser {
 
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
 
        driver.get("http://www.popuptest.com/popuptest2.html");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();  // using QUIT all windows will close
        
    }
}