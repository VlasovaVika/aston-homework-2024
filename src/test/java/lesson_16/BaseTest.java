package lesson_16;

import lesson_15.by.mts.OnlinePopolnenieLocators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.mts.by/");
        driver.findElement(By.id(OnlinePopolnenieLocators.BTN_COOKIE)).click();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
