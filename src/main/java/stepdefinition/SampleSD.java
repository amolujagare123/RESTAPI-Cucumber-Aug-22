package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SampleSD {
  /*  @When("I enter correct username and correct password")
    public void iEnterCorrectUsernameAndCorrectPassword() {

    }

    @Given("Login page should be opened")
    public void loginPageShouldBeOpened() {
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
    }*/

    @Given("^Login page should be opened$")
    public void login_page_should_be_opened() throws Throwable {
        System.out.println("Login page should be opened");

    }

    @When("^I enter correct username and correct password$")
    public void i_enter_correct_username_and_correct_password() throws Throwable {
        System.out.println("I enter correct username and correct password");
    }

    @Then("^I should be redirected to home page$")
    public void i_should_be_redirected_to_home_page() throws Throwable {
        System.out.println("I should be redirected to home page");
        Assert.assertEquals(true,false,"this is not home page");
    }

    @And("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        System.out.println("I click on login button");
    }

}
