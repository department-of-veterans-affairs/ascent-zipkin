package gov.va.ascent.zipkin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.va.ascent.test.framework.selenium.BasePage;




	public class ZipkinHomePage extends BasePage{
		
		final Logger log = LoggerFactory.getLogger(ZipkinHomePage.class);

		 public ZipkinHomePage(WebDriver selenium) {
			 super(selenium);
			 initialize(this);
			 
		 }

		 //Home Button in Dashboard Navigation
		 @FindBy (xpath="//div[@class='header clearfix']/nav/ul/li[1]/a")
		 WebElement homebutton;
		 
		 //Zipkin Investigate system behavior in nav menu
		 @FindBy (xpath="//A[@class='navbar-brand']")
		 WebElement systembehavior;
		
		 //Find a trace in nav menu
		 @FindBy (xpath="//ul[@class='nav navbar-nav']/li[1]/a")
		 WebElement findatrace;
		 
		 //Depencies in nav menu 
		 @FindBy (xpath="//li[@data-route='dependency']/a")
		 WebElement depencies;
		 
		 //Go to trace Textbox in nav
		 @FindBy (xpath="//div[@class='navbar-left']/ul/li[2]")
		 WebElement gototrace;
		 
		 //Service name dropdown 
		 @FindBy (xpath="//form[@class='form-group']/ul/li[2]")
		 WebElement servicename;
		 
		 //Span name dropdown 
		 @FindBy (xpath="//form[@class='form-group']/ul/li[2]")
		 WebElement spanename;
		 
		 //start time dropdown
		 @FindBy (xpath="//div[@class='form-control input-sm date-input'")
		 WebElement starttime;
		 
		 public String getHomeButtonValue() {
			 return homebutton.getText();
		 }
		 
		 public String getSystemBehavior() {
			 return systembehavior.getText();
		 }
	 
		 public String getFindaTrace() {
			 return findatrace.getText();
		 }
		 public String getDepencies() {
			 return depencies.getText();
		 }
		 public String getgototrace() {
			 return gototrace.getText();
		 }
		 public String getservicename() {
			 return servicename.getText();
		 }
		 public String getspanname() {
			 return spanename.getText();
		 }
		 public String getstarttime() {
			 return starttime.getText();
		 }
	}
