package com.guru99.stepdefinition;

import com.guru99.resources.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass {
	
	@Before
	public static void browserLaunch() {
		BaseClass.getDriver();
	}
	
	@After
	public static void closeBrowser() {
		BaseClass.quitBrowser();
	}


}
