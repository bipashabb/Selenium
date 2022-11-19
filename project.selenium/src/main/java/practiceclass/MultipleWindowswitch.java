package practiceclass;

import java.time.Duration;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowswitch {
	static WebDriver driver; 


	
	public static void main(String[] args) throws InterruptedException {

		
		//parent session1
		Ibrowser("chrome"); 
		driver.get("https://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit page to load
		
		//WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(30)); // elements to load
		//exwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")));
		
		driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base glow-toaster-button glow-toaster-button-dismiss']")).click();
		
		//Thread.sleep(3000); // for pop ups
		
		WebElement deals= driver.findElement(By.linkText("Today's Deals")); 
		
		//Session2
		Actions act= new Actions(driver); 
		act.keyDown(Keys.SHIFT).build().perform();
		deals.click();
		
		//Thread.sleep(3000);
		
		Set<String> WindownsessionIds= driver.getWindowHandles(); 
		Iterator<String> it1 = WindownsessionIds.iterator(); 
		
		String ParentSessionID= it1.next(); 
		String ChildsessionID = it1.next(); 
		
		System.out.println(ParentSessionID);
		System.out.println(ChildsessionID);
		
		driver.switchTo().window(ChildsessionID); 
		
		// Handling child window
		//Thread.sleep(4000); 	
		
	
		WebElement coupons = driver.findElement(By.xpath("//span[contains(text(),'Coupons')]")); 
		coupons.click();
		
		driver.switchTo().window(ParentSessionID); 
		
		
		
		
		
		driver.get("https:www.google.com"); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		WebElement image= driver.findElement(By.linkText("Images")); 
		act.keyDown(Keys.SHIFT).build().perform(); 
		image.click(); 
		act.keyUp(Keys.SHIFT).build().perform(); 
		
	Set<String> sessionid=	driver.getWindowHandles(); 
	Iterator<String> iterator1 = sessionid.iterator(); 
	
	String googleimage_child= iterator1.next(); 
	String parentgoogle= iterator1.next(); 
	
	System.out.println(googleimage_child);
	System.out.println(parentgoogle);
	
	
	
		
		
		
		
		

	}
	
	
	
	
	public static void Ibrowser (String Name_of_Browser) throws InterruptedException {
		if (Name_of_Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
			driver= new ChromeDriver(); 
			
			Thread.sleep(3000);
			
		}
		else if (Name_of_Browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\msedgedriver.exe"); 
			driver= new EdgeDriver();
			
			Thread.sleep(2000);
		
		}
		
		
	

}
}