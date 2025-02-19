@order1
Feature: Login Functionality

    Background: Open browser and website
        Given I open the browser and website "https://dev-testing.rekrut.site/"

    Scenario: Successful Login
        When I click on the login link
        And I enter "<email>" and "<password>"
        Then I should see the home page

        Examples:
            | email             | password |
            | erica@maildrop.cc | 12345678 |