package Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements((WebDriver) Driver.getAppiumDriver(),this);

    }


    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public WebElement passwordBox;
    public void loginSayfaGecisleri(){
        TouchAction touchAction=new TouchAction<>(Driver.getAppiumDriver());
        for (int i=0; i<6; i++){
            touchAction.press(PointOption.point(924,968)).
                    waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(115,996)).release().perform();
        }
    }


}
