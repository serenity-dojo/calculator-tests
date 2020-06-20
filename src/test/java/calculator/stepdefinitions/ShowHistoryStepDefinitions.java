package calculator.stepdefinitions;

import calculator.actions.HistoryActions;
import calculator.domain.RecordedOperation;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;

import java.util.List;
import java.util.Map;

public class ShowHistoryStepDefinitions {

    @Steps
    HistoryActions historyActions;

    @DataTableType
    public RecordedOperation convert(Map<String, String> tableRow) {
        return new RecordedOperation(
                tableRow.get("Expression"),
                tableRow.get("Result")
        );
    }

    @Then("the calculation history should contain:")
    public void the_calculation_history_should_contain(List<RecordedOperation> expectedHistory) {
        Assertions.assertThat(historyActions.history()).containsExactlyElementsOf(expectedHistory);
    }
}
