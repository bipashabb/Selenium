package facebook_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_homepage {

	public WebDriver driver; 
	@FindBy(id = "email") WebElement email_field; 
	@FindBy(id="pass") WebElement pass_field; 
	@FindBy(name = "login") WebElement login_button; 
	
	public void email_sendkeys(String testemail) {
		email_field.click();
		email_field.clear(); 
		email_field.sendKeys(testemail);
	}
	
	public void password_input(String testpassword) {
		pass_field.click();
		pass_field.sendKeys(testpassword);
		
	}
	
	public void login_click() {
		login_button.click();
	}
	
	public Facebook_homepage (WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
}
