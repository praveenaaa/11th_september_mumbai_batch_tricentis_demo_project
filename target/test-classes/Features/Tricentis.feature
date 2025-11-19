@DemoWebShop
Feature: Tricentis Demo Web Shop

  @OpenBrowser
  Scenario: Open Browser and Launch Application
    Given Open the  browser and launch the application


  ###################################################
  # 1. Unsuccessful Registration (Password mismatch)
  ###################################################
  @RegistrationFail
  Scenario: Registration with unmatched passwords
    Given User navigates to Registration page for password mismatch
    When user enters different passwords
    Then User gets Error message


  ###################################################
  # 2. Successful Registration
  ###################################################
  @RegistrationPass
  Scenario: Successful Registration
    Given User navigates to Registration page
    When User Enters gneder <gender> and  fname <fname> and lname <lname> and Email <email> and Password <password> and confirmpassword <cnfpassword >
    Then click on Register button


  ###################################################
  # 3. Login functionality
  ###################################################
  @LoginPass
  Scenario: Login functionality
    Given user navigates to LoginPage
    When I enter Username and Password
    Then login should be successful


  ###################################################
  # 4. Hover and Add Desktop to Cart
  ###################################################
  @HoverSearch1
  Scenario: Add desktop product to cart
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user hovers on Computers category and Clicks on Desktops
    When user clicks on Add to Cart for the first desktop
    Then user should be able to add the same item into cart and get confirmation message


  ###################################################
  # 5. Search with empty field – Alert
  ###################################################
  @HoverSearch
  Scenario: Search without entering any value
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar
    When user leaves the search bar empty and clicks on search button
    Then user should get the popup saying Please enter some search keyword


  ###################################################
  # 6. Search + Add Jewellery Item
  ###################################################
  @EnterKey
  Scenario: Search for a product and add jewellery item
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar, enters the required product and clicks on search button
    When user  clicks on Add to Cart for the first jewellry
    Then user should get notification


  ###################################################
  # 7. Remove Item from Cart
  ###################################################
  @Remove
  Scenario: Remove product from shopping cart
    Given user navigates to LoginPage
    When I enter Username and Password
    Given User navigates to shopping cart
    When user checks the checkbox of the product which is not required and click on update shopping cart
    Then user should be able to remove the product selected from the cart


  ###################################################
  # 8. Checkout Fail (Terms not accepted)
  ###################################################
  @CheckoutFail
  Scenario: Checkout without accepting terms of service
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar, enters the required product and clicks on search button
    When user  clicks on Add to Cart for the first jewellry
    Then user should get notification
    Given user navigates to the shopping cart
    When user clicks checkout button without checking the Terms of Service checkbox
    Then user should get popup saying Please accept the Terms of Service before the next step


  ###################################################
  # 9. Checkout Pass
  ###################################################
  @CheckoutPass
  Scenario: Check out from shopping cart page
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar, enters the required product and clicks on search button
    When user  clicks on Add to Cart for the first jewellry
    Then user should get notification
    Given user navigates to the shopping cart and clicks close button in warning box
    When user checks the checkbox to agree terms of service and clicks on checkout button
    Then user should be able to navigate to payment page


  ###################################################
  # 10. Payment Fail
  ###################################################
  @PaymentFail
  Scenario: Payment failure with empty card number field
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar, enters the required product and clicks on search button
    When user  clicks on Add to Cart for the first jewellry
    Then user should get notification
    Given user navigates to the shopping cart and clicks close button in warning box
    When user checks the checkbox to agree terms of service and clicks on checkout button
    Then user should be able to navigate to payment page
    Given user navigates to payment page and enters valid billing address, shipping address, shipping method and payment method as Credit card
    When user leaves the credit card number field empty and clicks continue button
    Then user should get the error message saying Wrong card number


  ###################################################
  # 11. Payment Pass
  ###################################################
  @PaymentPass
  Scenario: Successful payment
    Given user navigates to LoginPage
    When I enter Username and Password
    Given user navigates to serach  bar, enters the required product and clicks on search button
    When user  clicks on Add to Cart for the first jewellry
    Then user should get notification
    Given user navigates to the shopping cart and clicks close button in warning box
    When user checks the checkbox to agree terms of service and clicks on checkout button
    Then user should be able to navigate to payment page
    Given user navigates to payment page
    When user enters valid creditcard number
    Then user should be able to book the item and see the confirmation message

