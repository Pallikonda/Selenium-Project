package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RealestatemPOM {
	
	private WebDriver driver; 
	public RealestatemPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(name ="your-name")
	private WebElement userName; 
	
	@FindBy(name ="your-email")
	private WebElement YourEmail;
	
	@FindBy(name ="your-subject")
	private WebElement Subject; 
	
	@FindBy(name ="your-message")
	private WebElement YourMessage;
	
	
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-submit']")
	private WebElement SendButton; 
	
	@FindBy(id ="amount")
	private WebElement SalePrice; 
	
	@FindBy(id ="downpayment")
	private WebElement Downpayment; 
	
	@FindBy(id ="years")
	private WebElement Loanterm; 
	
	@FindBy(id ="interest")
	private WebElement Interestrate; 
	
	@FindBy(xpath ="//button[@class='button calc-button']")
	private WebElement CalculateButton;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
		public void sendEmail(String Email) {
			this.YourEmail.clear();
			this.YourEmail.sendKeys(Email);
		}
		
		public void sendSubject(String Subject) {
			this.Subject.clear();
			this.Subject.sendKeys(Subject);
		}	
		
		public void sendMessage(String Message) {
			this.YourMessage.clear();
			this.YourMessage.sendKeys(Message);
		}	
		
		public void clickSendButton() {
			this.SendButton.click(); 
		}
		
		public void SendSaleprice(String SalePrice) {
			this.SalePrice.clear();
			this.SalePrice.sendKeys(SalePrice);
		}	

		public void SendDownpayment(String Downpayment) {
			this.Downpayment.clear();
			this.Downpayment.sendKeys(Downpayment);
		}
		
		public void SendLoanterm(String Loanterm) {
			this.Loanterm.clear();
			this.Loanterm.sendKeys(Loanterm);
		}
		public void SendInterestrate(String Interestrate) {
			this.Interestrate.clear();
			this.Interestrate.sendKeys(Interestrate);
		}
		

		public void clickCalculatebutton() {
			this.CalculateButton.click(); 
			
		}
		
		
}


