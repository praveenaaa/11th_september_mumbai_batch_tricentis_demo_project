package com.context;

import com.pages.*;
import com.base.DriverManager;

public class TestContext {
    public static HomePage home;
    public static LoginPage login;
    public static RegisterPage register;
    public static ComputersPage computers;
    public static DesktopsPage desktops;
    public static SearchPage search;
    public static JewelleryPage jewellery;
    public static com.pages.ShoppingCartPage cart;
    public static com.pages.CheckoutPage checkout;
    public static com.pages.PaymentPage payment;
    public static com.pages.OrderConfirmationPage orderConfirm;

    public static void initPages() {
        // ensure driver is initialized
        DriverManager.getDriver();
        home = new HomePage();
        login = new LoginPage();
        register = new RegisterPage();
        computers = new ComputersPage();
        desktops = new DesktopsPage();
        search = new SearchPage();
        jewellery = new JewelleryPage();
        cart = new com.pages.ShoppingCartPage();
        checkout = new com.pages.CheckoutPage();
        payment = new com.pages.PaymentPage();
        orderConfirm = new com.pages.OrderConfirmationPage();
    }
}
