package stepdefinition;

import io.cucumber.java.en.Given;

public class BackgroundSD {

    @Given("I open the browser")
    public void i_open_the_browser() {
        System.out.println("======== >>>>  I open the browser");
    }
    @Given("I maximize it")
    public void i_maximize_it() {
        System.out.println("======== >>>>  I maximize it");
    }

}
