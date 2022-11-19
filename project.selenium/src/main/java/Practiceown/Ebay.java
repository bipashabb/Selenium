package Practiceown;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Ebay {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		Ibrowser("chrome", "https://www.ebay.com");
		Thread.sleep(5000);
		driver.findElement(By.id("gdpr-banner-accept")).click();
		Thread.sleep(3000);
		Screenshots();
		
		WebElement search= driver.findElement(By.xpath("//input[@aria-autocomplete='list']")); 
		search.click();
		Thread.sleep(2000);
		search.sendKeys("holiday bags");
		Screenshots();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("****");
		String textholidaybags= driver.findElement(By.xpath("//span[contains(text(),'holiday bags')]")).getText(); 
		System.out.println(textholidaybags);
		int amountholidaybags= driver.findElements(By.xpath("//*[contains(text(),'holiday bags')]")).size(); 
		
		if (amountholidaybags !=0) {
			System.out.println("Holiday bags as text present " + amountholidaybags + " times");
		}
		else {
			System.out.println("Holidays bags as text is not present as it shows"+ amountholidaybags);
			}
		Thread.sleep(3000);
		
		
		WebElement search1= driver.findElement(By.xpath("//input[@aria-autocomplete='list']")); 
		search1.click();
		Thread.sleep(2000);
		Actions act= new Actions(driver); 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		act.keyDown(Keys.DELETE).build().perform();
		act.keyUp(Keys.DELETE); 
		Thread.sleep(2000);
		
		search1.sendKeys("computers");
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL); 
		Thread.sleep(2000);
		
		act.keyDown(Keys.DELETE).build().perform();
		act.keyUp(Keys.DELETE); 
		Thread.sleep(2000);
		
		search1.click();
		act.keyDown(Keys.CONTROL).sendKeys("V").build().perform();
		act.keyUp(Keys.CONTROL); 
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
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
	
	
	public static void Screenshots () throws IOException {
		Date datetime= new Date();  
		System.out.println(datetime);
		
		String conversion= datetime.toString().replace(" ", "_").replace(":","_"); 
		System.out.println(conversion);
		
		
		
		
		// store screenshots
		File screens = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screens, new File("U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\Pictures\\ebay\\" +conversion+ "ss.jpg"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



		
	}
	


