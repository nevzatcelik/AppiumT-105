package tests;

import Pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MobileSelector;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;

public class LoginTest {
    AppiumDriver<MobileElement> driver=Driver.getAppiumDriver();
    TouchAction action=new TouchAction<>(Driver.getAppiumDriver());
    LoginPage loginPage=new LoginPage();
    @Test
    public void loginTest() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.loginSayfaGecisleri();
        loginPage.girisYapButonu.click();
        loginPage.emailBox.click();
        loginPage.emailBox.sendKeys("testfort108@gmail.com");
        // action.press(PointOption.point(857,1545)).release().perform(); burasi action da klavye tiklamasi(koordinatlara gore)
        // Driver.getAppiumDriver().getKeyboard().pressKey("m"); // (klavye ile birlikte hazir getKeybord uzerinden press key ile string yollama) !! klavyenin acik olmasi gerekir
        loginPage.passwordBox.sendKeys("t108t108");
        action.press(PointOption.point(988,1700)).release().perform();
        loginPage.girisYapButonu.click();







    }
}
