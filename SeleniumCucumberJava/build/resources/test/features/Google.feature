Feature: Probar la búsqueda en Google

Scenario: Busco algo en Google
    Given I´m on the Google search page
    When I enter a search criteria
    And click on the search button
    Then the results matchs the criteria

