package Practicefromslides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https:www.amazon.com");
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		Thread.sleep(2000);
		
		
		WebElement signin= driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
		Actions act= new Actions(driver); 
		act.moveToElement(signin).build().perform();
		
		WebElement prime= driver.findElement(By.xpath("//*[text()='Memberships & Subscriptions']")); 
		
		act.moveToElement(prime).click().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
