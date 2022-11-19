package practiceclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	static WebDriver driver; 

	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "U:\\eclipsework bipasha\\Eclipse work\\project.selenium\\drivers\\chromedriver.exe"); 
			

		 driver= new ChromeDriver(); 
		 
		
		 
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(5000);
		 
			/*
			 * WebElement creacc = driver.findElement(By.linkText("Create New Account"));
			 * creacc.click();
			 */
		 
			/* Thread.sleep(6000); */
		 
			/*
			 * WebElement gender = driver.findElement(By.name("sex")); gender.click();
			 */
		 // absolute xpath / tagname/tagname/etc/
			/*
			 * WebElement gendermale = driver.findElement(By.xpath(
			 * "(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[2]"
			 * ));
			 * 
			 * gendermale.click();
			 */
		 
		 // relative xpath on sign in button // tagname [@attributename='attributevalue' and ]
		 
			/*
			 * WebElement sign_in=
			 * driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']")
			 * );
			 * 
			 * sign_in.click();
			 */

		
		 
		 // Contains xpath //tagname[contains(text(),'Forgot password')] // *[contains(text(),'text')]
		
		 WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]")); 
	forgotpassword.click();
	
	 // textpath //tagname[text() ='text'] or *[text()='text']
	
	WebElement search = driver.findElement(By.xpath("//*[text()='Search']")); 
	
	search.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
