package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import utility.Log;

public class LoginSD {

    TestContext testContext;
    LoginPage loginPage;

    public LoginSD(TestContext testContext) {
        this.testContext = testContext;
    }

    @Given("the browser opens")
    public void the_browser_opens() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I enter URL's test web")
    public void i_enter_URL_s_test_web() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Page shows and credentials are asked")
    public void page_shows_and_credentials_are_asked() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("Im at login page")
    public void im_at_login_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("Valid credentials are entered")
    public void valid_credentials_are_entered() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("The welcome page shows successfully")
    public void the_welcome_page_shows_successfully() {
        // Write code here that turns the phrase above into concrete actions
    }

}
