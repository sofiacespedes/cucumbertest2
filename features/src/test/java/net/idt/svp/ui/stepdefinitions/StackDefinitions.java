package net.idt.svp.ui.stepdefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.idt.svp.ui.webdriver.ChromeBrowser;

/**
 * @user bizadmin
 */
public class StackDefinitions {
    //private WebDriver driver;
    private ChromeBrowser cb;

    private WebDriver driver;
    @Given("^an empty stack$")
    public void an_empty_stack() {
      /*  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://lostiempos.com"); */
      cb = new ChromeBrowser();
      driver = cb.getDriver();
      driver.get("http://lostiempos.com");

    }
}
