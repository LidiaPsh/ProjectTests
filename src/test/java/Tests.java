import data.LoginPage;
import data.MainPage;
import data.User;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class Tests {

    private final WebDriver driver = new ChromeDriver();
    private final LoginPage loginPage = new LoginPage(driver);
    private final User user = new User("79697115322", "doom800300", "Niki Niko");

    @Test
    public void myTest(){
        driver.get("https://ok.ru");
        assertTrue(loginPage.isAuth(user).intoMainPage(user));
    }

}
