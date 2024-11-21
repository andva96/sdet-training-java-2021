package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Urls;
import swaglabs.helpers.Utils;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.NavigationPage;

public class YourCartPageTest extends TestBase {

    /**
     * Smoke test to validate you cart page is correctly loading.
     */
    @Test
    public void yourCartPageIsLoading() {
        Utils util = new Utils(driver);
        NavigationPage cart = new NavigationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon();
        Assert.assertEquals(util.getPageTitle(), "YOUR CART");
    }

    /**
     * Smoke test to validate if product info container is displayed.
     */
    @Test
    public void productInformationIsLoaded() {
        NavigationPage cart = new NavigationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        Assert.assertTrue(cart.clickOnCartIcon().isCartListContainerDisplayed());
    }

    /**
     * Test to validate the correct behavior of the checkout button.
     */
    @Test
    public void validateCheckoutButton() {
        Utils util = new Utils(driver);
        NavigationPage cart = new NavigationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton();
        Assert.assertTrue(util.getCurrentURL().equalsIgnoreCase(Urls.YOUR_INFO_PAGE_URL));
    }

}
