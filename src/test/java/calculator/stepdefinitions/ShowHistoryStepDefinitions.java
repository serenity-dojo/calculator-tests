package calculator.stepdefinitions;

import calculator.domain.RecordedOperation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class ShowHistoryStepDefinitions {

    @DataTableType
    public RecordedOperation convert(Map<String, String> tableRow) {
        return new RecordedOperation(
                tableRow.get("Operation"),
                tableRow.get("Result")
        );
    }

    @Given("the calculation history should contain:")
    public void matt_a_maths_student_has_opened_the_calculator(List<RecordedOperation> history) {
    }
}
