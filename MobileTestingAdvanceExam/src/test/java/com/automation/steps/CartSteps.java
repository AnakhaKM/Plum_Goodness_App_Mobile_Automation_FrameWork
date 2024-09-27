package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @When("user clicks on add to cart icon")
    public void userClicksOnAddToCartIcon() {
        cartPage.clicksOnCartIcon();
    }

    @And("user clicks on delete icon")
    public void userClicksOnDeleteIcon() {
        cartPage.clicksOnDeleteIcon();

    }

    @And("user clicks on remove button")
    public void userClicksOnRemoveButton() {
        cartPage.clicksOnRemoveOption();

    }

    @Then("verify product successfully removed from cart")
    public void verifyProductSuccessfullyRemovedFromCart() {
       Assert.assertTrue(cartPage.isProductRemovedSuccessfully());
    }
}
