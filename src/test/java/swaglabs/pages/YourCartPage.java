package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the "Your cart" page, its related elements and methods to interact with the page.
 */
public class YourCartPage {

    private WebDriver driver;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(className = "cart_list")
    private WebElement carListContainer;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Clicks on checkout button and goes to the checkout information page.
     */
    public CheckoutInformationPage clickOnCheckoutButton() {
        checkoutButton.click();
        return new CheckoutInformationPage(driver);
    }

    /**
     * Shows if the car list container is displayed or not on the Login Page.
     *
     * @return true if the car list container is displayed and false if it is not.
     */
    public boolean isCartListContainerDisplayed() {
        return carListContainer.isDisplayed();
    }

}
