package steps;

import cucumber.api.java.en.*;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    //hacemos una instancia de la página de Google
    GooglePage google = new GooglePage();

    //Anotations de /Google.feature
    @Given("^I´m on the Google search page$")
    public void navigateToGoogle(){
        google.navigateToGoogle(); //abre una instancia del WebDriver que va a estar navegando a Google.
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        
    }

    @Then("^the results matchs the criteria$")
    public void resultsMatchsCriteria(){
        
    }
}
