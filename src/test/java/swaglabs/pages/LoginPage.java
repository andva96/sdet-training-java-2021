package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Login Page, its related elements and methods to interact with the page.
 */
public class LoginPage {

    private WebDriver driver;

    @FindBy(className = "login_logo")
    private WebElement loginLogo;

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "h3[data-test='error']")
    private WebElement loginFailureMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Shows if the Login logo is displayed or not on the Login Page.
     *
     * @return true if the logo is displayed and false if it is not.
     */
    public boolean isLoginLogoDisplayed() {
        return loginLogo.isDisplayed();
    }

    /**
     * This method sends a user and password in order to log into the web site.
     *
     * @param username is the user value to be used on the Login Page.
     * @param password is the password value to be used on the Login Page.
     */
    public ProductsPage loginProcess(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        return new ProductsPage(driver);
    }

    /**
     * Shows if the error message is displayed or not on the Login Page.
     *
     * @return true if the message is displayed and false if it is not.
     */
    public boolean isLoginErrorDisplayed() {
        return loginFailureMessage.isDisplayed();
    }

}
