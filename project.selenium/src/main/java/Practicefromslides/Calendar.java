package Practicefromslides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendar {
	 static WebDriver driver; 


	public static void main(String[] args) throws InterruptedException {
		
		Ibrowser("chrome", "https://www.expedia.com");
		driver.findElement(By.id("d1-btn")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@aria-label='Nov 23, 2022']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='button' and @data-stid='apply-date-picker']")).click();
		

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
