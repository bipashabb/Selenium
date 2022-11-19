package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Amazonpageobjectmodels.AHomepage;
import Amazonpageobjectmodels.Beautypage;
import Amazonpageobjectmodels.Todaysdeal_page;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.Common_items;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Amazon1 extends Common_items {
	
	 //public static WebDriver driver; not needed as extended from Common and is already there in back end. 	 
@Test
  public void actualtest () {
	  
	  AHomepage Hob= new AHomepage(driver); 
	  Hob.deals_click(); 
	  Hob.searchbar_sendkeys("computer");
	  Hob.search_click();
	  Hob.goback();
	  
	  Todaysdeal_page ob2= new Todaysdeal_page(driver); 
	  ob2.dealsclick();
	  ob2.sell_click();
	  Beautypage ob3= new Beautypage(driver); 
	  ob3.beauty_click();
	  
  }
	  
  }

  


