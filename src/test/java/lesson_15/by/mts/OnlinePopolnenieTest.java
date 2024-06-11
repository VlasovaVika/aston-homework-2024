package lesson_15.by.mts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class OnlinePopolnenieTest extends BaseTest{
    @Test
    @DisplayName("name of block")
    public void checkNameOfBlock(){
        Assertions.assertEquals("Онлайн пополнение\n" + "без комиссии",
                driver.findElement(By.xpath(OnlinePopolnenieObject.nameOfBlock)).getText());
    }
}
