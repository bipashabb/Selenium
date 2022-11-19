package Amazonpageobjectmodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHomepage {
	
	public WebDriver driver; 
	
	@FindBy(linkText = "12 Days of Deals") WebElement deals_button; 
	@FindBy(id = "twotabsearchtextbox") WebElement searchbar; 
	@FindBy(id = "nav-search-submit-button") WebElement searchclick; 
	public void deals_click() {
		deals_button.click();
		

	}
	public void searchbar_sendkeys(String searchbar1) {
		searchbar.click();
		searchbar.sendKeys(searchbar1);
			}
	public void search_click() {
		searchclick.click();
	}
	
	public void goback() {
		driver.navigate().back();
		
	}
	
	public AHomepage(WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
	}
	

}
