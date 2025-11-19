package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;


public abstract class BasePage {
	protected WebDriver driver;
	protected WaitUtils wait;


	public BasePage() {
		this.driver = DriverManager.getDriver();
		this.wait = new WaitUtils(driver);
		PageFactory.initElements(driver, this);
	}


	protected void click(WebElement element) {
		wait.waitForClickable(element);
		element.click();
	}


	protected void type(WebElement element, String text) {
		wait.waitForVisible(element);
		element.clear();
		element.sendKeys(text);
	}


	protected String getText(WebElement element) {
		wait.waitForVisible(element);
		return element.getText();
	}
}
