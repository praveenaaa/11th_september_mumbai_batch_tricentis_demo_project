package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ShoppingCartPage extends BasePage {


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input")
	private WebElement removeCheckbox;


	@FindBy(name = "updatecart") private WebElement updateCart;


	@FindBy(id = "terms-of-service-warning-box") private WebElement termsWarningBox;


	@FindBy(id = "termsofservice") private WebElement termsCheckbox;
	@FindBy(id = "checkout") private WebElement checkoutButton;

	public void removeSelectedItem() {
		// TODO Auto-generated method stub
		click(removeCheckbox); 
		click(updateCart);
	}
	
	public String getTermsWarning() {
		return getText(termsWarningBox); 
		}
	public void agreeTerms() {
		click(termsCheckbox); 
		}
	public void clickCheckout() { 
		click(checkoutButton);
}
	
}