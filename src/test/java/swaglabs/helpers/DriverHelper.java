package swaglabs.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * This class allows to set the different drivers for the different browsers that can be used in order to run tests.
 * The supplier interface is implemented using lambdas for the different Web drivers and are displayed on a hash map.
 */
public class DriverHelper {

    /*Lambdas implemented using Supplier interface for the different web Drivers */
    private static final Supplier<WebDriver> chromeSupplier = () -> {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        return new ChromeDriver();
    };

    private static final Supplier<WebDriver> firefoxSupplier = () -> {
        System.setProperty("webdriver.firefox.driver", "path");
        return new FirefoxDriver();
    };

    private static final Supplier<WebDriver> edgeSupplier = () -> {
        System.setProperty("webdriver.edge.driver", "path");
        return new EdgeDriver();
    };

    /*Implementation of a Hash map in order to assign the web drivers to the different browsers */
    private static final Map<String, Supplier<WebDriver>> driverMap = new HashMap<>();

    static {
        driverMap.put("chrome", chromeSupplier);
        driverMap.put("firefox", firefoxSupplier);
        driverMap.put("edge", edgeSupplier);
    }

    /**
     * This method allows to return a driver based on the browser selected.
     *
     * @param browser corresponds to the name of the browser (chrome, firefox, edge) and defines the web driver that will be used.
     * @return this method returns a configured-set web driver based on the browser selected
     */
    public static WebDriver getDriver(String browser) {
        return driverMap.get(browser).get();
    }

}
