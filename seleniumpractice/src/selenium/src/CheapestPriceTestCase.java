package selenium.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheapestPriceTestCase {
	
	public static void main(String[] args) {
		
		String[] tCity = {"JFK"};
		String fCity = "SFO";
		String lDate = "03/01/2016";
		String rDate = "03/01/2016";
		double cheapestPrice = 0.0;
		String cheapCity = null;
		
		for(int i=0; i < tCity.length; i++ ){
			try{
			double price = findCheapestFlight(fCity,tCity[i],lDate,rDate);
			
			System.out.println("Price for "+ fCity +" to " + tCity[i] + " is $"+ price);
			
			if( cheapestPrice > price || cheapestPrice == 0.0){
				cheapestPrice = price;
				cheapCity = tCity[i];
			}
			}catch(Exception e){
				System.out.println(e);
			}
			
		}
		
		System.out.println("Cheapest price is $"+cheapestPrice+", from "+ fCity +" to "+ cheapCity);
		
		
	}
	
	static double findCheapestFlight(String fromCity, String toCity, String leaveDate, String returnDate) throws Exception{
		
		
		WebDriver wd = new FirefoxDriver();
		String url = "http://www.orbitz.com";
		String cPrice = null;
		double price = 0.0;
		
		wd.manage().window().maximize();
		wd.get(url);
		
		wd.findElement(By.id("search.type.air")).click();
		Thread.sleep(2000);
		
		wd.findElement(By.name("ar.rt.leaveSlice.orig.key")).sendKeys(fromCity);
		wd.findElement(By.name("ar.rt.leaveSlice.dest.key")).sendKeys(toCity);
		wd.findElement(By.name("ar.rt.leaveSlice.date")).sendKeys(leaveDate);
		wd.findElement(By.name("ar.rt.returnSlice.date")).sendKeys(returnDate);
		wd.findElement(By.name("search")).click();
		
		Thread.sleep(10000);
		System.out.println("Price *********************");
		//cPrice = wd.findElement(By.xpath(".//*[@id='flight-module-2016-03-01t06:00:00-08:00-coach-sfo-atl-dl-913-coach-atl-jax-dl-1416-coach-jax-jfk-dl-6273_2016-03-08t11:00:00-05:00-coach-jfk-sfo-b6-615_']/div/div/div[2]/div/div/div[1]/span[3]")).getText();
		cPrice="$430.20";
		price = Double.parseDouble(cPrice.replace("$",""));
		
		wd.close();
		return price;
		
		
		
	}
}
