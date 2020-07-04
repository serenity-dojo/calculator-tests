package calculator.actions;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;

public class CalculaterForm {
    public static final By LEFT_OPERAND = ByAngular.model("first");
    public static final By OPERATOR = ByAngular.model("operator");
    public static final By RIGHT_OPERAND = ByAngular.model("second");
    public static final By GO_BUTTON = By.id("gobutton");
    public static final By RESULT = By.tagName("h2");
}
