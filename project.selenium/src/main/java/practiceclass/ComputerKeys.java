package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComputerKeys {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

		driver= new ChromeDriver(); 
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		
		//locate search keys
		WebElement Searchfield= driver.findElement(By.id("")); 
		Searchfield.click();
		driver.findElement(By.id("")); 
		Searchfield.sendKeys("computer");
		

		// select all controlA the word
		Actions act = new Actions(driver); 
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL); 
		
		
		// copy the word
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
		Thread.sleep(2000);
		//delete the word
		act.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		
		// click on search bar before paste
		
		// paste the word
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
