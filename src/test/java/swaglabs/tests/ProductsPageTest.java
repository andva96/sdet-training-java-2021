package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Urls;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.NavigationPage;
import swaglabs.pages.ProductsPage;

public class ProductsPageTest extends TestBase {

    /**
     * Smoke test to validate that the Product Page is correctly loading.
     */
    @Test
    public void productPageIsLoading() {
        ProductsPage products = new ProductsPage(driver);

        Assert.assertEquals(login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD).getPageTitle(), "PRODUCTS");
        Assert.assertFalse(products.areProductPageResultsEmpty());
    }

    /**
     * Test to validate that clicking on a product title takes the user to the product details page.
     */
    @Test
    public void clickOnProductTitle() {
        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .clickOnProductTitle();
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(Urls.SAUCE_LABS_BACKPACK_URL));
    }

    /**
     * Test to validate that adding a product to the cart updates the number on the cart icon.
     */
    @Test
    public void addItemToCart() {
        NavigationPage cart = new NavigationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        Assert.assertTrue(cart.getCurrentNumberOnCartIcon().equalsIgnoreCase("1"));
    }

}
