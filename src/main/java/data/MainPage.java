package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean intoMainPage(User user) {
        String getData = driver.findElement(By.xpath("//*[contains(@data-l,\"t,userPage\")]/div")).getText();
        if (getData.equals(user.getNameAndSurname())) {
            return true;
        }

        return false;
    }
}
