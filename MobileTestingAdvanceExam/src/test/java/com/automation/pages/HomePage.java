package com.automation.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_deny_button']")
    WebElement denyButton;

    @FindBy(xpath = "//android.view.View[@content-desc='skip']")
    WebElement skipButton;

    @FindBy(xpath = "//android.view.View[@content-desc='home']")
    WebElement homePage;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='search ']")
    WebElement searchBar;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchField;


    public void userOpenApplication() {
        waitForElementToBeClickable(denyButton);
        denyButton.click();
        waitForElementToBeClickable(skipButton);
        skipButton.click();
    }

    public boolean isHomePageDisplayed() {
      return  homePage.isDisplayed();
    }

    public void searchProduct(String key) {
        searchBar.click();
        searchField.click();
        searchField.sendKeys(key);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.ENTER).
                pause(1000).
                keyUp(Keys.ENTER).
                build().perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
