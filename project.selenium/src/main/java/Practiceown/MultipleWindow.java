package Practiceown;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindow {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome", "https:www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		WebElement newacc= driver.findElement(By.linkText("Create a Page")); 
		Actions act= new Actions(driver); 
		act.keyDown(Keys.SHIFT).build().perform();
		Thread.sleep(3000);
		newacc.click();
		act.keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(4000);
		Set <String> sessionid= driver.getWindowHandles(); 
		Iterator <String> it1= sessionid.iterator(); 
		
		String parent= it1.next(); 
		String child=it1.next(); 
		
		System.out.println(parent);
		System.out.println(child);
		
		driver.switchTo().window(child); 
		WebElement singup= driver.findElement(By.linkText("Sign Up")); 
		act.keyDown(Keys.SHIFT).build().perform(); 
		singup.click(); 
		Thread.sleep(3000);
	
		

		Set <String> three= driver.getWindowHandles(); 
		Iterator<String> it2= three.iterator(); 
		String parent2 =it2.next();
	    String child2 = it2.next(); 
		String grandchild= it2.next(); 
		
		System.out.println(parent2);
		System.out.println(child2);
		System.out.println(grandchild);
		
		driver.quit();

	}
	
	
	
	public static void Ibrowser (String Name_of_Browser, String url) throws InterruptedException {
		if (Name_of_Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

			driver= new ChromeDriver(); 
			driver.get(url);
			Thread.sleep(3000);
			
		}
		else if (Name_of_Browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\msedgedriver.exe"); 
			driver= new EdgeDriver();
			driver.get(url);
			Thread.sleep(2000);
		
		}
	
	}
}
