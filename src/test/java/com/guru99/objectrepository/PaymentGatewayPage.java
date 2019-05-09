package com.guru99.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.resources.BaseClass;

public class PaymentGatewayPage {
	
	public PaymentGatewayPage() {
PageFactory.initElements(BaseClass.driver, this);
}
	
	@FindBy(xpath="//*[@value='Buy Now']")
	private WebElement btnbuynow;
	
	public WebElement getBtnbuynow() {
		return btnbuynow;
	}

	public WebElement getTxtcardno() {
		return txtcardno;
	}

	public WebElement getDdnmonth() {
		return ddnmonth;
	}

	public WebElement getDdnyear() {
		return ddnyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	@FindBy(id="card_nmuber")
	private WebElement txtcardno;

	@FindBy(id="month")
	private WebElement ddnmonth;

	@FindBy(id="year")
	private WebElement ddnyear;

	@FindBy(id="cvv_code")
	private WebElement txtcvv;

	@FindBy(name="submit")
	private WebElement btnsubmit;
	
	@FindBy(xpath="//tbody//tr//td[2]//h3//strong")
private WebElement orderid;

}
