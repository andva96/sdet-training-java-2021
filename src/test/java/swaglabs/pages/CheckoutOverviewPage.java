package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * This class represents the Checkout Overview Page, its related elements and methods to interact with the page.
 */
public class CheckoutOverviewPage {

    private WebDriver driver;

    @FindBy(className = "cart_list")
    private List<WebElement> cartListContainer;

    @FindBy(className = "summary_info")
    private List<WebElement> summaryInfoContainer;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Shows if the containers of the checkout overview page are empty or not on the Login Page.
     *
     * @return true if the containers are empty and false if they are not.
     */
    public boolean areCheckoutOverviewContainersEmpty() {
        return cartListContainer.isEmpty() && summaryInfoContainer.isEmpty();
    }

    /**
     * Clicks on the finish button to to go the checkout complete page.
     */
    public void clickOnFinishButton() {
        finishButton.click();
    }

}
