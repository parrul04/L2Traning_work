package stepdefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchstepdef {

	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step1 : I have a search field on Amazon page");
	}

	@When("I search for a product {string} and price {int}")
	public void i_search_for_a_product_and_price(String productName, Integer ProductPrice) {
		System.out.println("Step2 : I search for a product" + productName + 
				" and price " + ProductPrice);
	}

	@Then("The product with anme {string} should displayed")
	public void the_product_with_anme_should_displayed(String productName) {
		System.out.println("Step3 :The product with anme "  + productName + " should displayed");
	}
}
