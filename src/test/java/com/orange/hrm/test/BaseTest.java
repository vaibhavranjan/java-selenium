package com.orange.hrm.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.report.ExtentReportUtils;

public class BaseTest {
	
	//public static RemoteWebDriver driver;
	public static WebDriver driver;
	
	@BeforeSuite
	public void initDriver() throws MalformedURLException
	{
		//ChromeOptions browserOptions = new ChromeOptions();
		//browserOptions.setPlatformName("Windows 11");
		//browserOptions.setBrowserVersion("latest");
		//Map<String, Object> sauceOptions = new HashMap<>();
		//sauceOptions.put("username", "oauth-ranjanvaibhav8-74730");
		//sauceOptions.put("accessKey", "eb81c201-5720-45ba-b7de-8efe7949fcdd");
		//sauceOptions.put("build", "selenium-build-01");
		//sauceOptions.put("name", "SaucelabTest_01");
		//browserOptions.setCapability("sauce:options", sauceOptions);
		//URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		//driver = new RemoteWebDriver(url, browserOptions);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		// Open login page
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ExtentReportUtils.setUpReport();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterSuite
	public void Cleanup()
	{
		driver.quit();
	}
}
