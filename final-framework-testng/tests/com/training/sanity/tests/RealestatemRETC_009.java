package com.training.sanity.tests;


import org.testng.annotations.Test;

import com.training.pom.RealestateAdrressPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;


public class RealestatemRETC_009 {
	
	private WebDriver driver;
	private String baseUrl;
	private RealestateAdrressPOM realestateaddressPOM;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	@BeforeMethod
	  public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		realestateaddressPOM=new RealestateAdrressPOM(driver);
		driver.get(baseUrl);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
	  }


  @AfterClass
  public void afterClass() {
  }
  
  @Test
  public void validTest() {
	  realestateaddressPOM.sendAddress("Electronic city");
		  realestateaddressPOM.clickPropertytype();
		  Actions act=new Actions(driver);
			
			act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);

	       act.sendKeys(Keys.ENTER).build().perform();

		  realestateaddressPOM.clickRegiontype();
		  Actions act1=new Actions(driver);
		  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);

	       act1.sendKeys(Keys.ENTER).build().perform();
	       
	       realestateaddressPOM.clickSearchbutton();
  }

}





