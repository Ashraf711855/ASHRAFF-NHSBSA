package pages;
import utility.BrowserDriver;


import static org.junit.Assert.assertEquals;


public class HomePageNHS extends BrowserDriver {

    public static void get_nhs_home_page(){
        String get_title = driver.getTitle();
        assertEquals("Search for jobs in the NHS", get_title);

    }


}
