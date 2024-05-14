package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePageNHS.get_nhs_home_page;
import static pages.SearchInvalidJobLocation.search_invalid_job_location;
import static pages.SearchInvalidJobLocation.search_result_invalid_job_location;

public class JobSearchInvalidLocation {
    @Given("I am a job seeker on NHS Jobs website for invalid location search")
    public void nhs_home_page_invalid_location() throws Throwable {
        get_nhs_home_page();
    }

    @When("I enter incorrect location in search")
    public void user_enter_invalid_job_location() throws Throwable {
        search_invalid_job_location();
    }

    @Then("I should get no location found")
    public void user_view_search_results() throws Throwable {
        search_result_invalid_job_location();
    }

}
