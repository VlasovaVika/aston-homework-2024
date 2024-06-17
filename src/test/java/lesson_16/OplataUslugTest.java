package lesson_16;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OplataUslugTest extends BaseTest {
    @Test
    @DisplayName("first")
    public void testUslugSvyazi() {
        OplataUslugPage oplataUslugPage = new OplataUslugPage(driver);
        assertAll(
        ()->assertEquals("Услуги связи",
                driver.findElement(By.xpath(oplataUslugPage.select_now)).getText()),
        ()-> assertEquals("Номер телефона",
                driver.findElement(By.id(oplataUslugPage.phone_id)).getAttribute("placeholder"))
        );
    }
}
