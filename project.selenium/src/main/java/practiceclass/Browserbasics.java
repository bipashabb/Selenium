package practiceclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserbasics {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		
		driver= new ChromeDriver();
		
		
	
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize(); // maximise window
		Thread.sleep(3000);
		
		driver.navigate().refresh(); // refresh page
		Thread.sleep(1000); // wait 3 seconds after refreshing
		
		driver.navigate().back();   // back button
		Thread.sleep(1000);
		
		driver.navigate().forward();    // forward button
		Thread.sleep(1000);
		
		String session_id= driver.getWindowHandle();  // get session id
		System.out.println(session_id);
		
		String current_url = driver.getCurrentUrl(); // get current url
		System.out.println(current_url);
		
		String page_title=driver.getTitle(); // get page title
		System.out.println(page_title);
		
	
		
		driver.close();

	}

}
