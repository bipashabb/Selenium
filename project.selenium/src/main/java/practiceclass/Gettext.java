package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);

		/*
		 * String homepagetext =
		 * driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).
		 * getText(); System.out.println(homepagetext);
		 */
		
		// findElementss the total amount that contains the element in the current page. Size should be at the end
		int amount= driver.findElements(By.xpath("//h2[contains(text(),'Facebook helps')]")).size(); 

		//can do * tags in xpath as well
	
		System.out.println(amount);
		
		if (amount!=0) {
			System.out.println("Text is present");
		}
		else {
			System.out.println("Text not present");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
