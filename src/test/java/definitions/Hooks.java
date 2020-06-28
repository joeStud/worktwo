package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static AndroidDriver driver;

    @Before
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulador");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability("appPackage", "io.ionic.interessimpleycompuesto");
        capabilities.setCapability("appActivity", "io.ionic.interessimpleycompuesto.MainActivity");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\everis\\Documents\\Everis\\Informacion\\Appium\\work\\Two\\src\\test\\resources\\app\\Interés Simple y Compuesto.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public static void tearDow() {
        driver.quit();
    }
}
