package gov.va.ascent.zipkin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import gov.va.ascent.framework.log.AscentLogger;
import gov.va.ascent.framework.log.AscentLoggerFactory;
import gov.va.ascent.test.framework.selenium.BasePage;

public class ZipkinHomePage extends BasePage {

	final AscentLogger log = AscentLoggerFactory.getLogger(ZipkinHomePage.class);

	public ZipkinHomePage(WebDriver selenium) {
		super(selenium);
		initialize(this);

	}

	// Zipkin Investigate system behavior in nav menu
	@FindBy(xpath = "//div[@class='navbar-header']")
	WebElement systembehavior;

	// Find a trace in nav menu
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/a")
	WebElement findatrace;

	// Depencies in nav menu
	@FindBy(xpath = "//li[@data-route='dependency']/a")
	WebElement depencies;

	// Go to trace Textbox in nav
	@FindBy(xpath = "//div[@class='navbar-left']/ul/li[2]")
	WebElement gototrace;

	// Service name dropdown
	@FindBy(xpath = "//select[@id='serviceName']")
	WebElement servicename;

	// Span name dropdown
	@FindBy(xpath = "//select[@id='spanName']")
	WebElement spanename;

	// start time
	@FindBy(xpath = "//input[@id='startTs']")
	WebElement starttime;

	// End time
	// start time dropdown
	@FindBy(xpath = "//input[@id='endTs']")
	WebElement endtime;

	public String getSystemBehavior() {
		return systembehavior.getText();
	}

	public String getFindaTrace() {
		return findatrace.getText();
	}

	public String getDepencies() {
		return depencies.getText();
	}

	public WebElement getgototrace() {
		return gototrace;
	}

	public WebElement getservicename() {
		return servicename;
	}

	public WebElement getspanname() {
		return spanename;
	}

	public WebElement getstarttime() {
		return starttime;
	}

	public WebElement getendtime() {
		return endtime;
	}
}
