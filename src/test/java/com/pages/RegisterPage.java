package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {


	@FindBy(id = "gender-female") private WebElement genderFemale;
	@FindBy(id = "FirstName") private WebElement firstName;
	@FindBy(id = "LastName") private WebElement lastName;
	@FindBy(id = "Email") private WebElement email;
	@FindBy(id = "Password") private WebElement password;
	@FindBy(id = "ConfirmPassword") private WebElement confirmPassword;
	@FindBy(id = "register-button") private WebElement registerButton;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/span[2]/span")
	private WebElement pwdError;
	@FindBy(id = "register-button") private WebElement regPass;



	public void selectGenderFemale() {
		// TODO Auto-generated method stub
		click(genderFemale); 
	}
	public void enterFirstName(String fn) { type(firstName, fn); }
	public void enterLastName(String ln) { type(lastName, ln); }
	public void enterEmail(String em) { type(email, em); }
	public void enterPassword(String pwd) { type(password, pwd); }
	public void enterConfirmPassword(String cp) { type(confirmPassword, cp); }
	public void submitRegistration() { click(registerButton); }
	public String getPasswordError() { return getText(pwdError); }
	
}

