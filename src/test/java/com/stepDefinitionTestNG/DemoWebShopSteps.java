package com.stepDefinitionTestNG;





//Corrected Step Definitions using POM + DriverManager + Hooks (FINAL VERSION)
//This version removes the constructor and depends on Hooks for page initialization.

import com.base.DriverManager;
import io.cucumber.java.en.*;
import utils.ConfigReader;
import utils.ExcelReader;

import com.pages.*;
import com.context.TestContext;

public class DemoWebShopSteps {

    public HomePage home;
    public LoginPage login;
    public RegisterPage register;
    public ComputersPage computers;
    public DesktopsPage desktops;
    public SearchPage search;
    public JewelleryPage jewellery;
    public ShoppingCartPage cart;
    public CheckoutPage checkout;
    public PaymentPage payment;
    public OrderConfirmationPage orderConfirm;

    // REQUIRED: default constructor
    public DemoWebShopSteps() {}

    // REQUIRED: PicoContainer constructor
//    public DemoWebShopSteps(Hooks hooks) {
//        hooks.steps = this;
//    }


	@Given("Open the  browser and launch the application")
	public void open_the_browser_and_launch_the_application() {
		DriverManager.getDriver().get("http://demowebshop.tricentis.com/");
	}


	/* -------------------- REGISTRATION FAIL -------------------- */

	@Given("User navigates to Registration page for password mismatch")
	public void user_navigates_to_Registration_page_for_password_mismatch() {
		TestContext.home.goToRegister();
		TestContext.register.selectGenderFemale();
		TestContext.register.enterFirstName("Indu");
		TestContext.register.enterLastName("b");
		TestContext.register.enterEmail("indu20212311@gmail.com");
	}

	@When("user enters different passwords")
	public void user_enters_different_passwords() {
		TestContext.register.enterPassword("Indubagweadi1");
		TestContext.register.enterConfirmPassword("Indu");
		TestContext.register.submitRegistration();
	}

	@Then("User gets Error message")
	public void user_gets_error_message() {
		System.out.println(TestContext.register.getPasswordError());
	}


	/* -------------------- REGISTRATION SUCCESS -------------------- */

	@Given("User navigates to Registration page")
	public void registration_page() {
		DriverManager.getDriver().get("http://demowebshop.tricentis.com/");
		TestContext.home.goToRegister();
	}

	@When("User Enters gneder <gender> and  fname <fname> and lname <lname> and Email <email> and Password <password> and confirmpassword <cnfpassword >")
	public void user_registration_details() {
		TestContext.register.selectGenderFemale();
		TestContext.register.enterFirstName("AnuPrasadana");
		TestContext.register.enterLastName("b");
		TestContext.register.enterEmail("anuprasadana@gmail.com");
		TestContext.register.enterPassword("haianuprasadana");
		TestContext.register.enterConfirmPassword("haianuprasadana");
		TestContext.register.submitRegistration();
	}

	@Then("click on Register button")
	public void click_on_register_button() {
		System.out.println("Registration successful");
	}


	/* -------------------- LOGIN hard coded data ------------------- */
//
//	@Given("user navigates to LoginPage")
//	public void user_navigates_to_LoginPage() throws Exception {
//		DriverManager.getDriver().get("http://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
//	}
//
//	@When("I enter Username and Password")
//	public void i_enter_username_and_password() {
//		TestContext.home.goToLogin();
//		TestContext.login.enterEmail("nishu@gmail.com");

//		TestContext.login.enterPassword("haihello");
//		TestContext.login.clickLogin();
//	}
//
//	@Then("login should be successful")
//	public void login_should_be_successful() {
//		System.out.println("Login successful");
//		DriverManager.quitDriver();
//	}
	
	/* -------------------- LOGIN with hardcoded data   ------------------- */

	
	/* -------------------- LOGIN with property file  ------------------- */
//	@Given("user navigates to LoginPage")
//	public void user_navigates_to_LoginPage() throws Exception {
//	    String url = ConfigReader.get("baseUrl");
//	    DriverManager.getDriver().get(url);
//	    Thread.sleep(3000);
//	}
//
//	@When("I enter Username and Password")
//	public void i_enter_username_and_password() {
//
//	    String username = ConfigReader.get("username");
//	    String password = ConfigReader.get("password");
//
//	    TestContext.home.goToLogin();
//	    TestContext.login.enterEmail(username);
//	    TestContext.login.enterPassword(password);
//	    TestContext.login.clickLogin();
//	}
//
//	@Then("login should be successful")
//	public void login_should_be_successful() {
//	    System.out.println("Login successful");
//	    DriverManager.quitDriver();
//	}
	/*======= -------------------- ended config property  --------------------======= */
	
	/*======= -------------------- getting data from excelfile  --------------------======= */
	
	@Given("user navigates to LoginPage")
	public void user_navigates_to_LoginPage() throws Exception {
	    DriverManager.getDriver().get("http://demowebshop.tricentis.com/");
	    Thread.sleep(3000);
	}

	@When("I enter Username and Password")
	public void i_enter_username_and_password() {

	    String filePath = "src\\test\\resources\\Exceldata\\Logindata.xlsx";

	    String username = ExcelReader.getCellData(filePath, "Login", 1, 0);
	    String password = ExcelReader.getCellData(filePath, "Login", 1, 1);

	    TestContext.home.goToLogin();
	    TestContext.login.enterEmail(username);
	    TestContext.login.enterPassword(password);
	    TestContext.login.clickLogin();
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	    System.out.println("Login successful");
	    DriverManager.quitDriver();
	}
	/*======= -------------------- getting data from excelfile ended here --------------------======= */
	
	

	/* -------------------- ADD DESKTOP -------------------- */

	@Given("user hovers on Computers category and Clicks on Desktops")
	public void hover_on_computers_click_desktops() {
		TestContext.home.hoverToComputersAndClick();
		
		TestContext.computers.clickDesktops();
	}

	@When("user clicks on Add to Cart for the first desktop")
	public void add_first_desktop() {
		TestContext.desktops.selectFirstDesktop();
		TestContext.desktops.addFirstDesktopToCart();
	}

	@Then("user should be able to add the same item into cart and get confirmation message")
	public void confirm_desktop_added() {
		System.out.println(TestContext.desktops.getItemAddedMessage());
	}


	/* -------------------- SEARCH EMPTY -------------------- */

	@Given("user navigates to serach  bar")
	public void navigate_to_search_bar() {
		System.out.println("User at search bar");
	}

	@When("user leaves the search bar empty and clicks on search button")
	public void click_search_empty() {
		TestContext.home.clickSearch();
	}

	@Then("user should get the popup saying Please enter some search keyword")
	public void alert_search_empty() {
		System.out.println(TestContext.search.acceptAlertAndGetText());
	}


	/* -------------------- ADD JEWELLRY -------------------- */

	@Given("user navigates to serach  bar, enters the required product and clicks on search button")
	public void search_product() {
		TestContext.home.enterSearch("Black & White Diamond Heart");
		TestContext.home.clickSearch();
	}

	@When("user  clicks on Add to Cart for the first jewellry")
	public void add_jewellery_item() {
		TestContext.jewellery.addFirstJewelleryToCart();
	}

	@Then("user should get notification")
	public void get_notification() {
		System.out.println(TestContext.search.getNotification());
	}


	/* -------------------- REMOVE FROM CART -------------------- */

	@Given("User navigates to shopping cart")
	public void navigate_to_cart() {
		TestContext.home.openShoppingCart();
	}

	@When("user checks the checkbox of the product which is not required and click on update shopping cart")
	public void remove_cart_item() {
		TestContext.cart.removeSelectedItem();
	}

	@Then("user should be able to remove the product selected from the cart")
	public void updated_cart() {
		System.out.println("Item removed");
	}


	/* -------------------- CHECKOUT FAIL -------------------- */

	@Given("user navigates to the shopping cart")
	public void checkout_fail_cart() {
		TestContext.home.openShoppingCart();
	}

	@When("user clicks checkout button without checking the Terms of Service checkbox")
	public void click_checkout_without_terms() {
		TestContext.cart.clickCheckout();
	}

	@Then("user should get popup saying Please accept the Terms of Service before the next step")
	public void terms_warning() {
		System.out.println(TestContext.cart.getTermsWarning());
	}


	/* -------------------- CHECKOUT PASS -------------------- */

	@Given("user navigates to the shopping cart and clicks close button in warning box")
	public void go_to_cart_warning_close() {
		TestContext.home.openShoppingCart();
	}

	@When("user checks the checkbox to agree terms of service and clicks on checkout button")
	public void agree_terms_and_checkout() {
		TestContext.cart.agreeTerms();
		TestContext.cart.clickCheckout();
	}

	@Then("user should be able to navigate to payment page")
	public void go_to_payment_page() {
		System.out.println("Payment page opened");
	}


	/* -------------------- PAYMENT FAIL -------------------- */

	@Given("user navigates to payment page and enters valid billing address, shipping address, shipping method and payment method as Credit card")
	public void payment_steps_before_info() {
		TestContext.checkout.continueBilling();
		TestContext.checkout.continueShipping();
		TestContext.checkout.continueShippingMethod();
	}
	//========================================================
	@Given("user navigates to payment page")
	public void user_navigates_to_payment_page_and_enters_valid_Credit_card_details() throws InterruptedException 
	{
		TestContext.payment.enterCardNumber("123456789123456789");
	}



	@When("user leaves the credit card number field empty and clicks continue button")
	public void empty_card_payment_continue() {
		TestContext.checkout.selectCreditCard();
		TestContext.checkout.continueToPaymentInfo();
		TestContext.payment.selectCardType("Visa");
		TestContext.payment.selectExpireMonth("03");
		TestContext.payment.selectExpireYear("2026");
		TestContext.payment.enterCardHolderName("Nischitha");
		TestContext.payment.enterCardCode("225");
		TestContext.payment.continueAfterCard();
	}


	@Then("user should get the error message saying Wrong card number")
	public void error_message99() {
		System.out.println("wrong card number");
	}

}