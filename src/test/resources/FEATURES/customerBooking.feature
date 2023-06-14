Feature: Customer FrontEnd Link Functionality

  Background: 
    Given User Launch Edge browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "user@phptravels.com" and password as "demouser"
    And click Login button
    Then Page url should contain "dashboard"

  Scenario: Customer click Booking Link functionality
    Given User Launch Edge browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "user@phptravels.com" and password as "demouser"
    And click Login button
    When user click on My Booking link
    Then page for booking url should contain "bookings"
    And user can click on view voucher button
    Then page for voucher url should contain "invoice"
    #And User click on Logout link
    And close browser

  Scenario: Customer click Add_Funds Link functionality
    Given User Launch Edge browser
    When user open url "https://phptravels.net/login"
    And User enters Email as "user@phptravels.com" and password as "demouser"
    And click Login button
    When user click on Add_Funds link
    Then page for add_funds url should contain "add_funds"
    And user can click on radio button as pay with paypal
    When user click on paynow button after verifyg USD 50
    Then page for paypal payment url should contain "paypal"
    And user click on back to invoice button
    When user accept the alert message
    Then navigate to add_funds page and url should contain "add_funds"
    #And User click on Logout link
    And close browser
