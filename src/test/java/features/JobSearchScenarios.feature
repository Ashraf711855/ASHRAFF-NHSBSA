@jobsearch
Feature: Job Search
  As a job seeker
  I want to search for jobs on a NHS portal
  So that I can find relevant job opportunities

Scenario: User search for a job by passing both title,location and distance in job filter
    Given I am a job seeker on NHS Jobs website
    When I put search preference into the Search functionality
    Then I should get a list of jobs which matches my preferences
    And sort my search results with the newest Date Posted
