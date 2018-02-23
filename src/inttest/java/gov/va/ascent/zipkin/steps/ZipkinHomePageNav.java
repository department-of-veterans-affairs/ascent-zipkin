package gov.va.ascent.zipkin.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.va.ascent.test.framework.restassured.BaseStepDef;
import gov.va.ascent.test.framework.selenium.BasePage;
import gov.va.ascent.zipkin.pages.ZipkinHomePage;
import gov.va.ascent.zipkin.pages.ZipkinLoginPage;
import gov.va.ascent.zipkin.util.ZipkinAppUtil;

public class ZipkinHomePageNav extends BaseStepDef {

	ZipkinHomePage homePage = null;
	
	final Logger log = LoggerFactory.getLogger(ZipkinHomePageNav.class);

	@Before({ "@zipkindhomepagenav" })
	public void setUpREST() {
	}

	@Given("^A user logins to zipkin homepage$")
	public void passTheHeaderInformationForDashboard() throws Throwable {
		WebDriver selenium = BasePage.getDriver();
		ZipkinLoginPage loginPage = new ZipkinLoginPage(selenium);
		loginPage.enterCredentialsandLogin();
		//System.out.println("------------"+selenium.getCurrentUrl());
		homePage = new ZipkinHomePage(selenium);
		
	}

	@When("^the user is in zipkin dashboard page$")
	public void makerequesustoappsurlGet() throws Throwable {
		//invokeAPIUsingGet(ZipkinAppUtil.getBaseURL() + strURL, false);
	}
	@Then("^verify the investigate system behavior in the navigation menu$")
	public void verifyInvestigareSystemBehavior () throws Throwable {
		
		//homePage.getHomeButtonValue();
		//Assert.assertEquals(homePage.getHomeButtonValue(), "Home");
		homePage.getSystemBehavior();
		Assert.assertTrue(homePage.getSystemBehavior().contains("Zipkin"));
		
	}
	@And("^verify the other links in the navigation menu$")
	public void otherLinks () throws Throwable {
		/*
		homePage.getFindaTrace();
		Assert.assertEquals(homePage.getFindaTrace(), "Find a trace");
		homePage.getDepencies();
		Assert.assertEquals(homePage.getDepencies(), "Dependencies");
		*/
	}

	
	@After({ "@zipkindhomepagenav" })
	public void cleanUp(Scenario scenario) {
		postProcess(scenario);
		//BasePage.closeBrowser();
	}

}
