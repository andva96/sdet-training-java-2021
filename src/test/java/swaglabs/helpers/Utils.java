package swaglabs.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains some common methods used by the pages/tests.
 */
public class Utils {

    private WebDriver driver;

    @FindBy(className = "header_secondary_container")
    private WebElement currentPageTitle;

    public Utils(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Gets the String that corresponds to the title of the current page.
     *
     * @return the title of the current page.
     */
    public String getPageTitle() {
        return currentPageTitle.getText();
    }

    /**
     * Gets the String that corresponds to the URL of the current page.
     *
     * @return the URL of the current page.
     */
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

}
