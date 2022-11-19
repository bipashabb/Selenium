package pizzahutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizzahutmenupage {
	public WebDriver driver; 
	@FindBy(xpath = "(//button[@style='margin-bottom: 0px;'])[1]") WebElement getstarted_button; 
	
	public void getstarted_click() {
		getstarted_button.click();
	}
	
	public Pizzahutmenupage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	

}
