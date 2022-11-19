package Practiceown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	
		
	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
	
	driver= new ChromeDriver(); 
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	
	String textFacebook =driver.findElement(By.xpath("//*[contains (text(),'Facebook helps')]")).getText(); // print the text and exception will show if not available
	System.out.println(textFacebook);
	
	int amount_of_you_as_text= driver.findElements(By.xpath("//*[contains (text(),'you ')]")).size(); // print amount of the text and if 0 codes will still run after
	System.out.println(amount_of_you_as_text);
	
	if (amount_of_you_as_text == 0) {
		System.out.println("text not present");
	}
	else {
		System.out.println("You Text present ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Thread.sleep(4000);
	driver.close();

	}

}
