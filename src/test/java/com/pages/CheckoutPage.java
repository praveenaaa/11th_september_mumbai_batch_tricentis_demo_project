package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage extends BasePage {


	@FindBy(xpath = "//*[@id='billing-buttons-container']/input") private WebElement billingContinue;
	@FindBy(xpath = "//*[@id='shipping-buttons-container']/input") private WebElement shippingContinue;
	@FindBy(xpath = "//*[@id='shipping-method-buttons-container']/input") private WebElement shippingMethodContinue;
	@FindBy(xpath = "//*[@id='paymentmethod_2']") private WebElement creditCardRadio;
	@FindBy(xpath = "//*[@id='payment-method-buttons-container']/input") private WebElement paymentMethodContinue;


	public void continueBilling() { click(billingContinue); }
	public void continueShipping() { click(shippingContinue); }
	public void continueShippingMethod() { click(shippingMethodContinue); }
	public void selectCreditCard() { click(creditCardRadio); }
	public void continueToPaymentInfo() { click(paymentMethodContinue); }
}