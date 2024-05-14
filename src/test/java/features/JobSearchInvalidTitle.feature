@jobsearchinvalidjobtitle
Feature: Job Search
  As a job seeker
  I want to search for jobs on a NHS portal with incorrect job title
  So that I can find no result found message

Scenario: User search for a job by passing with incorrect job title
  Given I am a job seeker on NHS Jobs website for invalid job title search
  When I enter incorrect job title in search
  Then I should get no results found