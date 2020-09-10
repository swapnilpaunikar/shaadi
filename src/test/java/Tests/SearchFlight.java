package Tests;

import BaseUtility.Browsers;
import BaseUtility.WebBaseUtility;
import Pages.FlightSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlight extends WebBaseUtility {

    private String url = "https://www.cleartrip.com/";
    FlightSearchPage searchPage = new FlightSearchPage(driver);


    @Given("^Go to the yatra.com")
    public void Go_to_the_yatra_com() throws Throwable {
        selectBrowser("CHROME");
        driver.get(url);

    }

    @When("^enter source and destination")
    public void search_for_the_flight(String source, String destination) throws Throwable {
        searchPage.enterSource(source);
        searchPage.enterDestination(destination);
        searchPage.selectDate();
        searchPage.clickSearch();
    }

    @Then("^choose best deal based on cheaper and less duration")
    public void pick_cheap_and_best_route_flight() throws Throwable {
        searchPage.clickOnResult();
    }

}

