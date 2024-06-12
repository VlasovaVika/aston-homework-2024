package lesson_15.by.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlinePopolnenieObject {
    private WebDriver driver;

    public OnlinePopolnenieObject(WebDriver driver) {
        this.driver = driver;
    }

    public String getNameOfBlock() {
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.NAME_OF_BLOCK)).getText();
    }
    public boolean checkVisibilityOfVisa(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_PARTNER_VISA)).isDisplayed();
    }
    public boolean checkVisibilityOfVerifiedByVisa(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_PARTNER_VERIFIED_BY_VISA)).isDisplayed();
    }
    public boolean checkVisibilityOfMastercard(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_PARTNER_MASTERCARD)).isDisplayed();
    }
    public boolean checkVisibilityOfMastercardSecureCode(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_PARTNER_MASTERCARD_SECURE_CODE)).isDisplayed();
    }
    public boolean checkVisibilityOfBelcard(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_PARTNER_BELCARD)).isDisplayed();
    }
    public void clickLinkOfPayingOrder(){
        driver.findElement(By.xpath(OnlinePopolnenieLocators.LINK_ABOUT_SERVICES)).click();
    }
    public String getTitleOfPageWithPayingOrder(){
        return driver.findElement(By.xpath(OnlinePopolnenieLocators.TITLE_OF_PAGE_PAYMENT_ORDER)).getText();
    }
    public void sendPhoneAndSumAndClickContinue(){
        driver.findElement(By.id(OnlinePopolnenieLocators.CONNECTION_PHONE_ID)).sendKeys("297777777");
        driver.findElement(By.id(OnlinePopolnenieLocators.CONNECTION_SUM_ID)).sendKeys("1");
        driver.findElement(By.xpath(OnlinePopolnenieLocators.BTN_CONTINUE)).click();
    }
}
