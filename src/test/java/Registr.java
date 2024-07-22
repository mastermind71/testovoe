import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class Registr {
    private WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Test
    public void registration(){
        MainPage mainPage = new MainPage(driver);
        mainPage.registration();
    }
}
