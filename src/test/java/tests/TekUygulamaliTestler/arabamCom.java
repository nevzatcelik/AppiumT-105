package tests.TekUygulamaliTestler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class arabamCom {


// Arabam kac para bolumune tiklayalim
// Aracimin fiyatini merak ediyorum bolumunetiklayalim
// Wolkswagen markasini secelim
// yil secimi yapalim
// model secimi yapalim
// govde tipini secelim
// yakit tipini secelim
// vites tipini secelim
// Versiyon secimi yapalim
// aracin km bilgilerini girelim
// aracin rengini secelim
// opsiyel donanim (varsa) seecelim
// degisen bilgisi ekleyerek tramer kaydi belirtelim
// aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
// uygulamayi kapatalim
AppiumDriver<MobileElement> driver;



    @BeforeTest
    public void setUp() throws MalformedURLException {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL2");
        cap.setCapability("platformVersion","10.0");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("appPackage","com.dogan.arabam");
        cap.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity");
        // cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\ahmet\\IdeaProjects\\T-105_Appium\\Apps\\Calculator_8.4 (503542421)_Apkpure.apk");


        driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @Test
    public void test01(){
        driver.activateApp("com.dogan.arabam");

// Arabam kac para bolumune tiklayalim
        MobileElement arabamKacPara=driver.findElement(By.id("com.dogan.arabam:id/tvPricePrediction"));
        arabamKacPara.click();
// Aracimin fiyatini merak ediyorum bolumunetiklayalim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.TextView[1]")).click();
// Wolkswagen markasini secelim
        TouchAction action=new TouchAction<>(driver);
        action.press(PointOption.point(551,1677))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(538,407)).release().perform();

       /* action.press(PointOption.point(538,407))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(551,1677)).release().perform();

                yani yukari dogru haraket etmek istersek de koordinatlar uzerinden yukardaki islemin tam tersi koordinatlarini
                girerek yukari kaydirma islemini gerceklestirmis oluruz
        */
        driver.findElement(By.xpath("//*[@text='Volkswagen']")).click();
// yil secimi yapalim
     driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[12]")).click();
// model secimi yapalim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]")).click();

        // govde tipini secelim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]")).click();

// yakit tipini secelim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")).click();
// vites tipini secelim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")).click();

// Versiyon secimi yapalim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")).click();

// aracin km bilgilerini girelim
        driver.findElement(By.id("com.dogan.arabam:id/et_km")).sendKeys("190000");
        driver.findElement(By.id("com.dogan.arabam:id/btn_price_prediction_submit")).click();
// aracin rengini secelim
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]")).click();
// opsiyel donanim (varsa) seecelim
        driver.findElement(By.id("com.dogan.arabam:id/btnNext")).click();
// degisen bilgisi ekleyerek tramer kaydi belirtelim
        driver.findElement(By.id("com.dogan.arabam:id/iv_B0501")).click();
        MobileElement sagOnKapi= driver.findElement(By.id("com.dogan.arabam:id/tvTitle"));
        String sagOnKapiCheck=sagOnKapi.getText();
        Assert.assertTrue(sagOnKapiCheck.contains("Sağ Ön Kapı"),"Sectiginiz kisim sag on kapi degil");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")).click();
       driver.findElement(By.id("com.dogan.arabam:id/cardView")).click();
       driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
        driver.findElement(By.id("com.dogan.arabam:id/btnNext")).click();

// aracimizin fiyatinin 500.000 tl den fazla oldugunu test edelim
   MobileElement aracFiyati=  driver.findElement(By.id("com.dogan.arabam:id/tvAveragePrice"));
   ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]
   String aracFiyatiCheck=aracFiyati.getText();
        System.out.println(aracFiyatiCheck);
   aracFiyatiCheck=aracFiyatiCheck.replaceAll(" TL","").replaceAll("\\D","");
        System.out.println(aracFiyatiCheck);
   Assert.assertTrue(Integer.parseInt(aracFiyatiCheck)>500000);

           // 595000
// uygulamayi kapatalim
        driver.closeApp();

    }
}

