package calculator.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalculatorStepDefinitions {

    @Given("Matt a maths student has opened the calculator")
    public void matt_a_maths_student_has_opened_the_calculator() {
    }
    @Then("he should see a result of {string}")
    public void he_should_see_a_result_of(String expectedResult) {
    }
}
