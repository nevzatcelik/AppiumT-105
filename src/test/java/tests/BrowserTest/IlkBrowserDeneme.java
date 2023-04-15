package tests.BrowserTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTestBrowser;
import utils.Driver;

public class IlkBrowserDeneme {

       AppiumDriver<WebElement>driver= BaseTestBrowser.getAppiumDriver();

    @Test
    public void browserTest(){

           driver.get("https://www.amazon.com");

    }
}
