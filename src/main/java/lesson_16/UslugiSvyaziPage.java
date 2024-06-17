package lesson_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UslugiSvyaziPage {
    private WebDriver driver;

    public UslugiSvyaziPage(WebDriver driver) {
        this.driver = driver;
    }
    private String connectionPhoneId = "connection-phone";
    private String connectionSumId = "connection-sum";
    private String btnContinue = "//button[text()='Продолжить']";
    private String payDescriptionText = "//span[contains(@class, 'pay-description__text')]";
    private String iframe = "//iframe[@class='bepaid-iframe']";
    private String payDescriptionCost = "//div[@class='pay-description__cost']/span";
    private String payBtn = "//div[@class='card-page__card']/button";
    private String creditCardNumber = "//div[@class=\"app-input ng-tns-c46-1\"]/div/div/label";
    private String srokDeistviya  = "//div[@class='app-input ng-tns-c46-4']/div/div/label";
    private String imyaDerzhatelya = "//div[@class=\"app-input ng-tns-c46-3\"]/div/div/label";
    private String cvc ="//div[@class='app-input ng-tns-c46-5']/div/div/label";
    private String mastercargLogo = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]/img[1]";
    private String visaLogo = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]/img[2]";
    private String belcardLogo = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]/img[3]";
    public void sendPhoneAndSumAndClickContinue(String sumOfByn) {
        driver.findElement(By.id(connectionPhoneId)).sendKeys("297777777");
        driver.findElement(By.id(connectionSumId)).sendKeys(sumOfByn);
        driver.findElement(By.xpath(btnContinue)).click();
    }

    public void openFrameAndFindLocatorWithPayDescription() {
        WebElement iframe = driver.findElement(By.xpath(this.iframe));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(payDescriptionText))));
    }

    public String getPayDescriptionText() {
        return driver.findElement(By.xpath(payDescriptionText)).getText();
    }

    public String getPayDescriptionCost() {
        return driver.findElement(By.xpath(payDescriptionCost)).getText();
    }
    public String getPayBtnText(){
        return driver.findElement(By.xpath(payBtn)).getText();
    }
    public String getCreditCardNumberWhenEmpty(){
        return driver.findElement(By.xpath(creditCardNumber)).getText();
    }
    public String getSrokDeistviyaWhenEmpty(){
        return driver.findElement(By.xpath(srokDeistviya)).getText();
    }
    public String getImyaDerzhatelyaWhenEmpty(){
        return driver.findElement(By.xpath(imyaDerzhatelya)).getText();
    }
    public String getCvcWhenEmpty(){
        return driver.findElement(By.xpath(cvc)).getText();
    }
    public boolean checkMastercardLogo(){
        return driver.findElement(By.xpath(mastercargLogo)).isDisplayed();
    }
    public boolean checkVisaLogo(){
        return driver.findElement(By.xpath(visaLogo)).isDisplayed();
    }
    public boolean checkBelcardLogo(){
        return driver.findElement(By.xpath(belcardLogo)).isDisplayed();
    }
}
