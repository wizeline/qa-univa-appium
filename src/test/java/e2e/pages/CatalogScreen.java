package e2e.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CatalogScreen extends BaseActions {
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'PRODUCTS')]")
    private WebElement catalogHeader;


    public CatalogScreen (AppiumDriver driver){
        super(driver);
    }

    public WebElement getCatalogHeader () {
        return this.catalogHeader;
    }
}
