package practiceclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException, IOException {
		

		
System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		WebElement login= driver.findElement(By.name("login")); login.click();
		 
		Thread.sleep(5000);
		Screenshotss (); 
		
	}
		
		
		
		
	
	// screenshot method 
	
	public static void Screenshotss() throws IOException {
		Date datetime = new Date(); 
		String converted= datetime.toString().replace(" ", "_").replace(":", "_"); 
		
		
		
		File screenshotsFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshotsFile, new File("U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\Pictures\\"+ converted +"ss.jpeg"));
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
