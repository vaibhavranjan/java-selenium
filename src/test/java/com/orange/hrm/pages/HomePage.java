package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class HomePage{
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminLink;
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement profilePicture;
	
	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	Logger log = LogManager.getLogger(HomePage.class);

	public void ClickAdminLink() throws InterruptedException
	{
		adminLink.click();
		log.info("Admin link is clicked");
		Thread.sleep(2);
		ExtentReportUtils.addStep("Admin link is clicked");
	}
	
	
	public void logout() throws InterruptedException
	{
		profilePicture.click();
		log.info("profile picture link is clicked");
		Thread.sleep(2);
		ExtentReportUtils.addStep("profile picture link is clicked");
		logoutLink.click();
		log.info("logout link is clicked");
		Thread.sleep(2);
		ExtentReportUtils.addStep("logout link is clicked");
	}
	
	
	
}
