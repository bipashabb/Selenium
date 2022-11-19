package Practiceown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver1 {

	
	static WebDriver driver; 
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\msedgedriver.exe"); 
		
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
	}
}
