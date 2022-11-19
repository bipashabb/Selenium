package Practicefromslides;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		String sessionID = driver.getWindowHandle(); 
		System.out.println(sessionID);
		
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String title = driver.getTitle(); 
		System.out.println(title);
		
		driver.close();
		
		
		


	}

}
