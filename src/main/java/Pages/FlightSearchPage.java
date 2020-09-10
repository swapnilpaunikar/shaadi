package Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FlightSearchPage {

    private WebDriver driver;

    @FindBy(id = "FromTag")
    public WebElement source;

    @FindBy(id = "ToTag")
    WebElement destination;

    @FindBy(id = "DepartDate")
    public WebElement datepicker;

    @FindBy(xpath = "//div[@class='bg-white ba bc-neutral-100 br-4 px-4 tp-box-shadow td-200 p-relative ow-tuple-container']//button[text()='Book']")
    WebElement result;

    @FindBy(xpath = "//div[@class='monthBlock first']//a[contains(@class,'ui-state-default')][contains(text(),'23')]")
    WebElement dateSelection;

    @FindBy(id = "SearchBtn")
    WebElement searchFlight;


    public FlightSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSource(String userName) {
        this.source.sendKeys(userName);
        this.source.sendKeys(Keys.ALT,Keys.TAB);
    }

    public void enterDestination(String password) {
        this.destination.sendKeys(password);
        this.destination.sendKeys(Keys.ALT,Keys.TAB);
    }

    public void selectDate() {

        datepicker.click();
        dateSelection.click();
    }

    public void clickSearch() {
        searchFlight.click();
    }

    public void clickOnResult() {
        result.click();
    }

}
