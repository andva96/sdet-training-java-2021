package swaglabs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import swaglabs.helpers.Urls;
import swaglabs.helpers.Utils;
import swaglabs.helpers.dataproviders.LoginDataProviders;

public class LoginPageTest extends TestBase {

    /**
     * Smoke test to validate that the Login Page is correctly loading.
     */
    @Test
    public void loginPageIsLoading() {
        Assert.assertTrue(login.isLoginLogoDisplayed());
    }

    /**
     * Test to validate the correct behavior of the Login Page when using valid user & password.
     */
    @Test(dataProvider = "validUsersAndPasswords", dataProviderClass = LoginDataProviders.class)
    public void correctLoginDataDisplaysProductPage(String user, String password) {
        Utils util = new Utils(driver);

        login.loginProcess(user, password);
        Assert.assertTrue(util.getCurrentURL().equalsIgnoreCase(Urls.PRODUCTS_PAGE_URL));
    }

    /**
     * Test to validate the correct behavior of the Login Page when using invalid user & or password.
     */
    @Test(dataProvider = "invalidUsersAndPasswords", dataProviderClass = LoginDataProviders.class)
    public void incorrectLoginDataDisplaysErrorMessage(String user, String password) {
        login.loginProcess(user, password);
        Assert.assertTrue(login.isLoginErrorDisplayed());
    }

}
