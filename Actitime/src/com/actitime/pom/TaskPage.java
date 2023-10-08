package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//decleartion
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy (xpath ="//div[.'+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	//initilization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcustomer() {
		return newcustomer;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

}
