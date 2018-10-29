package net.idt.svp.ui.webdriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @user bizadmin
 */

/**
 * It is in charged to instantiate a Chrome web driver.
 */
public class ChromeBrowser implements Browser {

     private WebDriver driver;

    /**
     * Initializes an instance of {@link ChromeBrowser}.
     */

    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
