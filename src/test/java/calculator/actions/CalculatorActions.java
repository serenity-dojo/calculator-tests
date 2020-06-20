package calculator.actions;

import calculator.domain.MathsOperation;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class CalculatorActions extends UIInteractionSteps {
    @Step("Open the calculator")
    public void openApplication() {
        openUrl("https://juliemr.github.io/protractor-demo/");
    }

    @Step("Perform operation {0}")
    public void perform(MathsOperation operation) {
        $(CalculaterForm.LEFT_OPERAND).sendKeys(operation.getLeftOperand());
        $(CalculaterForm.OPERATOR).selectByVisibleText(operation.getOperator());
        $(CalculaterForm.RIGHT_OPERAND).sendKeys(operation.getRightOperand());
        $(CalculaterForm.GO_BUTTON).click();
        waitForAngularRequestsToFinish();
    }

    public String result() {
        return $(CalculaterForm.RESULT).getText();
    }
}
