package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Amazonpageobjectmodels.AHomepage;
import commons.Common_items;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Amazon2 extends Common_items {


	
	@Test
	public void amazon() {
		AHomepage ob=new AHomepage(driver); 
		ob.searchbar_sendkeys("computer");
		ob.search_click();
		
		String currenturl= driver.getCurrentUrl(); 
		System.out.println(currenturl);
		SoftAssert asrt= new SoftAssert(); 
		asrt.assertEquals(currenturl, "https://www.1amazon.com");
		
		asrt.assertAll(); 
		
		//Assert.assertEquals(currenturl, "https://www.amazon.com");
	}
	

	//@Test // Actual testing code //google
 // public void f() {
		//WebElement searchgoogle = driver.findElement(By.name("q")); 		
		
		//searchgoogle.click();
		//searchgoogle.sendKeys("selenium");
		
  }
 
  

