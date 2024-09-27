package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps
{
    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.userOpenApplication();
    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }


    @When("user search {string} in search bar")
    public void userSearchInSearchBar(String product) {
        homePage.searchProduct(ConfigReader.getConfigValue(product));
    }


}
