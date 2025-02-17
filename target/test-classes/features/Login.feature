Feature: Login Functionality

    Background: Open browser and website
        Given I open the browser and website "https://dev-testing.rekrut.site/"

    Scenario: Successful Login
        When I click on the login link
        And I enter "erica@maildrop.cc" and "12345678"
        Then I should see the home page