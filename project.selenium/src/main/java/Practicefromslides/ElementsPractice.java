package Practicefromslides;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsPractice {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","U:\\\\eclipsework bipasha\\\\Eclipse work\\\\project.selenium\\\\drivers\\\\chromedriver.exe"); 
		
		driver= new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement emailfield = driver.findElement(By.id("email"));
		emailfield.sendKeys("easyautomation@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass")); 
		password.sendKeys("easyautomation");
		
		Thread.sleep(3000);
		
		/*
		 * WebElement login= driver.findElement(By.name("login")); login.click();
		 * 
		 * Thread.sleep(3000);
		 */
		/*
		 * WebElement fgtpassword=
		 * driver.findElement(By.linkText("forgotten password?")); fgtpassword.click();
		 * 
		 * Thread.sleep(3000);
		 */
		
		/*
		 * WebElement partiallink=
		 * driver.findElement(By.partialLinkText("forgotten password"));
		 * partiallink.click(); Thread.sleep(3000);
		 */
		
		WebElement createAC= driver.findElement(By.linkText("Create New Account")); 
		createAC.click();
		
		Thread.sleep(3000);
		WebElement allmonths= driver.findElement(By.name("birthday_month")); 
		Select month= new Select(allmonths); 
		month.selectByIndex(2); // march month
		
		Thread.sleep(3000);
		WebElement alldays = driver.findElement(By.name("birthday_day")); 
		Select day= new Select(alldays); 
		day.selectByValue("20"); // values are in double brackets
		
		Thread.sleep(2000);
		
		WebElement allyears= driver.findElement(By.name("birthday_year")); 
		Select year= new Select(allyears); 
		year.selectByVisibleText("1997"); // normal text in black
		
		WebElement gender= driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]")); 
		gender.click(); // absolute Xpath
		
		// relative xpath //tagname[@attributename='attribute value'] or //*[@attributename='attribute value']
		
	WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]")); 
	signup.click();
	
	// text relative xpath //tagname[text()='text'] can do add/or to add attribute and refine the search
	
	WebElement signup1= driver.findElement(By.xpath("//button[text()='Sign Up' and @type='submit' and @name='websubmit']")); 
	signup1.click();
	
		// contains relative xpath //*[contains(@attributename,'attribuevalue')] the inside value can be partial too. 
	WebElement forgottenpassword = driver.findElement(By.xpath("//*[contains (text(),'Forgotten password?')] ")); 
	forgottenpassword.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
