package com.jbehave.techolution.TecholutionAssignment;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jbehave.techolution.TecholutionAssignment.pages.TecholutionSearchPage;

public class TecholutionSearchSteps extends Steps {
	
	TecholutionSearchPage techolutionSearchPage = new TecholutionSearchPage();
	
	@BeforeStories
	public void setup(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Chromedriver\\chromedriver.exe");
		techolutionSearchPage.driver = new ChromeDriver();
	}
	
	@AfterStories
	public void cleanup(){
		techolutionSearchPage.driver.quit();
	}
	
	
	@When("User selects <address> in search result")
	public void whenUserSelectsaddressInSearchResult(@Named("address") String address){
		techolutionSearchPage.clickOnSearchResultByLinktext(address);
	}
	@When("User searches for <keyword>")
	public void whenUserSearchesForkeyword(@Named("keyword") String keyword){
		techolutionSearchPage.enterSearchKeyword(keyword);
		techolutionSearchPage.clickOnSearchButton();
	}
	@Then("<title> page should be displayed")
	public void thentitlePageShouldBeDisplayed(@Named("title") String title){
		techolutionSearchPage.verifyTitle(title); 
	}
	@Given("User is on google search page")
	public void givenUserIsOnGoogleSearchPage(){
		techolutionSearchPage.openUrl(); 
	}


}
