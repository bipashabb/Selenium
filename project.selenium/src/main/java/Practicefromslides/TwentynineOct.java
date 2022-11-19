package Practicefromslides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwentynineOct {
	static ChromeDriver driver; 

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		String text= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText(); 
		System.out.println(text);
		
		int size= driver.findElements(By.xpath("//h2[contains (text(),'Facebook helps')]")).size(); 
		System.out.println(size);
		
		if (size ==0) {
			System.out.println("Text not present");
		}
		else {
			System.out.println("Text is present");
		}
		
	
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
