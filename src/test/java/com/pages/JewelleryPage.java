package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class JewelleryPage extends BasePage {
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[2]/div[3]/div[2]/input")
	private WebElement addToCartFirstJewellery;


	//public void addFirstJewelleryToCart() { click(addToCartFirstJewellery); }


	public void addFirstJewelleryToCart() {
		// TODO Auto-generated method stub
		click(addToCartFirstJewellery);
	}
}