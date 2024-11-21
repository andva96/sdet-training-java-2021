package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents the Checkout Information Page, its related elements and methods to interact with the page.
 */
public class CheckoutInformationPage {

    private WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(CheckoutInformationPage.class.getName());

    @FindBy(xpath = "//*[@class='checkout_info']/div/input")
    private List<WebElement> checkoutInfoContainer;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Fills the checkout form with a given data.
     *
     * @param firstName corresponds to user first name
     * @param lastName  corresponds to user last name
     * @param code      corresponds to zip or postal code
     */
    public void fillCheckoutInfoForm(String firstName, String lastName, String code) {
        try {
            if (checkoutInfoContainer.size() < 3) throw new IllegalStateException();
            checkoutInfoContainer.get(0).sendKeys(firstName);
            checkoutInfoContainer.get(1).sendKeys(lastName);
            checkoutInfoContainer.get(2).sendKeys(code);
        } catch (Exception e) {
            LOGGER.log(Level.INFO, "Exception was thrown", e);
        }
    }

    /**
     * Click on the continue button to go to the checkout overview page.
     */
    public CheckoutOverviewPage clickOnContinue() {
        continueButton.click();
        return new CheckoutOverviewPage(driver);
    }

}
