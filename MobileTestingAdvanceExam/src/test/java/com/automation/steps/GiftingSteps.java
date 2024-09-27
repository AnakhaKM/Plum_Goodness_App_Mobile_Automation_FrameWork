package com.automation.steps;

import com.automation.pages.GiftingPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GiftingSteps {
    GiftingPage giftingPage = new GiftingPage();

    @When("user clicks on gifting option")
    public void userClicksOnGiftingOption() {
        giftingPage.clicksOnGifting();
    }

    @Then("verify gifting page is displayed")
    public void verifyGiftingPageIsDisplayed() {
        Assert.assertTrue(giftingPage.isGiftingPageDisplayed());
    }

    @When("user clicks on first product")
    public void userClicksOnFirstProduct()
    {
        giftingPage.clicksOnFirstProduct();
    }

    @And("user search for {string}")
    public void userSearchFor(String key) {
        giftingPage.searchForPinCode(ConfigReader.getConfigValue(key));
    }

    @And("user clicks on {string}")
    public void userClicksOn(String key) {
        giftingPage.clicksOnCheckButton(ConfigReader.getConfigValue(key));
    }

    @Then("verify estimated delivery date is displayed")
    public void verifyEstimatedDeliveryDateIsDisplayed() {
        Assert.assertFalse(giftingPage.isDeliveryDateDisplayed());
    }
}
