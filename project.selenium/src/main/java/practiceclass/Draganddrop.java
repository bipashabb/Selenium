package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.beust.jcommander.JCommander.Builder;

public class Draganddrop {

	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		

		 driver= new ChromeDriver(); 
		 
	 
		 driver.get("https://jqueryui.com/droppable/");
		  driver.switchTo().frame(0);
		
		 
		 Thread.sleep(3000);
		 
		 WebElement dragstart = driver.findElement(By.id("draggable")); 
		 WebElement dropin = driver.findElement(By.id("droppable")); 
		 
		 Actions act= new Actions(driver); 
		Thread.sleep(2000); 
		 
		 
		 act.dragAndDrop(dragstart, dropin).build().perform();
		 
	

		 
		 driver.switchTo().parentFrame(); 
		
		WebElement resize = driver.findElement(By.linkText("Resizable")); 
		
		resize.click();
		
		driver.switchTo().frame(0); 
		
		WebElement resize1 = driver.findElement(By.id("resizable")); 
		
		WebElement resizetarget= driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")); 
		
		act.dragAndDrop(resize1, resizetarget).build().perform();  
	
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
