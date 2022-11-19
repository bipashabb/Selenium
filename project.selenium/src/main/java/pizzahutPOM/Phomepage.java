package pizzahutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phomepage {
	
	public  WebDriver driver; // public because needs to be called in a diff package
	
	@FindBy(id = "onetrust-reject-all-handler") WebElement cookies_button; 
	@FindBy(linkText = "View all deals") WebElement all_deals_button; 
	
	public void click_cookies() {
		cookies_button.click();
	}
	
	public void all_deals_click() {
		all_deals_button.click();
	}
	
	public Phomepage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	
}
