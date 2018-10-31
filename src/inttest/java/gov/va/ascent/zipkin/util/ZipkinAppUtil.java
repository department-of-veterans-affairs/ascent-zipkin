package gov.va.ascent.zipkin.util;

import gov.va.ascent.test.framework.service.RESTConfigService;

public class ZipkinAppUtil {
	
	private ZipkinAppUtil() {

	}
	
	public static String getBaseURL() {
		return RESTConfigService.getBaseURL("data.'username'", "data.'password'");
		
	}
	public static String getBaseURLWithNoAuth() {
		return RESTConfigService.getInstance().getProperty("baseURL", true);		
	}

	
}
