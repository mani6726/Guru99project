package com.guru99.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	

	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\demo\\com.guru99\\src\\test\\resources\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
		return driver;
	}
	
	public static void loadUrl(String url){
		driver.get(url);
		
	}
	
	public static void send(WebElement element,String name){
		element.sendKeys(name);
		
	}
	
	public static String gettext(WebElement element) {
		return element.getText();
	}
	
	public static void btnClick(WebElement element){
		element.click();
		
	}
	
	public static void quitBrowser(){
		driver.quit();
		}


}
