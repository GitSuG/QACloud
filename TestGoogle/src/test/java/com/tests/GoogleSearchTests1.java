package com.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleSearchTests1 extends BaseDriverSetup {


	@Test
	public void searchTest1() throws InterruptedException {

//		WebElement searchButton = driver.findElement(By.xpath("//div[@class='zgAlFc']/span"));

		WebElement signinFrame = driver.findElement(By.name("callout"));
		driver.switchTo().frame(signinFrame);

		WebElement NoThanksButton = driver.findElement(By.xpath("//div[@class='QlyBfb']/button"));
		logger.info("[LOG] Dismissing pop-up");
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(NoThanksButton));

		if (NoThanksButton.isDisplayed())
			NoThanksButton.click();

		driver.switchTo().defaultContent();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));		
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys("News");
		logger.info("[LOG] Searching News");
		searchBox.sendKeys(Keys.ENTER);

		/*
		 * AutoIT scripting command executor
		 */
//		Runtime.getRuntime().exec("");
//		searchButton.click();
	}

}
