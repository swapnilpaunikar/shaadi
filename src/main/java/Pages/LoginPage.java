package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    AppiumDriver driver;

    @FindBy(xpath = "//android.widget.EditText[@text='Mobile No. / Email ID']")
    MobileElement username;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    MobileElement password;

    @FindBy(xpath = "//android.widget.Button[@text='Login']")
    MobileElement signInButton;


    // constructor method
    // params - driver - instance of driver
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement enterUser() {

        return username;
    }

    public WebElement enterPassword() {

        return password;
    }

    public WebElement loginToShaadi() {

        return signInButton;
    }

    public void hideKeyboard(){

        driver.hideKeyboard();
    }

}
