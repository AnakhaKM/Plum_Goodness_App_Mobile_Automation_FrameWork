package com.automation.pages;

import io.cucumber.java.en.Then;
import org.hamcrest.Factory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//android.view.View[@content-desc='sunscreen']")
    WebElement searchedProduct;

    @FindBy(xpath = "//android.view.View[@content-desc='add to cart']")
    List<WebElement> addToCartButton;

    @FindBy(xpath = "//android.view.View[@content-desc='1 items added']")
    WebElement successMessage;

    public boolean isSearchedProductDisplayed() {
        return searchedProduct.isDisplayed();
    }

    public void clicksOnAddToCart() {
        waitForElementToBeClickable(addToCartButton.get(0));
        addToCartButton.get(0).click();
    }

    public boolean isProductAddedCartSuccessfully() {
        return successMessage.isDisplayed();
    }
}
