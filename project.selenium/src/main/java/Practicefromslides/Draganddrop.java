package Practicefromslides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		driver.switchTo().frame(0); 
		WebElement drag = driver.findElement(By.id("draggable")); 
		
		WebElement drop = driver.findElement(By.id("droppable")); 
		
		Actions act= new Actions(driver); 
		Thread.sleep(2000);
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().parentFrame(); 
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
