package com.training.sanity.tests;

import org.testng.annotations.Test;


import com.training.pom.RealestatemPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class RealestatatemeRETC_007 {
	
	private WebDriver driver;
	private String baseUrl;
	private RealestatemPOM realestatemPOM;
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
		baseUrl = properties.getProperty("baseURL1");
		realestatemPOM=new RealestatemPOM(driver);
		driver.get(baseUrl);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	  }


  @AfterClass
  public void afterClass() {
  }
  
  @Test
  public void validTest() {
	  realestatemPOM.sendUserName("reva");
	  realestatemPOM.sendEmail("revasharma@gmail.com");
	  realestatemPOM.sendSubject("apartments");
	  realestatemPOM.sendMessage("looking for an apartments");
	  realestatemPOM.clickSendButton();
   
   
  }







}
