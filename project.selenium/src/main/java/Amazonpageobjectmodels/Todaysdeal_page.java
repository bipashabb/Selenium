package Amazonpageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Todaysdeal_page {
	
	
	public WebDriver driver; 
	@FindBy(linkText = "Today's Deals")WebElement todaysdeals; 
	@FindBy(linkText = "Sell") WebElement Sell_button; 
	
	
	

	public void dealsclick() {
		todaysdeals.click();
	
	}
	
	public void sell_click() {
		Sell_button.click();
	}
	
	public Todaysdeal_page(WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
		
	}

}
