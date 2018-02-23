package gov.va.ascent.zipkin.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import gov.va.ascent.test.framework.selenium.BasePage;
import gov.va.ascent.zipkin.util.ZipkinAppUtil;

public class ZipkinLoginPage extends BasePage{
	
    public ZipkinLoginPage(WebDriver selenium) {
        super(selenium);
        initialize(this);
    }
    public void enterCredentialsandLogin() throws InterruptedException {
        try {
        		WebDriver driver = BasePage.getDriver();
        		driver.get(ZipkinAppUtil.getBaseURL());
        		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        		
        		
        }
        catch (Exception e) {
            e.printStackTrace();
            
        }
    }

}