package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComputersPage extends BasePage {


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")
	                
	private WebElement desktopsLink;


	public void clickDesktops() { click(desktopsLink); }
}