package lesson_16;

import org.openqa.selenium.WebDriver;

public class OplataUslugPage {
    private WebDriver driver;

    public OplataUslugPage(WebDriver driver) {
        this.driver = driver;
    }
    public String select_now = "//div[@class=\"select__wrapper\"]/button/span";
    public String phone_id ="connection-phone";
    public String sum_id = "connection-sum";
    public String email_id = "connection-emai";
}
