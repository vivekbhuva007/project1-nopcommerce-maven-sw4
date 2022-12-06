package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation(){
        topMenuPage.selectMenu("Computers");
        topMenuPage.selectMenu("Electronics");
        topMenuPage.selectMenu("Apparel");
        topMenuPage.selectMenu("Digital downloads");
        topMenuPage.selectMenu("Books");
        topMenuPage.selectMenu("Jewelry");
        topMenuPage.selectMenu("Gift Cards");


    }
}


    
