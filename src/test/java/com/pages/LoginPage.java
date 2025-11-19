package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {


	@FindBy(id = "Email") private WebElement emailInput;
	@FindBy(id = "Password") private WebElement passwordInput;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	private WebElement loginButton;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div")
	private WebElement loginError;



	public void enterEmail(String em) {
		// TODO Auto-generated method stub
		type(emailInput, em); 
	}
	public void enterPassword(String pwd) { 
		type(passwordInput, pwd);
		}
	public void clickLogin() { 
		click(loginButton); 
		}
	public String getLoginError() {
		return getText(loginError);
		}
	
	
}