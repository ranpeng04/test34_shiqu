package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RegisterTest {
    private AppiumDriver<AndroidElement> driver;

    @Before
    public void setUp() throws Exception {

        // 确定被测程序
        File classpathRoot = new File(System.getProperty("user.dir"));
       File appDir = new File(classpathRoot, "/src/main/java/apps");//app的目录
        File app = new File(appDir, "foodfun.apk");//app的名字,对应app的目录下的文件

        DesiredCapabilities capabilities = new DesiredCapabilities();
//        //不需要再次安装
//        capabilities.setCapability("noReset", true);
        //设置需要调试模拟器的名字
        capabilities.setCapability("deviceName","vivo X5S L");
        //设置模拟器的版本
        capabilities.setCapability("platformVersion","3.7.5.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.example.android.contactmanager");
        capabilities.setCapability("appActivity", ".ContactManager");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void registerTest(){
        WebElement el = driver.findElement(By.xpath(".//*[@text='Add Contact']"));
        el.click();
        TouchAction ta = new TouchAction(driver);

        //进入个人中心页面
        AndroidElement e11 = driver.findElementById("personal_btn_register");
        ta.press(e11);
        //点击“注册”按钮
        AndroidElement e12 = driver.findElementById("main_Tv_person");
        ta.press(e12);
        //用户账号
        driver.findElementById("register_userAccount").sendKeys("1443974302@qq.com");
        //密码
        driver.findElementById("register_userPassword").sendKeys("123456");
        //确认密码
        driver.findElementById("register_userCpassword").sendKeys("123456");
        //昵称
        driver.findElementById("register_userName").sendKeys("lzjm12345");
        //手机号
        driver.findElementById("register_userNum").sendKeys("15232179903");
        //注册
        AndroidElement e13 = driver.findElementById("register_Btn_register");
        ta.press(e13);

    }
    //  @Test
    public void moveToPoint(){
        driver.closeApp();

        AndroidElement foodfun=(AndroidElement)driver.findElementByName("foodfun");
        //  MobileElement notes=(MobileElement)driver.findElementByName("Notes");
        TouchAction operate = new TouchAction(driver);
        operate.press(foodfun).perform();
        operate.moveTo(driver.findElementByName("卸载")).release().perform();
        //  MobileElement ok=(MobileElement)driver.findElementByName("确定");
        AndroidElement confirm=(AndroidElement)driver.findElementByName("确定");
        confirm.click();

    }

}
