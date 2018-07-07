package com.jbehave.techolution.TecholutionAssignment.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class TecholutionSearchPage extends PageObject{
	
	@Override
	public WebDriver getDriver() {
		return driver;
	}

	public WebDriver driver = getDriver();

	public void openUrl() {
		driver.get("http://www.google.com");
	}

	public void enterSearchKeyword(String keyword) {
		driver.findElement(By.id("lst-ib")).sendKeys(keyword);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.TAB);
	}

	public void clickOnSearchButton() {
		driver.findElement(By.name("btnK")).click();
	}
	
	public void clickOnSearchResultByLinktext(String linkText){
		driver.findElement(By.xpath("//a[@href='" + linkText + "']")).click();
	}
	
	public void verifyTitle(String title){
		WebDriverWait wd =  new WebDriverWait(driver, 30);
		wd.until(ExpectedConditions.titleContains(title));
		System.out.println("Expected Title: " + title);
		System.out.println("Actual Title: " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains(title));
	}


}
