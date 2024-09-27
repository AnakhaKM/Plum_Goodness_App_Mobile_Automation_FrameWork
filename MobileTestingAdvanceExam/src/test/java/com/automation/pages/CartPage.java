package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='1']")
    WebElement cartIcon;

    @FindBy(xpath = "//android.view.View[@content-desc='1']//following-sibling::android.widget.ImageView")
    WebElement deleteIcon;

    @FindBy(xpath = "//android.view.View[@content-desc='remove']")
    WebElement removeButton;

    @FindBy(xpath = "//android.view.View[@content-desc='your cart is empty!']")
    WebElement cartEmptyMessage;

    public void clicksOnCartIcon() {
        cartIcon.click();
    }

    public void clicksOnDeleteIcon() {
        deleteIcon.click();
    }

    public void clicksOnRemoveOption() {
        removeButton.click();
    }

    public boolean isProductRemovedSuccessfully() {
        return cartEmptyMessage.isDisplayed();
    }
}
