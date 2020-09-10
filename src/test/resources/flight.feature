Feature: User should be able to search flight and select result

  Scenario: Login into the application with valid credentials
    Given Go to the yatra.com
    When search_for_the_flight "pune" "nagpur"
    Then choose best deal based on cheaper and less duration

  Examples:
  | Banglore |
  | Chennai  |
