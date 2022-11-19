package Amazonpageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowser {
static WebDriver driver; 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.com");
		

	}

}
