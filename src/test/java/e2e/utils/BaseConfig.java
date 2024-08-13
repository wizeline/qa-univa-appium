package e2e.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseConfig {

    protected AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        UiAutomator2Options androidOptions = new UiAutomator2Options();
        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        androidOptions.setAutomationName("UIAutomator2");
        androidOptions.setPlatformName("Android");
        androidOptions.setPlatformVersion("14");
        androidOptions.setDeviceName("Pixel 5");
        androidOptions.setAppActivity("com.swaglabsmobileapp.MainActivity");
        androidOptions.setAppPackage("com.swaglabsmobileapp");
        androidOptions.setApp("/Users/eduardo.contreras/Downloads/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");

        driver = new AppiumDriver(url, androidOptions);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
