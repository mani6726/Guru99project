$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/PaymentGateway.feature");
formatter.feature({
  "name": "Payment Gateway",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify payment page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should be in payment page",
  "keyword": "Given "
});
formatter.step({
  "name": "The user click buy button it should navigate to payment process",
  "keyword": "When "
});
formatter.step({
  "name": "the user fill in the card details \u003c\"Card Number\"\u003e,\u003c\"Expiration Month\"\u003e,\u003c\"Expiration Year\"\u003e,\u003c\"CVV Code\"\u003e and click pay",
  "keyword": "When "
});
formatter.step({
  "name": "it should display payment successful message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Card Number",
        "Expiration Month",
        "Expiration Year",
        "CVV Code"
      ]
    },
    {
      "cells": [
        "4857644879916006",
        "02",
        "2028",
        "227"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify payment page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be in payment page",
  "keyword": "Given "
});
formatter.match({
  "location": "PaymentGatewaySteps.the_user_should_be_in_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click buy button it should navigate to payment process",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentGatewaySteps.the_user_click_buy_button_it_should_navigate_to_payment_process()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fill in the card details \u003c\"Card Number\"\u003e,\u003c\"Expiration Month\"\u003e,\u003c\"Expiration Year\"\u003e,\u003c\"CVV Code\"\u003e and click pay",
  "keyword": "When "
});
formatter.match({
  "location": "PaymentGatewaySteps.the_user_fill_in_the_card_details_and_click_pay(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should display payment successful message",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentGatewaySteps.it_should_display_payment_successful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});