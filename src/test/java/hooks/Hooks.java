package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BrowserDriver;

public class Hooks {

    public  static BrowserDriver driver;
    @Before
    public void setup() {
        BrowserDriver.invokedriver("chrome");

    }
    @After
    public void teardown() throws InterruptedException {
        driver.close();
    }

}
