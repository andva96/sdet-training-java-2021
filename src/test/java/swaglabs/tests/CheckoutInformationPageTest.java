package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Urls;
import swaglabs.helpers.Utils;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.CheckoutInformationPage;
import swaglabs.pages.NavigationPage;

public class CheckoutInformationPageTest extends TestBase {

    /**
     * Smoke test to validate that the checkout Info page is correctly loading.
     */
    @Test
    public void validateCheckoutInfoPageIsLoading() {
        NavigationPage cart = new NavigationPage(driver);
        Utils util = new Utils(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton();
        Assert.assertEquals(util.getPageTitle(), "CHECKOUT: YOUR INFORMATION");
    }

    /**
     * Test to validate the correct behavior on the checkout page - happy path.
     */
    @Test
    public void fillCheckoutInformation() {
        NavigationPage cart = new NavigationPage(driver);
        Utils util = new Utils(driver);
        CheckoutInformationPage info = new CheckoutInformationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton();
        info.fillCheckoutInfoForm(Constants.USER_FIRST_NAME, Constants.USER_LAST_NAME, Constants.USER_ZIP_CODE);
        info.clickOnContinue();
        Assert.assertEquals(util.getCurrentURL(), Urls.CHECKOUT_OVERVIEW_PAGE);
    }

}
