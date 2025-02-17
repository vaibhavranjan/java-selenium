package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.ExcelUtility;
import com.utility.PropertiesUtility;

public class LoginTest extends BaseTest{
	
	@Test
	public void LoginToAppWithValidCredentials() throws InvalidFormatException, IOException, InterruptedException
	{
		LoginPage lp  =  new LoginPage();
		//lp.LoginToApp(ExcelUtility.getTestData(1, 0),ExcelUtility.getTestData(1, 1));
		lp.LoginToApp(PropertiesUtility.getTestData("username"), PropertiesUtility.getTestData("password"));
	}

}
