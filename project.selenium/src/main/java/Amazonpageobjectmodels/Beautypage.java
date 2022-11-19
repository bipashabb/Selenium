package Amazonpageobjectmodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beautypage {
	public WebDriver driver; 
	@FindBy (xpath = "(//span[text()='Beauty'])[1]") WebElement beauty_button; 
	
	public void beauty_click() {
		beauty_button.click();
	}

	public Beautypage (WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
		
		
	}
}
