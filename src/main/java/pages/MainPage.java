package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    public String username = "Dmitry";
    public String password = "qwerty123";
    private By buttonLogin = By.id("signin2");
    private By fieldUsername = By.xpath(".//input[@id='sign-username']");
    private By fieldPassword = By.xpath(".//input[@id='sign-password']");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void registration(){
        driver.findElement(buttonLogin).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(fieldUsername).sendKeys(username);
        driver.findElement(fieldPassword).sendKeys(password);
    }
}
