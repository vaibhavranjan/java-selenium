package com.orange.hrm.test;
import org.testng.annotations.Test;
import com.orange.hrm.pages.HomePage;

public class HomePageTest extends BaseTest{

	@Test
	public void LoginoutFromApp() throws InterruptedException
	{
		HomePage hp  =  new HomePage();
		hp.ClickAdminLink();
		hp.logout();
	}
}
