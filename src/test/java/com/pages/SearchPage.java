package com.pages;

import com.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage {


	@FindBy(xpath = "//*[@id='small-searchterms']") private WebElement searchBar;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[3]/form/input[2]") private WebElement searchButton;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input") private WebElement removeCheckBox;
	@FindBy(name = "updatecart") private WebElement updateCartBtn;
	@FindBy(xpath = "//*[@id='bar-notification']/p") private WebElement notification;


	public void searchFor(String keyword) { 
		type(searchBar, keyword); 
		click(searchButton); 
		}
	public void searchEmptyAndTriggerAlert() { 
		click(searchButton); 
		}
	public String getNotification() {
		return getText(notification); 
		}
	public void removeItemFromCart() {
		click(removeCheckBox); 
		click(updateCartBtn); 
		}


	public String acceptAlertAndGetText() {
		try {
			Alert al = driver.switchTo().alert();
			String txt = al.getText();
			al.accept();
			return txt;
		} catch (Exception e) {
			return null;
		}
	}
}