package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements1 {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https:facebook.com");
		driver.manage().deleteAllCookies();
		
		Thread.sleep(6000);
		
		WebElement emailaddress = driver.findElement(By.name("email")); 
		emailaddress.sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.id("pass")); 
		password.sendKeys("hello");
		
		Thread.sleep(2000); 
		
	WebElement loginbutton=	driver.findElement(By.name("login")); 
	loginbutton.click();
	
	Thread.sleep(4000);
	
	driver.navigate().back();
	
	WebElement fg_password= driver.findElement(By.linkText("Forgotten password?")); 
		fg_password.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
