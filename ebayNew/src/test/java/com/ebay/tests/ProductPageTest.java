package com.ebay.tests;

import com.ebay.base.BaseTest;
import com.ebay.pages.ProductPage;

import org.junit.jupiter.api.Test;

public class ProductPageTest extends BaseTest {
    @Test
    void searchMobilePhoneTest() {
        ProductPage productPage = new ProductPage(page);

        productPage.navigateTo("https://www.ebay.com/");
        productPage.searchForWallet();
        productPage.clickProduct();


    }


}