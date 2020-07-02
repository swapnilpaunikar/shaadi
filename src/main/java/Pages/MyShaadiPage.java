package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyShaadiPage {

    AppiumDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@text='My Shaadi']")
    MobileElement myShaadiTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Connect Now']")
    MobileElement connectNow;

    @FindBy(xpath = "//android.widget.TextView[@text='Premium Matches (999+)']")
    MobileElement premiumMatches;

    @FindBy(xpath = "//android.widget.TextView[@text='New Matches (999+)']")
    MobileElement newMatches;

    @FindBy(xpath = "//android.widget.Button[@text='Send Message']")
    MobileElement sendMessage;


    // constructor method
    // params - driver - instance of driver
    public MyShaadiPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement myShaadiTab() {

        return myShaadiTab;
    }

    public WebElement connectNow() {

        return connectNow;
    }

    public WebElement premiumMatches() {

        return premiumMatches;
    }

    public WebElement newMatches() {

        return newMatches;
    }

    public WebElement sendMessage() {

        return sendMessage;
    }

}
