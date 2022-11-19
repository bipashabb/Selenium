package practiceclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		

		 driver= new ChromeDriver(); 
		 
	 
		 driver.get("https://www.amazon.com");
		 
		 Thread.sleep(5000);
		 
		 // hello sign
		 WebElement hellosign = driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
		 
		 WebElement membership = driver.findElement(By.xpath("//span[contains(text(),'Memberships & Subscriptions')]"));
		 
		 Actions act = new Actions(driver); 
		 
		 act.moveToElement(hellosign).build().perform();
		 Thread.sleep(2000);
		 
		 act.moveToElement(membership).click().build().perform();
		 
		 
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
