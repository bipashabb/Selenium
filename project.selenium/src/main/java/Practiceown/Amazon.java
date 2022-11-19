package Practiceown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Amazon {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"
		 * );
		 * 
		 * 
		 * driver= new ChromeDriver();
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * driver.get("https://www.amazon.com"); Thread.sleep(2000);
		 * 
		 * WebElement signinbutton =
		 * driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		 * signinbutton.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement emailinput = driver.findElement(By.name("email"));
		 * emailinput.sendKeys("abc@gmail.com"); Thread.sleep(1000);
		 * 
		 * WebElement continuebutton= driver.findElement(By.id("continue"));
		 * continuebutton.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.navigate().back(); Thread.sleep(3000);
		 * 
		 * WebElement creacc =
		 * driver.findElement(By.linkText("Create your Amazon account"));
		 * creacc.click();
		 * 
		 * WebElement firstname= driver.findElement(By.name("customerName"));
		 * firstname.sendKeys("Bipasha");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String weblink = driver.getCurrentUrl(); System.out.println(weblink);
		 * 
		 * WebElement email= driver.findElement(By.name("email"));
		 * email.sendKeys("bipasha@gmail.com");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("Hello123");
		 * 
		 * 
		 * WebElement passwordcheck = driver.findElement(By.name("passwordCheck"));
		 * passwordcheck.sendKeys("Hello123");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement continuebutton1 = driver.findElement(By.id("continue"));
		 * continuebutton1.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * String pagename= driver.getTitle(); System.out.println(pagename);
		 * 
		 * driver.manage().window().minimize(); Thread.sleep(2000);
		 * 
		 * driver.close();
		 * 
		 * 
		 * Thread.sleep(2000);
		 */
	
	

	System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
		

	 driver= new ChromeDriver(); 
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com");
	 
	 Thread.sleep(5000);
	 
	 WebElement creacc = driver.findElement(By.linkText("Create New Account")); 
	 creacc.click();
	 
	 Thread.sleep(3000);
	 
	 WebElement allday = driver.findElement(By.name("birthday_day")); 
	 
	  Select day = new Select(allday); 
	  
	  day.selectByIndex(7); // index 7 is 8
	  
	  Thread.sleep(2000);
	  
	  WebElement allmonths = driver.findElement(By.name("birthday_month")); 
	  
	  Select month= new Select(allmonths); 
	  month.selectByValue("7"); // value is July
	  
	  Thread.sleep(2000);
	  
	  WebElement allyear= driver.findElement(By.name("birthday_year")); 
	  Select year = new Select(allyear); 
	  
	  year.selectByVisibleText("1997");
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
