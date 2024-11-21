package swaglabs.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import swaglabs.helpers.DriverHelper;
import swaglabs.helpers.Urls;
import swaglabs.pages.LoginPage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestBase {

    WebDriver driver;
    LoginPage login;
    private static final Logger LOGGER = Logger.getLogger(TestBase.class.getName());

    @BeforeMethod
    public void setDriver() {
        driver = DriverHelper.getDriver("chrome");
        login = new LoginPage(driver);
        driver.get(Urls.LOGIN_PAGE_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriver() {
        try {
            this.driver.close();
        } catch (NullPointerException e) {
            LOGGER.log(Level.INFO, "Driver is NULL", e);
        }
    }

}
