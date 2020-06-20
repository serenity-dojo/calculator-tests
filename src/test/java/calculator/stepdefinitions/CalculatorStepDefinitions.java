package calculator.stepdefinitions;

import calculator.domain.MathsOperation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class CalculatorStepDefinitions {

    @Given("Matt a maths student has opened the calculator")
    public void matt_a_maths_student_has_opened_the_calculator() {
    }

    @DataTableType
    public MathsOperation convert(Map<String, String> tableRow) {
        return new MathsOperation(
                tableRow.get("Left Operand"),
                tableRow.get("Operator"),
                tableRow.get("Right Operand")
        );
    }

    @When("^Matt (?:performs|has performed) the following calculations?:$")
    public void matt_performs_the_following_calculation(List<MathsOperation> operations) {
    }

    @Then("he should see a result of {string}")
    public void he_should_see_a_result_of(String expectedResult) {
    }
}
