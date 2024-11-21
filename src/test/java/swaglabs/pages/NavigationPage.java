package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Navigation Bar, its related elements and methods to interact with the page.
 */
public class NavigationPage {

    private WebDriver driver;

    @FindBy(className = "shopping_cart_link")
    private WebElement cartIcon;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Gets the current number displayed on the cart icon.
     *
     * @return the string with the number that is currently displayed on the cart icon.
     */
    public String getCurrentNumberOnCartIcon() {
        return cartIcon.getText();
    }

    /**
     * Click on the cart icon to go to your cart page.
     */
    public YourCartPage clickOnCartIcon() {
        cartIcon.click();
        return new YourCartPage(driver);
    }

}
