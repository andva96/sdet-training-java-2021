package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Utils;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.CheckoutInformationPage;
import swaglabs.pages.NavigationPage;

public class CheckoutCompletePageTest extends TestBase {

    /**
     * Smoke test to validate that the checkout Complete page is correctly loading.
     */
    @Test
    public void checkoutCompletePageLoading() {
        Utils util = new Utils(driver);
        NavigationPage cart = new NavigationPage(driver);
        CheckoutInformationPage info = new CheckoutInformationPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .addProductToCart();
        cart.clickOnCartIcon()
                .clickOnCheckoutButton()
                .fillCheckoutInfoForm(Constants.USER_FIRST_NAME, Constants.USER_LAST_NAME, Constants.USER_ZIP_CODE);
        info.clickOnContinue()
                .clickOnFinishButton();
        Assert.assertEquals(util.getPageTitle(), "CHECKOUT: COMPLETE!");
    }

}
