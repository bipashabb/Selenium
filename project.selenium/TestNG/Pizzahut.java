package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Pizzahut {
	
	
	
	
	
	
	
	
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void browser () {
	  Ibrowser("Chrome", "https://pizzahut.co.uk");
  }
  
  public void Ibrowser (String Name_of_Browser, String url) throws InterruptedException {
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
			Thread.sleep(2000);}
		
		}

  @AfterClass
  public void Screenshot() {
	  
  }
	public void Screenshots() throws IOException {
		Date Sytemtime_anddate= new Date(); 
		System.out.println(Sytemtime_anddate);
		
	// convert date format to String and then add to the path
		String date_time= Sytemtime_anddate.toString().replace(" ", "_").replace(":","_"); 
		System.out.println(date_time);
		
		File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // SS store as a file. Taking SS with the help of the driver
		FileHandler.copy(screenshots,new File("U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\Pictures\\pizzahut"+ date_time+ "ss.jpg"));
		
		
	}


}
