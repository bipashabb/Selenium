package Practiceown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardcontrols {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

		driver= new ChromeDriver(); 
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();
		
		Thread.sleep(2000);
		
		WebElement search_field= driver.findElement(By.id("twotabsearchtextbox")); 
		search_field.click();
		Thread.sleep(2000);
		search_field.sendKeys("computer");
		
		// select all
		
		Actions act= new Actions(driver); 
		
		// select all
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL); 
		
		Thread.sleep(2000);
		
		// copy
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		// delete
		act.keyDown(Keys.DELETE). keyUp(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		// paste
		search_field.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
