package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePageNHS.get_nhs_home_page;
import static pages.SearchInvalidJobTitle.search_invalid_job_title;
import static pages.SearchInvalidJobTitle.search_result_invalid_job_title;

public class JobSearchInvalidTitle {
    @Given("I am a job seeker on NHS Jobs website for invalid job title search")
    public void nhs_home_page_invalid_title() throws Throwable {
        get_nhs_home_page();
    }

    @When("I enter incorrect job title in search")
    public void user_enter_incorrect_job_title() throws Throwable {
        search_invalid_job_title();
    }

    @Then("I should get no results found")
    public void user_view_search_results() throws Throwable {
        search_result_invalid_job_title();
    }

}
