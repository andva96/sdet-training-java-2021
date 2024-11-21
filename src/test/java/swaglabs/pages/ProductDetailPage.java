package swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class represents the Product  details  page, its related elements and methods to interact with the page.
 */
public class ProductDetailPage {

    private WebDriver driver;

    @FindBy(className = "inventory_details_img_container")
    private WebElement productImage;

    @FindBy(className = "inventory_details_desc_container")
    private WebElement productDetails;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement removeProductButton;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * Shows if the product information is displayed.
     *
     * @return true if the product info is displayed and false if it is not.
     */
    public boolean isProductInformationDisplayed() {
        return productImage.isDisplayed() && productDetails.isDisplayed();
    }

    /**
     * Adds a product to the cart by clicking on the add to cart button.
     */
    public void addProductToCart() {
        addToCartButton.click();
    }

    /**
     * Shows if the remove button is displayed.
     *
     * @return true if the remove product button is displayed and false if it is not.
     */
    public boolean isRemoveButtonDisplayed() {
        return removeProductButton.isDisplayed();
    }

}
