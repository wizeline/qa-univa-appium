package e2e.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseActions {
    @AndroidFindBy(accessibility = "test-Username")
    private WebElement userInput;

    @AndroidFindBy(xpath = "//*[@*='test-Password']")
    protected WebElement passwordInput;

    @AndroidFindBy(xpath = "//*[@text='LOGIN']")
    protected WebElement loginButton;

    public LoginScreen (AppiumDriver driver) {
        super(driver);
    }

    public void enterUserLogin(String username, String password) {
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
