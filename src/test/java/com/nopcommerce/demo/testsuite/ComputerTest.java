package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {

        computerPage.clickOnComputerTab();
        computerPage.clickOnDesktopTab();
        computerPage.clickOnPositionTab();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        computerPage.clickOnComputerMenu();
        computerPage.clickOnDesktopTabb();
        computerPage.clickOnPositionTabb();
        computerPage.clickOnAddToCart();
        //verify Build your own Computer Text
        String expectedText = "Build your own computer";
        String actualText = computerPage.verifyMessage();
        Assert.assertEquals(actualText, expectedText, "message is not displayed");
        computerPage.selectFirstOptionFromDropDown("2.2 GHz Intel Pentium Dual-Core E2200");
        computerPage.selectThirdOptionFromDropDown("8GB [+$60.00]");
        computerPage.clickOnRadioButton();
        computerPage.clickOnRadioButtonn();
        computerPage.clickOnCheckBox();
        //verify the price $1475
        String expectedText1 = "$1,475.00";
        String actualText1 = computerPage.verifyMessagee();
        // Assert.assertEquals(actualText1, expectedText1, "price not displayed");
        computerPage.setClickOnAddToCartButton();
        //Verify the Message
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = computerPage.verifyMessage1();
        Assert.assertEquals(actualText2, expectedText2, "Message not displayed");
        computerPage.clickOnCrossButton();
        computerPage.MouseHoverAndClickOnAddToCart();
        //	2.15 Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = computerPage.verifyMessage2();
        Assert.assertEquals(actualText3, expectedText3, "Message not displayed");
        //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
        computerPage.updateBasket();
        computerPage.updateOnShoppingCart();
        //	2.17 Verify the Total"$2,950.00"
        String expectedText4 = "$2,950.00";
        String actualText4 = computerPage.verifyMessage3();
        Assert.assertEquals(actualText4, expectedText4, "Message not displayed");
        //	2.18 click on checkbox “I agree with the terms of service”
        computerPage.checkBox();
        //	2.19 Click on “CHECKOUT”
        computerPage.checkOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = computerPage.verifyMessage4();
        Assert.assertEquals(actualText5, expectedText5, "Message not displayed");
        //	2.21 Click on “CHECKOUT AS GUEST” Tab
        computerPage.checkOutAsGuesttab();
        //	2.22 Fill the all mandatory field
        computerPage.enterFirstName("Ganpati");
        computerPage.enterLastName("Kailash");
        computerPage.enterEmailId("ganpati@gmail.com");
        computerPage.selectCounty("United Kingdom");
        computerPage.enterCityField("London");
        computerPage.enterAddress1("10 Downing St");
        computerPage.enterzipCode("OV16 7BH");
        computerPage.enterPhoneNumber("07900 200004");
        //	2.23 Click on “CONTINUE”
        computerPage.clickOnContinue();
        //	2.24 Click on Radio Button “Next Day Air($0.00)”
        computerPage.clickOOnRadioButton();
        //  2.25 Click on “CONTINUE”
        computerPage.clickOnContinuee();
        //  2.26 click Radio Button
        computerPage.clickOnButton();
        computerPage.selectCC();
        //  2.27 Select “Master card” From Select credit card dropdown
        computerPage.clickCardType();
        computerPage.selectMasterC("Master card");
        //  2.28 Fill all the details
        computerPage.selectCardHolderName("MR G K Patel");
        computerPage.enterCardNumber("0759 2136 2156 5987");
        computerPage.clickOnExpireMonth();
        computerPage.selecttExpireMonth("04");
        computerPage.clickOnExpireYear();
        computerPage.selecttExpireYear("2026");
        computerPage.enterCardCode("859");
        //  2.29 Click on “CONTINUE”
        computerPage.clickOnContinueee();
        //  2.30 Verify “Payment Method” is “Credit Card”
        String expectedText6 = "Payment Method:";
        String actualText6 = computerPage.verifyMessage5();
        Assert.assertEquals(actualText6, expectedText6, "Message not displayed");

        String expectedText7 = "Credit Card";
        String actualText7 = computerPage.verifyMessage6();
        Assert.assertEquals(actualText7, expectedText7, "Message not displayed");

        //  2.31 Verify “Shipping Method” is “Next Day Air”
        String expectedText8 = "Shipping Method:";
        String actualText8 = computerPage.verifyMessage7();
        Assert.assertEquals(actualText8, expectedText8, "Message not displayed");

        String expectedText9 = "Next Day Air";
        String actualText9 = computerPage.verifyMessage8();
        Assert.assertEquals(actualText9, expectedText9, "Message not displayed");

        //	2.32 Verify Total is “$2,950.00”
        String expectedText10 = "$2,950.00";
        String actualText10 = computerPage.verifyMessage9();
        Assert.assertEquals(actualText10, expectedText10, "Message not displayed");

        //	2.33 Click on “CONFIRM”
        computerPage.clickOnConfirm();

        //	2.34 Verify the Text “Thank You”
        String expectedText11 = "Thank you";
        String actualText11 = computerPage.verifyMessage10();
        Assert.assertEquals(actualText11, expectedText11, "Message not displayed");

        //	2.35 Verify the message “Your order has been successfully processed!”
        String expectedText12 = "Your order has been successfully processed!";
        String actualText12 = computerPage.verifyMessage11();
        Assert.assertEquals(actualText12, expectedText12, "Message not displayed");

        //	2.36 Click on “CONTINUE”
        computerPage.clickOnConttinue();

        //  2.37 Verify the text “Welcome to our store”
        String expectedText13 = "Welcome to our store";
        String actualText13 = computerPage.verifyMessage12();
        Assert.assertEquals(actualText13, expectedText13, "Message not displayed");







    }


}
