package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksSD {

    @Before ("@common") //("@invalid")
    public void beforeScenario()
    {
        System.out.println("*********** beforeScenario");
    }

    @After  ("@common") //("@invalid")
    public void afterScenario()
    {
        System.out.println("*********** afterScenario");
    }

   /* @Before ("@blank")
    public void beforeScenario2()
    {
        System.out.println("*********** beforeScenario2");
    }

    @After ("@blank")
    public void afterScenario2()
    {
        System.out.println("*********** afterScenario2");
    }*/
}
