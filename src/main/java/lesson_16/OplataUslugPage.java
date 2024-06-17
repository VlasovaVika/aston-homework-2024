package lesson_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OplataUslugPage {
    private WebDriver driver;

    public OplataUslugPage(WebDriver driver) {
        this.driver = driver;
    }

    private String selectNow = "//div[@class=\"select__wrapper\"]/button/span";
    private String phoneId = "connection-phone";
    private String sumId = "connection-sum";
    private String emailId = "connection-email";
    private String domashnyiInternet = "//ul[@class=\"select__list\"]/li[2]";
    private String internetPhoneId = "internet-phone";
    private String rassrochka = "//ul[@class=\"select__list\"]/li[3]";
    private String scoreInstalmentId = "score-instalment";
    private String zadolzhennost = "//ul[@class=\"select__list\"]/li[4]";
    private String scoreArrears = "score-arrears";

    public String getTextVibranoiUslugi() {
        return driver.findElement(By.xpath(selectNow)).getText();
    }

    public String getAttributeOfPhone() {
        return driver.findElement(By.id(phoneId)).getAttribute("placeholder");
    }

    public String getAttributeSum() {
        return driver.findElement(By.id(sumId)).getAttribute("placeholder");
    }

    public String getAttributeEmail() {
        return driver.findElement(By.id(emailId)).getAttribute("placeholder");
    }

    public void clickSelectedNowBtn() {
        driver.findElement(By.xpath(selectNow)).click();
    }

    public void clickDomashnyiInternetBtn() {
        driver.findElement(By.xpath(domashnyiInternet)).click();
    }

    public String getAttributeInternetPhone() {
        return driver.findElement(By.id(internetPhoneId)).getAttribute("placeholder");
    }

    public void clickRassrochkaBtn() {
        driver.findElement(By.xpath(rassrochka)).click();
    }

    public String getAttributeScoreInstalment() {
        return driver.findElement(By.id(scoreInstalmentId)).getAttribute("placeholder");
    }

    public void clickZadolzhennostBtn() {
        driver.findElement(By.xpath(zadolzhennost)).click();
    }

    public String getAttributeScoreArrears() {
        return driver.findElement(By.id(scoreArrears)).getAttribute("placeholder");
    }
}
