package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	//declearation
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskab;
	
	@FindBy (id = "logoutLink")
	private WebElement logoutlink;
	  
	
	//inilitilization
	public home (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getTaskab() {
		return taskab;
	}
	public WebElement getLogoutLink() {
		return logoutlink;
	}

}
