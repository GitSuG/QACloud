package com.tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriverSetup {

	static WebDriver driver;
//	String browser = "chrome";
//	String browser = "firefox";
	Logger logger = LogManager.getLogger(BaseDriverSetup.class);

	@Parameters("browser")
	@BeforeMethod
	public void setup(@Optional("chrome") String browser) throws InterruptedException {

//		String driverPath = "/usr/local/bin/chromedriver";

//		System.setProperty("webdriver.chrome.driver", driverPath);

		String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
		logger.info("----------------------------"+date+"----------------------------");
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			browser = "chrome";
			logger.info("[LOG] Launching 'Chrome Browser'");
			break;
		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			browser = "firefox";
			logger.info("[LOG] Launching 'Firefox Browser'");
			break;
		default:
			logger.error("[LOG - ERROR] No such browser");
			System.out.println("No such browser option");
		}

		System.out.println(browser + " : browser");
		driver.get("https://www.google.com/");
		logger.info("[LOG] Launching 'google.com' Website");
		Thread.sleep(3000);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
		logger.info("[LOG] Shutting down ...");
	}
}
