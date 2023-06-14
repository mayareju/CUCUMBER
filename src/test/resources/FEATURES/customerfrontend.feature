Feature: Customer FrontEnd

  Scenario Outline: Customer Front End
    Given User Launch Edge browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "<email>" and password as "<password>"
    And click login
    Then Page url should contain "dashboard"
    And close browser

    Examples: 
      | email                | password    |
      | user1@phptravels.com | demouser    |
      | user@phptravels.com  | demouser123 |
      | user@phptravelscom   | demouser123 |
      |                      | demouser    |
      | user@phptravels.com  |             |
      |                      |             |
      | user@phptravels.com  | demouser    |

  Scenario Outline: Agent Front End
    Given User Launch Edge browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "<email>" and password as "<password>"
    And click login
    Then Page url should contain "dashboard"
    And close browser

    Examples: 
      | email                 | password     |
      | agent1@phptravels.com | demoagent    |
      | agent@phptravels.com  | demoagent123 |
      | agent@phptravelscom   | demoagent123 |
      |                       | demoagent    |
      | agent@phptravels.com  |              |
      |                       |              |
      | user@phptravels.com   | demoagent    |
