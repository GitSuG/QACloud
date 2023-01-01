package com.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class GoogleSearchTests2 extends BaseDriverSetup {


	@Test
	public void searchTest21() throws InterruptedException {

//		WebElement searchButton = driver.findElement(By.xpath("//div[@class='zgAlFc']/span"));

		WebElement signinFrame = driver.findElement(By.name("callout"));
		driver.switchTo().frame(signinFrame);

		WebElement NoThanksButton = driver.findElement(By.xpath("//div[@class='QlyBfb']/button"));

		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(NoThanksButton));

		if (NoThanksButton.isDisplayed())
			NoThanksButton.click();

		driver.switchTo().defaultContent();

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys("Test21");
		logger.info("[LOG] Searching Test21");
		searchBox.sendKeys(Keys.ENTER);

//		searchButton.click();
	}
	
	@Test
	public void searchTest22() throws InterruptedException {

//		WebElement searchButton = driver.findElement(By.xpath("//div[@class='zgAlFc']/span"));

		WebElement signinFrame = driver.findElement(By.name("callout"));
		driver.switchTo().frame(signinFrame);

		WebElement NoThanksButton = driver.findElement(By.xpath("//div[@class='QlyBfb']/button"));

		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(NoThanksButton));

		if (NoThanksButton.isDisplayed())
			NoThanksButton.click();

		driver.switchTo().defaultContent();

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys("Test22");
		logger.info("[LOG] Searching Test22");
		searchBox.sendKeys(Keys.ENTER);

//		searchButton.click();
	}
	
	@Test
	public void searchTest23() {
		logger.warn("[LOG - Warning] Test is skipped");
		throw new SkipException("Test is being skipped");
	}

}
