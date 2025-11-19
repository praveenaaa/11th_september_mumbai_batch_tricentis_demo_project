package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DesktopsPage extends BasePage {


	// selector for first "Add to cart" for desktop item (keeps original xpath from your combined class)
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div/form/div/div[1]/div[2]/div[8]/div/input[2]")
	private WebElement addToCartFirstDesktop;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	private WebElement firstDesktopItem;


	@FindBy(className = "content")
	private WebElement itemAddedNotification;


	//public void selectFirstDesktop() { click(firstDesktopItem); }
	public void addFirstDesktopToCart() { click(addToCartFirstDesktop); }
	public String getItemAddedMessage() { return getText(itemAddedNotification); }
	public void selectFirstDesktop() {
		
		// TODO Auto-generated method stub
		click(firstDesktopItem);
	}
}

