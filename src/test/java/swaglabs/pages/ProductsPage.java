package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * This class represents the Product results page, its related elements and methods to interact with the page.
 */
public class ProductsPage {

    private WebDriver driver;

    @FindBy(className = "title")
    private WebElement productPageTitle;

    @FindBy(className = "inventory_list")
    private List<WebElement> productPageResultsList;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Gets the String that corresponds to the title of the product page.
     *
     * @return the title of the product page.
     */
    public String getPageTitle() {
        return productPageTitle.getText();
    }

    /**
     * Shows if the results on the products page are empty or not.
     *
     * @return true is the results list is empty and false if it is not.
     */
    public boolean areProductPageResultsEmpty() {
        return productPageResultsList.isEmpty();
    }

    /**
     * Clicks on the title of the first product.
     */
    public ProductDetailPage clickOnProductTitle() {
        productPageResultsList.get(0).findElement(By.className("inventory_item_name")).click();
        return new ProductDetailPage(driver);
    }

    /**
     * Adds a product to the cart by clicking on the 'add to cart' button.
     */
    public void addProductToCart() {
        addToCartButton.click();
    }

}

