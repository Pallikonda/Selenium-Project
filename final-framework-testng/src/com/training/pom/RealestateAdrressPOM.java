package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealestateAdrressPOM {
	private WebDriver driver; 
	public RealestateAdrressPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="keyword_search")
	private WebElement Address; 
	
	@FindBy(xpath = "//span[contains(text(),'Property type')]")
	private WebElement Propertytype;
	
	
	@FindBy(xpath="//span[contains(text(),'Any Regions')]")
	private WebElement Regiontype;
	
	@FindBy(xpath="//button[@class='button fullwidth']")
	private WebElement Searchbutton;
	
	public void sendAddress(String Address) {
		this.Address.clear();
		this.Address.sendKeys(Address);
	}
		public void clickPropertytype() {
		this.Propertytype.click(); 
		

		
	}
	
		public void clickRegiontype() {
			this.Regiontype.click(); 	
		      
		
	}	

		public void clickSearchbutton() {
			this.Searchbutton.click(); 
		
}
}



