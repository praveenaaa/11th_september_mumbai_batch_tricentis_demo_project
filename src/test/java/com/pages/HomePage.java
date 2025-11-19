package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	private WebElement registerLink;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	private WebElement loginLink;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	private WebElement computerMenu;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[3]/form/input[2]")
	private WebElement searchButtonTop;


	@FindBy(xpath = "//*[@id='small-searchterms']")
	private WebElement searchBar;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
	private WebElement globalSearchBtn;


	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")
	private WebElement shoppingCartLink;


	public void goToRegister() { click(registerLink); }
	public void goToLogin() { click(loginLink); }
	public void hoverToComputersAndClick() { click(computerMenu); }
	public void enterSearch(String keyword) { type(searchBar, keyword); }
	public void clickSearch() { click(globalSearchBtn); }
	public void openShoppingCart() { click(shoppingCartLink); }
}


