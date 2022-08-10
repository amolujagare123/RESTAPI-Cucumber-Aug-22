package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2SD {

    @Given("Billing Login page should be opened")
    public void billing_login_page_should_be_opened() {
        System.out.println("Billing Login page should be opened");
    }
    @When("I enter correct username and correct password on billing page")
    public void i_enter_correct_username_and_correct_password_on_billing_page() {
        System.out.println("I enter correct username and correct password on billing page");
    }
    @When("I click on login button on billing page")
    public void i_click_on_login_button_on_billing_page() {
        System.out.println("I click on login button on billing page");
    }
    @Then("I should be redirected to home page of billing application")
    public void i_should_be_redirected_to_home_page_of_billing_application() {
        System.out.println("I should be redirected to home page of billing application");
    }

    @When("I enter incorrect username and incorrect password on billing page")
    public void i_enter_incorrect_username_and_incorrect_password_on_billing_page() {
        System.out.println("I enter incorrect username and incorrect password on billing page");
    }
    @Then("I should get an error")
    public void i_should_get_an_error() {
        System.out.println("I should get an error");
    }

    @When("I dont enter username and password on billing page")
    public void i_dont_enter_username_and_password_on_billing_page() {
        System.out.println("I dont enter username and password on billing page");
    }
    @Then("I should get an another error")
    public void i_should_get_an_another_error() {
        System.out.println("I should get an another error");
    }

    @When("I enter {string} and {string} on billing page")
    public void iEnterAndOnBillingPage(String username, String password) {
        System.out.println("username="+username);
        System.out.println("password="+password);

    }



  /*  @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" on billing page$")
    public void i_enter_something_and_something_on_billing_page(String strArg1, String strArg2) throws Throwable {

    }*/
}
