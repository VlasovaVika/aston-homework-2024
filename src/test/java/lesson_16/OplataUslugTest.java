package lesson_16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OplataUslugTest extends BaseTest {
    @Test
    @DisplayName("Uslugi Svyazi")
    public void testUslugSvyazi() {
        OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
        assertAll(
                () -> assertEquals("Услуги связи",
                        oplataUslugPage.getTextVibranoiUslugi()),
                () -> assertEquals("Номер телефона",
                        oplataUslugPage.getAttributeOfPhone()),
                () -> assertEquals("Сумма",
                        oplataUslugPage.getAttributeSum()),
                () -> assertEquals("E-mail для отправки чека",
                        oplataUslugPage.getAttributeEmail())
        );
    }

    @Test
    @DisplayName("Domashniy Internet")
    public void testDomashnegoUnterneta() {
        OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
        oplataUslugPage.clickSelectedNowBtn();
        oplataUslugPage.clickDomashnyiInternetBtn();
        assertAll(
                () -> assertEquals("Домашний интернет",
                        oplataUslugPage.getTextVibranoiUslugi()),
                () -> assertEquals("Номер абонента",
                        oplataUslugPage.getAttributeInternetPhone()),
                () -> assertEquals("Сумма",
                        oplataUslugPage.getAttributeSum()),
                () -> assertEquals("E-mail для отправки чека",
                        oplataUslugPage.getAttributeEmail())
        );
    }

    @Test
    @DisplayName("Rassrochka")
    public void testRassrochki() {
        OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
        oplataUslugPage.clickSelectedNowBtn();
        oplataUslugPage.clickRassrochkaBtn();
        assertAll(
                () -> assertEquals("Рассрочка",
                        oplataUslugPage.getTextVibranoiUslugi()),
                () -> assertEquals("Номер счета на 44",
                        oplataUslugPage.getAttributeScoreInstalment()),
                () -> assertEquals("Сумма",
                        oplataUslugPage.getAttributeSum()),
                () -> assertEquals("E-mail для отправки чека",
                        oplataUslugPage.getAttributeEmail())
        );
    }

    @Test
    @DisplayName("Zadolzhennost")
    public void testZadolzhennosti() {
        OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
        oplataUslugPage.clickSelectedNowBtn();
        oplataUslugPage.clickZadolzhennostBtn();
        assertAll(
                () -> assertEquals("Задолженность",
                        oplataUslugPage.getTextVibranoiUslugi()),
                () -> assertEquals("Номер счета на 2073",
                        oplataUslugPage.getAttributeScoreArrears()),
                () -> assertEquals("Сумма",
                        oplataUslugPage.getAttributeSum()),
                () -> assertEquals("E-mail для отправки чека",
                        oplataUslugPage.getAttributeEmail())
        );
    }
}
