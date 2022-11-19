package Practiceown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_management {

	static WebDriver driver; 
	


// main method for browser
	public static void main (String[] args) throws InterruptedException {
		
		Ibrowser("Chrome","https://www.google.com"); 
		Thread.sleep(5000);
		

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
