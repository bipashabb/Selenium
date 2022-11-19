package Practicefromslides;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		Ibrowser("chrome", "https:www.amazon.com");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		// TODO Auto-generated method stub
		
		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(30)); 
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("By.linkText(\"Today's Deals\"")));  

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
