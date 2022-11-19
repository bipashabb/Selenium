package Practicefromslides;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowswitch {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		
		Ibrowser("chrome");
		driver.get("https:www.amazon.com");
		
		WebElement deals= driver.findElement(By.linkText("Today's Deals")); 
		Actions act= new Actions(driver); 
		Thread.sleep(4000);
		
		act.keyDown(Keys.SHIFT).build().perform(); 
		deals.click(); 
		act.keyUp(Keys.SHIFT).build().perform(); 
		Thread.sleep(4000);
		
		Set<String> SessionId= driver.getWindowHandles(); 
		Iterator<String> it1= SessionId.iterator(); 
		
		String parentwindow= it1.next(); 
		String childwindow= it1.next(); 
		System.out.println(parentwindow);
		System.out.println(childwindow);
		
		
		driver.switchTo().window(childwindow); 
		WebElement coupons = driver.findElement(By.xpath("//span[contains(text(),'Coupons')]")); 
		coupons.click();
		driver.switchTo().window(parentwindow); 
		
		
		
		
		  

	}
	
	
	
	public static void Ibrowser (String Name_of_Browser) throws InterruptedException {
		if (Name_of_Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

			driver= new ChromeDriver(); 
			
		}
		else if (Name_of_Browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\msedgedriver.exe"); 
			driver= new EdgeDriver();
			
		
		}
		
		
	}


}
