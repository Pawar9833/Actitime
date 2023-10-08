package com.actitime.genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.pom.loginPage;

public class BaseClass {
	Filelibrary f=new Filelibrary();
	public static WebDriver driver;
        @BeforeSuite
        public void Databaseconnection() {
        	Reporter.log("data base connection",true);
        }
        @BeforeClass
        public void launchBrowser() {
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		driver.get("https://demo.actitime.com/login.do ");
    		Reporter.log("Browser Launch",true);
        }
        @BeforeMethod
        public void Login() throws IOException {
        //	driver.findElement(By.id("username")).sendKeys("admin");
    	//	driver.findElement(By.name("pwd")).sendKeys("manager");
    	//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
        	loginPage lp = new loginPage(driver);
        	
        	String un = f.readDataFromPropertyFile("username");
        	String pd = f.readDataFromPropertyFile("password");
        	lp.getUntbx().sendKeys(un);
        	lp.getPswtbx().sendKeys(pd);
        	lp.getLogbtn().click();
    		Reporter.log("Logged in successfully",true);
        }
        @AfterMethod
    	public void Logout() {
    		driver.findElement(By.id("logoutLink")).click();
    		Reporter.log("Creat Custome logoutr",true);	
    	}
        @AfterClass
        public void ClosebrowserMethod() {
    		driver.close();
    		Reporter.log("Close Browser ",true);	
    	}
        @AfterSuite
    	public void disconnectiondata() {
    		Reporter.log("database disconnection",true);
    	}
}
