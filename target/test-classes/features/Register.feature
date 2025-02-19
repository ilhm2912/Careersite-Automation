@order2
Feature: Register Functional

    Background: Open browser and website
        Given I open the browser and website "https://dev-testing.rekrut.site/"

    Scenario: Navigate to Register page
        When I click on the register link
        Then I should see the register page

# Scenario: Fill personal information section in the register page with photo and CV
#     When I upload profile photo "<photoPath>"
#     Then I upload CV "<cvPath>"

#     Examples:
#         | photoPath                                      | cvPath                               |
#         | /Users/ilham/Downloads/dummy-man-570x570-1.png | /Users/ilham/Downloads/cvsamples.pdf |


