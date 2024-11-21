package swaglabs.helpers.dataproviders;

import org.testng.annotations.DataProvider;

/**
 * This class contains all data providers used for the Login Page.
 */
public class LoginDataProviders {

    @DataProvider(name = "validUsersAndPasswords")
    public Object[][] validLoginValues() {

        return new Object[][]
                {
                        {"standard_user", "secret_sauce"},
                        {"problem_user", "secret_sauce"},
                        {"performance_glitch_user", "secret_sauce"},
                };
    }

    @DataProvider(name = "invalidUsersAndPasswords")
    public Object[][] invalidLoginValues() {

        return new Object[][]
                {
                        {"random_user", "secret_sauce"},
                        {"locked_out_user", "secret_sauce"},
                        {"standard_user", " "},
                        {"standard_user", "bad_password"},
                };
    }
}
