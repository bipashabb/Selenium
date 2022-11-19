package Practiceown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

		driver = new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		Thread.sleep(7000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='button'])[5]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		int amountofbutton = driver.findElements(By.xpath("//*[@type='button']")).size(); 
		System.out.println(amountofbutton);
		
		if (amountofbutton != 0) {
			System.out.println("button type element is present");
		} else {
			System.out.println("Button type element not present");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
	
	

}
