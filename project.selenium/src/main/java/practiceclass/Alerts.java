package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(7000);
		
		
		// first alert button click me
		
		/* driver.findElement(By.id("alertButton")).click(); */
		
		// go to alert window by switching
		/*
		 * Thread.sleep(4000); driver.switchTo().alert().accept();
		 * 
		 * //second Alert button with 5 sec wait
		 * driver.findElement(By.id("timerAlertButton")).click(); Thread.sleep(7000);
		 * driver.switchTo().alert().accept();
		 */
		
		
		//third alert button 
		/*
		 * driver.findElement(By.id("confirmButton")).click(); Thread.sleep(4000);
		 * driver.switchTo().alert().accept();
		 */
		
		// fourth alert button
		driver.findElement(By.id("promtButton")).click(); 
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Computer");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
