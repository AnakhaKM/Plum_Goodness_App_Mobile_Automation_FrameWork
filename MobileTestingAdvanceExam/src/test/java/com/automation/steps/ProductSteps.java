package com.automation.steps;

import com.automation.pages.ProductPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify searched product  is displayed")
    public void verifySearchedProductIsDisplayed() {
        Assert.assertTrue(productPage.isSearchedProductDisplayed());
    }

    @When("user clicks on add to cart button of first product")
    public void userClicksOnAddToCartButtonOfFirstProduct() {
        productPage.clicksOnAddToCart();
    }

    @Then("verify product added to cart successfully")
    public void verifyProductAddedToCartSuccessfully() {
        Assert.assertTrue(productPage.isProductAddedCartSuccessfully());
    }



}
