package calculator.stepdefinitions;

import calculator.actions.HistoryActions;
import calculator.domain.RecordedOperation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ShowHistoryStepDefinitions {

    @DataTableType
    public RecordedOperation convert(Map<String, String> tableRow) {
        return new RecordedOperation(
                tableRow.get("Expression"),
                tableRow.get("Result")
        );
    }

    @Steps
    HistoryActions historyActions;

    @Then("the calculation history should contain:")
    public void the_calculation_history_should_contain(List<RecordedOperation> expectedHistory) {
        assertThat(historyActions.history()).containsExactlyElementsOf(expectedHistory);
    }
}
