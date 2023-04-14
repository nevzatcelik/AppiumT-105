package tests.TekUygulamaliTestler;

import Pages.KiwiPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.Driver;

import java.security.PublicKey;
import java.time.Duration;

public class KiwiTest {
    KiwiPage page=new KiwiPage();

    AppiumDriver<MobileElement>driver=Driver.getAppiumDriver();
    TouchAction action=new TouchAction<>(Driver.getAppiumDriver());

    @Test
    public void kiwiTest(){

    driver.findElementByXPath("//*[@text='Continue as a guest']").click();
        for (int i=0; i<3; i++){
            action.press(PointOption.point(534,1681)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).release().perform();
        }
    driver.findElement(By.xpath("//*[@text=\"Return\"]")).click();
    driver.findElement(By.xpath("//*[@text=\"One way\"]")).click();
    driver.findElement(By.xpath("(//*[@text='Anywhere'])[1]")).click();
    driver.getKeyboard().pressKey("ohio");
    //driver.findElement(By.xpath("(//*[@class='android.view.View'])[3]")).sendKeys("ohio");
        // eger calismiyorsa getkeyboard methodu ile klavyemiz acikken press Key ile deger gonderebiliriz
    driver.findElement(By.xpath("(//*[@text='Ohio, United States'])[1]")).click();
    driver.findElement(By.xpath("(//*[@text='Choose'])[1]")).click();
    driver.findElement(By.xpath("(//*[@text='Anytime'])[1]")).click();

    action.press(PointOption.point(693,1104)).release().perform();
    driver.findElement(By.xpath("(//*[@text='Set date'])[1]")).click();
    driver.findElement(By.xpath("(//*[@text='Search'])[1]")).click();
        action.press(PointOption.point(531,1083)).release().perform();



    }
}
