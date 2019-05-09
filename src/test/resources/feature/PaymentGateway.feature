
Feature: Payment Gateway

  
  Scenario Outline: To verify payment page
    Given The user should be in payment page
    When The user click buy button it should navigate to payment process
    When the user fill in the card details <"Card Number">,<"Expiration Month">,<"Expiration Year">,<"CVV Code"> and click pay     
    Then it should display payment successful message

    Examples: 
    |Card Number|Expiration Month|Expiration Year|CVV Code|
     |4857644879916006|02|2028|227|