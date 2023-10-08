package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.genericlibrary.BaseClass;
import com.actitime.genericlibrary.Filelibrary;
import com.actitime.pom.TaskPage;
import com.actitime.pom.home;

public class CreateCustomer extends BaseClass{
@Test
public void create() throws EncryptedDocumentException, IOException {
	home hp = new home(driver);
	hp.getTaskab().click();
	TaskPage tp = new TaskPage(driver);
	tp.getAddnew().click();
	tp.getNewcustomer().click();
	Filelibrary f = new Filelibrary();
	String custname = f.readDataFromExcel("WantedList", 2, 1);
			tp.getCustname().sendKeys(custname);
	String custdesp = f.readDataFromExcel("WantedList", 2, 2);
	tp.getCustdesp().sendKeys(custdesp);
	tp.getCreatebtn().click();
			
	
}
}
