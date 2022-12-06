package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By computerClick = By.xpath("//ul[@class='top-menu mobile']/child::li[1]/a[1]");

    public void clickOnComputerTab() {
        clickOnElement(computerClick);
    }

    By deskTopClick = By.xpath("//div[@class='item-grid']/child::div[1]/div[1]/h2[1]");

    public void clickOnDesktopTab() {
        clickOnElement(deskTopClick);
    }

    By positionZToA = By.id("products-orderby");

    public void clickOnPositionTab() {
        clickOnElement(positionZToA);
    }

    By computerMenu = By.linkText("Computers");

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    By DeskTopClick = By.xpath("//h2//a[@title='Show products in category Desktops']");

    public void clickOnDesktopTabb() {
        clickOnElement(DeskTopClick);

    }

    By positionAToZ = By.id("products-orderby");

    public void clickOnPositionTabb() {
        clickOnElement(positionAToZ);

    }

    By addToCart = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    By verifyBuildyourowncomputer = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String verifyMessage() {
        return getTextFromElement(verifyBuildyourowncomputer);

    }

    By selectFirstOptionFromProcessor = By.id("product_attribute_1");

    public void selectFirstOptionFromDropDown(String option) {
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor, option);

    }

    By selectThirdOptionFromRam = By.id("product_attribute_2");

    public void selectThirdOptionFromDropDown(String option) {
        selectByVisibleTextFromDropDown(selectThirdOptionFromRam, option);
    }

    By clickOnRadioButtonFromHdd = By.id("product_attribute_3_7");

    public void clickOnRadioButton() {
        clickOnElement(clickOnRadioButtonFromHdd);
    }

    By clickOnRadioButtonFromOS = By.id("product_attribute_4_9");

    public void clickOnRadioButtonn() {
        clickOnElement(clickOnRadioButtonFromOS);
    }

    By checkTwoCheckBoxes = By.id("product_attribute_5_12");

    public void clickOnCheckBox() {
        clickOnElement(checkTwoCheckBoxes);
    }

    By verifyPrice = By.id("price-value-1");

    public String verifyMessagee() {
        return getTextFromElement(verifyPrice);
    }

    By clickOnAddToCartButton = By.id("add-to-cart-button-1");

    public void setClickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);
    }

    By verifyMessage1 = By.xpath("//div//p[contains(text(),'The product has been added to your ')]");

    public String verifyMessage1() {
        return getTextFromElement(verifyMessage1);
    }

    By clickOnCrossButton = By.xpath("//span[@title='Close']");

    public void clickOnCrossButton() {
        clickOnElement(clickOnCrossButton);
    }

    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnAddToCart1 = By.xpath("//button[contains(text(),'Go to cart')]");

    public void MouseHoverAndClickOnAddToCart() {
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
        clickOnElement(clickOnAddToCart1);


    }

    //	2.15 Verify the message "Shopping cart"
    By verifyMessage2 = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyMessage2() {
        return getTextFromElement(verifyMessage2);

    }

    //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By clickOnUpdateBasket = By.xpath("//input[@class='qty-input']");

    public void updateBasket() {

        clearAndEnterQuantity(clickOnUpdateBasket, "2");
    }

    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    public void updateOnShoppingCart() {
        clickOnElement(clickOnUpdateShoppingCart);
    }

    //	2.17 Verify the Total"$2,950.00"
    By verifyMessage3 = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyMessage3() {
        return getTextFromElement(verifyMessage3);

    }

    //	2.18 click on checkbox “I agree with the terms of service”
    By clickOnCheckBox = By.id("termsofservice");

    public void checkBox() {
        clickOnElement(clickOnCheckBox);
    }

    //	2.19 Click on “CHECKOUT”
    By clickOnCheckOut = By.id("checkout");

    public void checkOut() {
        clickOnElement(clickOnCheckOut);
    }

    //2.20 Verify the Text “Welcome, Please Sign In!”
    By verifyMessage4 = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String verifyMessage4() {
        return getTextFromElement(verifyMessage4);
    }

    //	2.21 Click on “CHECKOUT AS GUEST” Tab
    By checkOutAsAGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void checkOutAsGuesttab() {
        clickOnElement(checkOutAsAGuest);
    }
//	2.22 Fill the all mandatory field

    By firstNameField = By.id("BillingNewAddress_FirstName");

    public void enterFirstName(String name){
        sendTextToElement(firstNameField,name);
    }
    By lastNameField = By.id("BillingNewAddress_LastName");

    public void enterLastName(String name){
        sendTextToElement(lastNameField,name);
    }
    By emailField = By.id("BillingNewAddress_Email");
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    By selectCounty = By.id("BillingNewAddress_CountryId");
    public void selectCounty(String text){
        selectByVisibleTextFromDropDown(selectCounty,text);
    }

    By cityField = By.id("BillingNewAddress_City");

    public void enterCityField(String text){
        sendTextToElement(cityField,text);

    }
    By address1 = By.id("BillingNewAddress_Address1");
    public void enterAddress1(String text){
        sendTextToElement(address1,text);
    }
    By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    public void enterzipCode(String text){
        sendTextToElement(zipcode,text);
    }
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String text){
        sendTextToElement(phoneNumber,text);
    }
    By clickContinue = By.xpath("//button[@type='button' and @onclick='Billing.save()']");
    public void clickOnContinue(){
        clickOnElement(clickContinue);
    }
    By clickRadioButton = By.id("shippingoption_1");

    public void clickOOnRadioButton(){
        clickOnElement(clickRadioButton);

    }
    //  2.25 Click on “CONTINUE”
    By clickOnContinuee = By.xpath("//button[@type='button' and @onclick='ShippingMethod.save()']");

    public void clickOnContinuee(){
        clickOnElement(clickOnContinuee);
    }
    //  2.26 click Radio Button
    By radioButton = By.id("paymentmethod_1");
    public void clickOnButton(){
        clickOnElement(radioButton);
    }
    By selectCreditCard = By.xpath("//button[@type='button' and @onclick='PaymentMethod.save()']");

    public void selectCC(){
        clickOnElement(selectCreditCard);
    }
    //  2.27 Select “Master card” From Select credit card dropdown
    By selectMasterCard = By.id("CreditCardType");
    public void clickCardType(){
        clickOnElement(selectMasterCard);
    }
    By selectMC = By.id("CreditCardType");

    public void selectMasterC(String text) {
        selectByVisibleTextFromDropDown(selectMC, text);
    }
    //  2.28 Fill all the details
    By cardHolderName = By.id("CardholderName");

    public void selectCardHolderName(String text){
        sendTextToElement(cardHolderName,text);
    }
    By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String text){
        sendTextToElement(cardNumber,text);
    }
    By expireMonth = By.id("ExpireMonth");

    public void  clickOnExpireMonth() {
        clickOnElement(expireMonth);
    }
    By selectExpireMonth = By.id("ExpireMonth");
    public void selecttExpireMonth(String text){
        selectByVisibleTextFromDropDown(selectExpireMonth,text);
    }
    By expireYear = By.id("ExpireYear");

    public void  clickOnExpireYear() {
        clickOnElement(expireYear);
    }
    By selectExpireYear = By.id("ExpireYear");
    public void selecttExpireYear(String text){
        selectByVisibleTextFromDropDown(selectExpireYear,text);
    }
    By cardCode = By.xpath("//input[@id='CardCode']");

    public void enterCardCode(String text){
        sendTextToElement(cardCode,text);
    }
    //  2.29 Click on “CONTINUE”
    By clickOOOnContinue = By.xpath("//button[contains(@class,'payment-info-next-step-button')]");

    public void clickOnContinueee(){
        clickOnElement(clickOOOnContinue);
    }
    //  2.30 Verify “Payment Method” is “Credit Card”
    By verifyMessage5 = By.xpath("//span[contains(text(),'Payment Method:')]");

    public String verifyMessage5() {
        return getTextFromElement(verifyMessage5);
    }
    By verifyMessage6 = By.xpath("//span[contains(text(),'Credit Card')]");

    public String verifyMessage6() {
        return getTextFromElement(verifyMessage6);
    }
    //  2.31 Verify “Shipping Method” is “Next Day Air”
    By verifyMessage7 = By.xpath("//span[contains(text(),'Shipping Method:')]");

    public String verifyMessage7() {
        return getTextFromElement(verifyMessage7);
    }
    By verifyMessage8 = By.xpath("//ul//li//span[contains(text(),'Next Day Air')]");

    public String verifyMessage8() {
        return getTextFromElement(verifyMessage8);
    }
    //	2.32 Verify Total is “$2,950.00”
    By verifyMessage9 = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyMessage9() {
        return getTextFromElement(verifyMessage9);
    }
    //	2.33 Click on “CONFIRM”
    By clickonConfirm = By.xpath("//button[@type='button' and @onclick='ConfirmOrder.save()']");

    public void clickOnConfirm(){
        clickOnElement(clickonConfirm);
    }
    //	2.34 Verify the Text “Thank You”
    By verifyMessage10 = By.xpath("//h1[contains(text(),'Thank you')]");

    public String verifyMessage10() {
        return getTextFromElement(verifyMessage10);
    }
    //	2.35 Verify the message “Your order has been successfully processed!”
    By verifyMessage11 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyMessage11() {
        return getTextFromElement(verifyMessage11);
    }
    //	2.36 Click on “CONTINUE”

    By clickOnCon = By.xpath("//button[@type='button' and @onclick='setLocation(\"/\")']");

    public void clickOnConttinue(){
        clickOnElement(clickOnCon);

    }
    //  2.37 Verify the text “Welcome to our store”
    By verifyMessage12 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String verifyMessage12() {
        return getTextFromElement(verifyMessage12);
    }



}
