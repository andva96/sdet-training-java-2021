package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Utils;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.CheckoutInformationPage;
import swaglabs.pages.CheckoutOverviewPage;
import swaglabs.pages.NavigationPage;

public class CheckoutOverviewTest extends TestBase {

    /**
     * Smoke test to validate that the Checkout Overview page is correctly loading.
     */
    @Test
    public void checkoutOverviewPageLoading() {
        Utils util = new Utils(driver);
        NavigationPage cart = new NavigationPage(driver);
        CheckoutInformationPage info = new CheckoutInformationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton()
                .fillCheckoutInfoForm(Constants.USER_FIRST_NAME, Constants.USER_LAST_NAME, Constants.USER_ZIP_CODE);
        info.clickOnContinue();
        Assert.assertTrue(util.getPageTitle().equalsIgnoreCase("CHECKOUT: OVERVIEW"));
    }

    /**
     * Smoke test to validate that the Checkout info containers are correctly loading.
     */
    @Test
    public void validateCheckoutOverviewContainers() {
        CheckoutOverviewPage overview = new CheckoutOverviewPage(driver);
        NavigationPage cart = new NavigationPage(driver);
        CheckoutInformationPage info = new CheckoutInformationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton()
                .fillCheckoutInfoForm(Constants.USER_FIRST_NAME, Constants.USER_LAST_NAME, Constants.USER_ZIP_CODE);
        info.clickOnContinue();
        Assert.assertFalse(overview.areCheckoutOverviewContainersEmpty());
    }

}
