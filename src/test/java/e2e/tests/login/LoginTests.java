package e2e.tests.login;

import e2e.pages.CatalogScreen;
import e2e.pages.LoginScreen;
import e2e.utils.BaseConfig;
import org.junit.Test;

public class LoginTests extends BaseConfig {

    @Test
    public void userLogin (){
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.enterUserLogin("standard_user", "secret_sauce");

        CatalogScreen catalogScreen = new CatalogScreen(driver);
        assert catalogScreen.isElementDisplayed(catalogScreen.getCatalogHeader());
    }
}
