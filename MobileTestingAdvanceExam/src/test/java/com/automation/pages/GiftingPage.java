package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftingPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='bodycare']")
    WebElement bodyCare;

    @FindBy(xpath = "//android.view.View[@content-desc='makeup']")
    WebElement makeup;

    @FindBy(xpath = "//android.view.View[@content-desc='gifting']")
    WebElement gifting;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.View[1]/android.view.View/android.view.View")
    WebElement giftingLogo;

    @FindBy(xpath = "//android.view.View[contains(@content-desc,'products')]/following-sibling::android.view.View/android.view.View/android.view.View")
    WebElement firstProduct;


    @FindBy(xpath = "//android.view.View[@content-desc=\"check\"]//ancestor::android.widget.ImageView")
    WebElement pinCode;

    @FindBy(xpath = "//android.widget.ImageView[contains(@hint, 'check for delivery')]")
    WebElement pinCodeField;

    String xpathForCheck = "//android.view.View[@content-desc='%s']";

    @FindBy(xpath = "//android.widget.ImageView[contains(@hint, 'delivery')]")
    WebElement deliveryDate;

    public void clicksOnGifting() {
        int startX =makeup.getLocation().getX();
        int startY =makeup.getLocation().getY();

        int endX =bodyCare.getLocation().getX();
        int endY =bodyCare.getLocation().getY();

        scrollOrSwipe(startX,startY,endX,endY);

        gifting.click();

    }

    public boolean isGiftingPageDisplayed(){
        return  giftingLogo.isDisplayed();
    }


    public void clicksOnFirstProduct() {
        firstProduct.click();
    }

    public void searchForPinCode(String key) {
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        while (true){
            try {
             pinCode.isDisplayed();
             break;
            }
            catch (Exception e){
                scrollOrSwipe(width/2,height/2,width/2,0);
            }
        }

        pinCodeField.click();
        pinCodeField.sendKeys(key);

    }

    public void clicksOnCheckButton(String key) {
        WebElement checkButton = driver.findElement(By.xpath(String.format(xpathForCheck,key)));
        checkButton.click();
    }

    public boolean isDeliveryDateDisplayed() {
        String estimatedDate = deliveryDate.getAttribute("hint");
        System.out.println(estimatedDate);
        return deliveryDate.isDisplayed();
    }
}
