package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By searchField = By.id("small-searchterms");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public void enterTextToSearchField(String text){
        sendTextToElement(searchField,"Mobile");
    }

}
