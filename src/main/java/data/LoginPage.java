package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private final String idEmail = "field_email";
    private final String idPassword = "field_password";
    private final String xpathBottom = "//*[contains(@class,\"login-form-actions\")]/input";
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage isAuth(User user) {
        MainPage mainPage = new MainPage(driver);
        driver.findElement(By.id(idEmail)).sendKeys(user.getLogin());
        driver.findElement(By.id(idPassword)).sendKeys(user.getPassword());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath(xpathBottom)).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return mainPage;
    }
}
