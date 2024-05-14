@jobsearchinvalidjoblocation
Feature: Job Search
  As a job seeker
  I want to search for jobs on a NHS portal with incorrect job location
  So that I can find no location found message

Scenario: User search for a job by passing with incorrect job location
   Given I am a job seeker on NHS Jobs website for invalid location search
   When I enter incorrect location in search
   Then I should get no location found