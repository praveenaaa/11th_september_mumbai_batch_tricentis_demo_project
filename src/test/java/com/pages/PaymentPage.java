package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PaymentPage extends BasePage {


	@FindBy(id = "CardNumber") private WebElement cardNumber;
	@FindBy(xpath = "//*[@id='CreditCardType']") private WebElement cardType;
	@FindBy(xpath = "//*[@id='ExpireMonth']") private WebElement expireMonth;
	@FindBy(xpath = "//*[@id='ExpireYear']") private WebElement expireYear;
	@FindBy(name = "CardholderName") private WebElement cardHolderName;
	@FindBy(name = "CardCode") private WebElement cardCode;
	@FindBy(xpath = "//*[@id='payment-info-buttons-container']/input") private WebElement cardContinue;
	@FindBy(xpath = "//*[@id='checkout-payment-info-load']/div/div/div[2]/div/ul/li") private WebElement cardError;
	@FindBy(xpath = "//*[@id='confirm-order-buttons-container']/input") private WebElement confirmOrderBtn;


	public void enterCardNumber(String num) { type(cardNumber, num); }
	public void selectCardType(String type) { type(cardType, type); }
	public void selectExpireMonth(String m) { type(expireMonth, m); }
	public void selectExpireYear(String y) { type(expireYear, y); }
	public void enterCardHolderName(String name) { type(cardHolderName, name); }
	public void enterCardCode(String code) { type(cardCode, code); }
	public void continueAfterCard() { click(cardContinue); }
	public String getCardError() { return getText(cardError); }
	public void confirmOrder() { click(confirmOrderBtn); }
}