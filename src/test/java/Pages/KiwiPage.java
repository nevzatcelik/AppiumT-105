package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class KiwiPage {

    public KiwiPage(){
        PageFactory.initElements((WebDriver) Driver.getAppiumDriver(),this);
    }


    @FindBy(xpath = "//*[@text=\"Return\"]")
    public WebElement returnn;


}
