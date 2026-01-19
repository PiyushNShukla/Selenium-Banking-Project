package com.ibm.banking.hooks;

import org.openqa.selenium.Cookie;

import com.ibm.framework.config.ConfigReader;
import com.ibm.framework.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		DriverFactory.initDriver();
		 DriverFactory.getDriver().get(ConfigReader.get("baseUrl"));
	        Cookie bypassCookie = new Cookie(
	                "_vercel_share",
	                ConfigReader.get("vercelCookie")
	        );

	        DriverFactory.getDriver().manage().addCookie(bypassCookie);

	        // Refresh so cookie takes effect
	        DriverFactory.getDriver().navigate().refresh();
	}
	
	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
