package calculator.actions;

import calculator.domain.MathsOperation;
import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static calculator.actions.CalculaterForm.*;

public class CalculateActions extends UIInteractionSteps {

    @Step("Enters {0} and clicks Go")
    public void calculate(MathsOperation operation) {
        $(LEFT_OPERAND).sendKeys(operation.getLeftOperand());
        $(OPERATOR).selectByVisibleText(operation.getOperator());
        $(RIGHT_OPERAND).sendKeys(operation.getRightOperand());
        $(GO_BUTTON).click();
        waitForAngularRequestsToFinish();
    }

    public String result() {
        return $(RESULT).getText();
    }
}
