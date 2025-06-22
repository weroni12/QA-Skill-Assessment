package com.ebay.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductPage {

    private final Page page;

    public ProductPage(Page page){
        this.page = page;
    }

    public void navigateTo(String url){
        page.navigate("https://www.ebay.com/");
    }
    public Locator searchBar() {
        return page.locator("//input[contains(@id,'gh-ac')]");
    }
    public Locator searchButton() {
        return page.locator("//button[contains(@id,'gh-search-btn')]");
    }
    public void searchForWallet() {
        searchBar().fill("Wallet");
        searchButton().click();
    }
    public Locator product(){
        return page.locator("(//span[contains(@class,'su-styled-text primary default')])[1]");
    }
    public void clickProduct() {
        product().click();
    }

}
