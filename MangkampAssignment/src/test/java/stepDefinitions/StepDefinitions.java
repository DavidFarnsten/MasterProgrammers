package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
		String input = "";
		double result;
	
		@Given("I am a sports administrator")
		public void i_am_a_sports_administrator() {
		    System.out.println("First");
		}

		@When("I register an {athlete}")
		public void i_register_an_name1(String name1) {
			System.out.println("First");
			
			input = name1;
			//input av namn p� atlet
		}

		@When("I register their {int}")
		public void i_register_their(Integer int1) {
			System.out.println("First");
			//ekvation f�r B-P
			double A = 25.4347;
			double B = 18;
			double C = 1.81;
			double x = B-int1;
			double i = Math.pow(x, C);
			double resultekv = i*A;
			int result = (int)resultekv;
			System.out.println(result);
			
			
		//	result = Math.pow(1.81, (25.4347(18-10)));
			//Skriver in po�ngen fr�n grenen
		}
		
		@Then("I want to see the total score")
		public void i_want_to_see_the_total_score() {
			System.out.println("First");
			
			//Int Po�ng = (A(B-P)^C)
			//Utr�kning sker fr�n sparade v�rden och vi f�r po�ngen sparade
		}
		
		//metoder h�r???
}

