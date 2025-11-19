package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OrderConfirmationPage extends BasePage {


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
	private WebElement orderConfirmationMessage;


	public String getConfirmationMessage() { return getText(orderConfirmationMessage); }
}