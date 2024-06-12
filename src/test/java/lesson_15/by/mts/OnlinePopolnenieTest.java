package lesson_15.by.mts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class OnlinePopolnenieTest extends BaseTest {
    @Test
    @DisplayName("task 1 - name of block")
    public void checkNameOfBlock() {
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        Assertions.assertEquals("Онлайн пополнение\n" + "без комиссии",
                onlinePopolnenieObject.getNameOfBlock());
    }

    @Test
    @DisplayName("task 2 - visibility of logos")
    public void checkVisibilityOfLogos() {
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        assertAll(
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfVisa()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfVerifiedByVisa()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfMastercard()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfMastercardSecureCode()),
                () -> assertTrue(onlinePopolnenieObject.checkVisibilityOfBelcard())
        );
    }
    @Test
    @DisplayName("task 3 - link of payment order")
    public void testLink(){
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        onlinePopolnenieObject.clickLinkOfPayingOrder();
        Assertions.assertEquals("Порядок оплаты и безопасность интернет платежей",
                onlinePopolnenieObject.getTitleOfPageWithPayingOrder());
    }
    @Test
    @DisplayName("task 4 - services of communication")
    public void testButtonForPaymentOFCommunicationServices(){
        OnlinePopolnenieObject onlinePopolnenieObject = new OnlinePopolnenieObject(driver);
        onlinePopolnenieObject.sendPhoneAndSumAndClickContinue();
        //не нашла локатор стабильный для pay_description
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='gpay-card-info-iframe gpay-card-info-iframe-fade-in']"));


        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777",
                driver.findElement(By.xpath(OnlinePopolnenieLocators.PAY_DESCRIPTION_TEXT)).getText());
    }
}
