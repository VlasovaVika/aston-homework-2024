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

    OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
    public String connectionPhoneId = "connection-phone";
    public String connectionSumId = "connection-sum";
    public String btnContinue = "//button[text()='Продолжить']";
    public String payDescriptionText = "//span[contains(@class, 'pay-description__text')]";
    public String iframe = "//iframe[@class='bepaid-iframe']";

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
}
