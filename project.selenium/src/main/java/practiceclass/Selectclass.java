package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectclass {
static WebDriver driver; 


	public static void main(String[] args) throws InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		

		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize(); // maximise window
		Thread.sleep(3000);
		
		

	}

}
