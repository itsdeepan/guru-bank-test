package selenium.src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class SwitcingBetweenPopUpWindow {
 
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String alertMessage = "";
 
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.switchTo().alert().accept();
        
        System.out.println(alertMessage);
        driver.quit();
        
    }
}
