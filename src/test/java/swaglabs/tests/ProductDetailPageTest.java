package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.dataproviders.Constants;
import swaglabs.pages.ProductDetailPage;

public class ProductDetailPageTest extends TestBase {

    /**
     * Smoke test to validate that the Product Detail Page is correctly loading.
     */
    @Test
    public void productPageIsLoading() {
        Assert.assertTrue(login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD).clickOnProductTitle().isProductInformationDisplayed());
    }

    /**
     * Test to validate that the remove button is displayed once a product is added.
     */
    @Test
    public void clickingOnAddToCart() {
        ProductDetailPage prodDetail = new ProductDetailPage(driver);

        login.loginProcess(Constants.VALID_USER, Constants.VALID_PASSWORD)
                .clickOnProductTitle()
                .addProductToCart();
        Assert.assertTrue(prodDetail.isRemoveButtonDisplayed());
    }

}
