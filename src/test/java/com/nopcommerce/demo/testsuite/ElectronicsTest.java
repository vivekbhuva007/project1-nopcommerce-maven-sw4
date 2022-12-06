package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void TestNameVerifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        //1.1 Mouse Hover on “Electronics”Tab
        electronicsPage.electronicsPage();
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.electronicsPage();
        electronicsPage.setMouseHooverOnCellPhone();

        //1.3 Verify the text “Cell phones
        String expectedMessage = "Cell phones";
        Assert.assertEquals(electronicsPage.cellPhone(), expectedMessage, "Message is not displayed");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics”Tab
        electronicsPage.electronicsPage();

        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.electronicsPage();
        electronicsPage.setMouseHooverOnCellPhone();
        //2.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        Assert.assertEquals(electronicsPage.cellPhone(), expectedMessage, "Message is not displayed");
        //2.4 Click on List View Tab
        electronicsPage.listView();
        //2.5 Click on product name “Nokia Lumia 1020” link
        electronicsPage.nokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedMessage2 = "Nokia Lumia 1020";
        Assert.assertEquals(electronicsPage.nokiaLumia1(), expectedMessage2, "Message is not displayed");
        //2.7 Verify the price “$349.00”
        String expectedMessage3 = "$349.00";
        Assert.assertEquals(electronicsPage.verifyText1$349(), expectedMessage3, "Message is not displayed");
        //2.8 Change quantity to 2
        electronicsPage.changeQuntity1();
        //2.9 Click on “ADD TO CART” tab
        electronicsPage.addToCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Topgreen Bar
        String expectedMessage4 = "The product has been added to your shopping cart";
        Assert.assertEquals(electronicsPage.message1(), expectedMessage4, "Message is not displayed");
        //After that close the bar clicking on the cross button.
        electronicsPage.closeButton();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        electronicsPage.clickOnShoppingCart();
        //2.12 Verify the message "Shopping cart"
        String expectedMessage5 = "Shopping cart";
        Assert.assertEquals(electronicsPage.verifyShoppingCart(), expectedMessage5);
        //2.13 Verify the quantity is 2


        //2.14 Verify the Total $698.00
        String expectedMessage6 = "$698.00";
        Assert.assertEquals(electronicsPage.totalText698(), expectedMessage6);
        // 2.15 click on checkbox “I agree with the terms of service”
        electronicsPage.checkBox();
        //2.16 Click on “CHECKOUT”
        electronicsPage.checkOut();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage7 = "Welcome, Please Sign In!";
        Assert.assertEquals(electronicsPage.welcomeMessage1(), expectedMessage7);

        //2.18 Click on “REGISTER” tab

        electronicsPage.registerTab();
        //2.19 Verify the text “Register”
        String expectedMessage8 = "Register";
        Assert.assertEquals(electronicsPage.registerText(), expectedMessage8);
        //2.20 Fill the mandatory fields
        electronicsPage.clickOnRadioButton();
        electronicsPage.enterFirstname("Prime");
        electronicsPage.enterLastname("Testing");
        electronicsPage.enterEmail1("test12@gmail.com");
        electronicsPage.enterPassword("william123");
        electronicsPage.enterConfirmPassword("william123");


        // 2.21 Click on “REGISTER” Button
        Thread.sleep(500);
        electronicsPage.registerButton1();
        //2.22 Verify the message “Your registration completed”
        String expectedText0 = "Your registration completed";
        String actualText0 = electronicsPage.verifyMessaage();
        Assert.assertEquals(actualText0, expectedText0, "Message not displayed");

        //2.23 Click on “CONTINUE” tab
        electronicsPage.continueB();
        //2.24 Verify the text “Shopping card”
        String expectedMessage10 = "Shopping cart";
        Assert.assertEquals(electronicsPage.shoppingCart1(), expectedMessage10);
        //2.25 click on checkbox “I agree with the terms of service”
        electronicsPage.setCheckBox2();
        //2.26 Click on “CHECKOUT”
        electronicsPage.checkout3();
        //2.27 Fill the Mandatory fields
        electronicsPage.enterCountry("United Kingdom");
        electronicsPage.enterCity("London");
        electronicsPage.enterAddress1("50 high RD");
        electronicsPage.enterZipPostalCode("Wd10 5td");
        electronicsPage.enterPhoneNumber("0700400700");


        //2.28 Click on “CONTINUE”
        electronicsPage.continue3();
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        electronicsPage.setRadiobutton1();
        // 2.30 Click on “CONTINUE”
        electronicsPage.continue4();
        //2.31 Select Radio Button 'Credit Card'
        electronicsPage.setRadiobutton2();
        electronicsPage.paymentMethodButton();
        //2.32 Select “Visa” From Select credit card dropdown
        electronicsPage.selectCreditCard("Visa");
        //2.33 Fill all the details
        electronicsPage.selectCardHolderName("xyz");
        electronicsPage.enterCardNumber("3252 7814 7648 5333");
        electronicsPage.selecttExpireMonth("01");
        electronicsPage.selecttExpireYear("2030");
        electronicsPage.enterCardCode("111");
        //2.34 Click on "Continue Checkout
        electronicsPage.clickOnCheckOut();
        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedText1 = "Credit Card";
        String actualText1 = electronicsPage.verifyMessage1();
        Assert.assertEquals(actualText1, expectedText1, "Message not displayed");
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedText2 = "2nd Day Air";
        String actualText2 = electronicsPage.verifyMessage2();
        Assert.assertEquals(actualText2, expectedText2, "Message not displayed");
        //2.37 Verify Total is “$698.00”
        String expectedText3 = "$698.00";
        String actualText3 = electronicsPage.verifyMessage3();
        Assert.assertEquals(actualText3, expectedText3, "Message not displayed");
        //2.38  Click on “CONFIRM”
        electronicsPage.clickOnConfirm();
        //2.39 Verify the text Thank You
        String expectedText4 = "Thank you";
        String actualText4 = electronicsPage.verifyMessage4();
        Assert.assertEquals(actualText4, expectedText4, "Message not displayed");
        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedText5 = "Your order has been successfully processed!";
        String actualText5 = electronicsPage.verifyMessage5();
        Assert.assertEquals(actualText5, expectedText5, "Message not displayed");
        //2.41 Click on “CONTINUE”
        electronicsPage.clickOnContinue();
        //2.42  Verify the text “Welcome to our store”
        String expectedText6 = "Welcome to our store";
        //String actualText6 = electronicsPage.verifyMessage5();
        //Assert.assertEquals(actualText6, expectedText6, "Message not displayed");
        //2.43 Click on “Logout” link
        electronicsPage.clickOnLogOut();
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String Url = driver.getCurrentUrl();
        Assert.assertEquals("https://demo.nopcommerce.com/",Url);

    }




}
