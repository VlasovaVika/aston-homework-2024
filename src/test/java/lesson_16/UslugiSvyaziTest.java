package lesson_16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UslugiSvyaziTest extends BaseTest {
    @Test
    @DisplayName("Uslugi svyazi")
    public void testButtonForPaymentOFCommunicationServices() {
        UslugiSvyaziPage uslugiSvyaziPage = new UslugiSvyaziPage(driver);
        uslugiSvyaziPage.sendPhoneAndSumAndClickContinue("10");
        uslugiSvyaziPage.openFrameAndFindLocatorWithPayDescription();
        assertAll(
                ()->assertEquals("10.00 BYN",uslugiSvyaziPage.getPayDescriptionCost()),
                ()->assertEquals("Оплатить 10.00 BYN",uslugiSvyaziPage.getPayBtnText()),
                ()->assertTrue(uslugiSvyaziPage.getPayDescriptionText().contains("297777777")),
                ()->assertEquals("Номер карты", uslugiSvyaziPage.getCreditCardNumberWhenEmpty()),
                ()->assertEquals("Срок действия",uslugiSvyaziPage.getSrokDeistviyaWhenEmpty()),
                ()->assertEquals("Имя держателя (как на карте)",uslugiSvyaziPage.getImyaDerzhatelyaWhenEmpty()),
                ()->assertEquals("CVC",uslugiSvyaziPage.getCvcWhenEmpty())
        );
    }
}
