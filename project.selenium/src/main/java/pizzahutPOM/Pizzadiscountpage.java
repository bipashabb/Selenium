package pizzahutPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pizzadiscountpage {
	public WebDriver driver; 
	@FindBy(xpath = "//*[contains(text(),'No, thanks')]") WebElement Nothanks_button; 
	
	
	public void nothanks_click() {
		Nothanks_button.click();
	}
	
	
	public Pizzadiscountpage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
}


