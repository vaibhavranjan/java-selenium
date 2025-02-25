package com.orange.hrm.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;
import com.report.ExtentReportUtils;

public class LoginPage {

	WebDriver _driver;
	// username locator
	@FindBy(name = "username")
	WebElement userNameTextBox;

	// password locator
	@FindBy(name = "password")
	WebElement passwordTextBox;

	// login button locator
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public LoginPage() {
		// _driver = driver;
		PageFactory.initElements(BaseTest.driver, this);
	}

	Logger log = LogManager.getLogger(LoginPage.class);

	public void LoginToApp(String userName, String password) throws InterruptedException {
		userNameTextBox.sendKeys(userName);
		log.info("username is entered");
		ExtentReportUtils.addStep("username is entered");
		passwordTextBox.sendKeys(password);
		log.info("password is entered");
		ExtentReportUtils.addStep("password is entered");
		loginButton.click();
		Thread.sleep(2);
		log.info("user clicked on login button");
		ExtentReportUtils.addStep("user clicked on login button");
		System.out.println("Test");

	}

}
