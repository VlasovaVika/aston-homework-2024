package lesson_15.by.mts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.mts.by/");
        driver.findElement(By.id(OnlinePopolnenieObject.BTN_COOKIE)).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
