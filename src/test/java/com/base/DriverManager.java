package com.base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {
	private static WebDriver driver;


	private DriverManager() {}


	public static WebDriver getDriver() {
		if (driver == null) {
			
			// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


			driver.manage().window().maximize();
			
		}
		return driver;
	}


	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}