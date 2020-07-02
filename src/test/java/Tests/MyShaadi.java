package Tests;

import BaseUtility.MobileBaseUtility;
import Pages.LoginPage;
import Pages.MyShaadiPage;
import genralized_utillity.Log4j.Log;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MyShaadi extends MobileBaseUtility {

    private String username = "kitesxx@gmail.com";
    private String password = "roshani@123";

    /*
     * Summary:
     * 1. Login to Andriod app
     * 2. Go to My Shaadi
     * 3. Verify the two widgets on My Shaadi page. (Premium Matches and New Matches)
     * 4. Send Connect to one profile from each widget.
     */
    @Test
    public void verifyMyShaadiPage() {

        Log.startTestCase("verifyMyShaadiPage");

        loginToShaadi();

        Log.info("Login to Shaadi.com application");

        connectToMatches();

        Log.info("Connect to premium and New Matches");

        Log.endTestCase();

    }

    /*
     *This method will login to Shaadi.com application
     */
    public void loginToShaadi() {

        LoginPage login = new LoginPage(driver);
        login.enterUser().click();
        login.enterUser().sendKeys(username);
        login.hideKeyboard();
        login.enterPassword().click();
        login.enterPassword().sendKeys(password);
        login.hideKeyboard();
        login.loginToShaadi().click();
    }

    /*
     *This method will search an item and go to checkout page
     */
    public void connectToMatches() {

        MyShaadiPage myShaadiPage = new MyShaadiPage(driver);
        myShaadiPage.myShaadiTab().click();

        verticalSwipe("See All");
        Boolean premiumCondition = myShaadiPage.premiumMatches().isDisplayed();
        Assert.assertTrue(premiumCondition);
        myShaadiPage.connectNow().click();
        myShaadiPage.sendMessage().click();

        verticalSwipe("New Matches");
        Boolean newCondition = myShaadiPage.newMatches().isDisplayed();
        Assert.assertTrue(newCondition);
        myShaadiPage.connectNow().click();
        myShaadiPage.sendMessage().click();
    }

    /*
     * This will kill the application after test case completion
     */
    @AfterMethod
    public void teardown() {

        driver.closeApp();
    }
}
