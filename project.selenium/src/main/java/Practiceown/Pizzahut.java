package Practiceown;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pizzahut {

	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Ibrowser("chrome","https://www.pizzahut.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='onetrust-reject-all-handler']")).click();
		Screenshots();
		Thread.sleep(3000);
		driver.findElement(By.linkText("View all deals")).click();
		Thread.sleep(3000);
		WebElement Postcode=driver.findElement(By.xpath("//input[@type='search']")); 
		Postcode.click();
		Postcode.sendKeys("RM204AS"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains (text(),'Find my Hut')]")).click();
		Screenshots();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'No, thanks')]")).click();
		Thread.sleep(4000);
	
		
		Thread.sleep(3000);
		driver.close();
	}
	
	public static void Ibrowser (String Name_of_Browser, String url) throws InterruptedException {
		if (Name_of_Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 

			driver= new ChromeDriver(); 
			driver.get(url);
			Thread.sleep(3000);
			
		}
		else if (Name_of_Browser.equalsIgnoreCase("Edge")){
			System.setProperty("webdriver.edge.driver","U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\msedgedriver.exe"); 
			driver= new EdgeDriver();
			driver.get(url);
			Thread.sleep(2000);
			}
	}
	
	public static void Screenshots () throws IOException {
		Date dateandtime= new Date(); 
		String dateandtimeconverted= dateandtime.toString().replace(" ", "_").replace(":", "_"); 
		System.out.println(dateandtimeconverted);
		
		File pizza= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileHandler.copy(pizza, new File("U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\Pictures\\pizzahut\\"+ dateandtimeconverted+ "ss.jpg"));
		
	}
	
	

}
