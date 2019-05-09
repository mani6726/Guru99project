package com.guru99.stepdefinition;

import com.guru99.objectrepository.PaymentGatewayPage;
import com.guru99.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentGatewaySteps extends BaseClass {

	@Given("The user should be in payment page")
	public void the_user_should_be_in_payment_page() {
		loadUrl("http://demo.guru99.com/payment-gateway/");
			   }

	@When("The user click buy button it should navigate to payment process")
	public void the_user_click_buy_button_it_should_navigate_to_payment_process() {
		PaymentGatewayPage payment=new PaymentGatewayPage();
		btnClick(payment.getBtnbuynow());
	
	}

	@When("the user fill in the card details <{string}>,<{string}>,<{string}>,<{string}> and click pay")
	public void the_user_fill_in_the_card_details_and_click_pay(String cardno, String expmnth, String expyear, String cvv) {
		PaymentGatewayPage payment=new PaymentGatewayPage();
		send(payment.getTxtcardno(), cardno);
		send(payment.getDdnmonth(), expmnth);
		send(payment.getDdnyear(), expyear);
		send(payment.getTxtcvv(), cvv);
		btnClick(payment.getBtnsubmit());
   
	
	}

	@Then("it should display payment successful message")
	public void it_should_display_payment_successful_message() {
		PaymentGatewayPage payment=new PaymentGatewayPage();
		boolean b = driver.getPageSource().contains("orderid");	
	System.out.println(b);   
	}


}
