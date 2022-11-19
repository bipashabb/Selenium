package TestNG;

import org.testng.annotations.Test;

import commons.Common_items;
import facebook_pom.Facebook_homepage;

import org.testng.annotations.DataProvider;

public class Facebook_signInFunctionality extends Common_items {
  @Test(dataProvider = "testdata1")
  public void f(String testemail, String testpassword) throws InterruptedException {
	  Facebook_homepage ob= new Facebook_homepage(driver); 
	  Thread.sleep(2000);
	  ob.email_sendkeys(testemail);
	  Thread.sleep(2000);
	  ob.password_input(testpassword);
	  Thread.sleep(2000);
	  ob.login_click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
  }

  @DataProvider
  public Object[][] testdata1() {
    return new Object[][] {
      new Object[] { "ab1@gmail.com", "abc123" },
      new Object[] { "ab1@gmail.com", "bc123" },
      new Object[] { "ab10@gmail.com", "abc123"},
      new Object[] { "", "bc123"}, 
    };
  }
}
