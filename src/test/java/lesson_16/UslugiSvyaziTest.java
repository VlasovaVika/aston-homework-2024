package lesson_16;

import lesson_15.by.mts.OnlinePopolnenieObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UslugiSvyaziTest extends BaseTest {
    @Test
    @DisplayName("Uslugi svyazi")
    public void testButtonForPaymentOFCommunicationServices() {
        UslugiSvyaziPage uslugiSvyaziPage = new UslugiSvyaziPage(driver);
        uslugiSvyaziPage.sendPhoneAndSumAndClickContinue("10");
        uslugiSvyaziPage.openFrameAndFindLocatorWithPayDescription();
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777",
                uslugiSvyaziPage.getPayDescriptionText());
    }
}
