package pizzahutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Postcodepage {
	public WebDriver driver; 
	
	@FindBy(xpath = "//input[@type='search']") WebElement Postcode_search_button; 
	@FindBy(xpath = "//span[contains (text(),'Find my Hut')]") WebElement search_button; 
	
	public void postcodesearch () {
		Postcode_search_button.click();
		
	}
	public void postcodesendkeys() {
		Postcode_search_button.sendKeys("RM204AS");
	}
	
	public void searchclick() {
		search_button.click();
	}
	
	public Postcodepage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
}


