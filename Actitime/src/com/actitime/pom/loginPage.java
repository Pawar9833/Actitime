package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	//decleration
		@FindBy(id="username")
		private WebElement untbx;
		
		@FindBy(name="pwd")
		private WebElement pswtbx;
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement logbtn;
		
		//initilization
		public loginPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//utilization

		public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPswtbx() {
			return pswtbx;
		}

		public WebElement getLogbtn() {
			return logbtn;
		}

}
